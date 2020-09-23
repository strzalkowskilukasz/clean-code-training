package pl.training.facade.service;

import pl.training.facade.model.User;

public interface UsersRepository {
	
	Long add(User user);
	
	User get(Long id);

}
