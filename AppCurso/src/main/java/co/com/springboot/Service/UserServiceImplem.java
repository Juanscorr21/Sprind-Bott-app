package co.com.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.springboot.Entity.User;
import co.com.springboot.Repository.UserRepository;

@Service
public class UserServiceImplem implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}
}
