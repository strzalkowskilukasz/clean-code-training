package pl.training.cleancode.users;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsersConfiguration {

    @Bean
    public UserService productService(UsersRepository usersRepository) {
        return new UserService(usersRepository);
    }

}
