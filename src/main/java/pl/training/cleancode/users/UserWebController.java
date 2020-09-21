package pl.training.cleancode.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserWebController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("add-user.html")
    public ModelAndView addUser() {
        var modelAndView = new ModelAndView("add-user");
        modelAndView.addObject(new User());
        return modelAndView;
    }

    @PostMapping("add-user.html")
    public String saveUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-user";
        }
        userService.add(user);
        return "redirect:show-users.html";
    }

    @GetMapping("show-users.html")
    public ModelAndView showUsers(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "5") int pageSize) {
        var users = userService.getAll(pageNumber, pageSize);
        var modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

}
