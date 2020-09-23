package pl.training.facade;

import pl.training.facade.service.AccountsService;

public class ServiceFacade {

    private AccountsService accountsService;

    public ServiceFacade(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    public void createAccount(String firstName, String lastName) {
        accountsService.addUser(firstName, lastName);
    }

}
