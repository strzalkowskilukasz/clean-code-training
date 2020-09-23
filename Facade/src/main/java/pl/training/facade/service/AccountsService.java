package pl.training.facade.service;

import pl.training.facade.model.User;
import pl.training.facade.service.AccountActivator;
import pl.training.facade.service.UsersRepository;

public class AccountsService {
	
	private UsersRepository usersRepository;
	private AccountActivator accountActivator;
	
	public AccountsService(UsersRepository usersRepository, AccountActivator accountActivator) {
		this.usersRepository = usersRepository;
		this.accountActivator = accountActivator;
	}

	public void addUser(String firstName, String lastName) {
		User user = new User(firstName, lastName);
		usersRepository.add(user);
		accountActivator.sendActivationLink();
	}

}
