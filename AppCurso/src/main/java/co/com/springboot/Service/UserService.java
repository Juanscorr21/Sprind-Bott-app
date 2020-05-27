package co.com.springboot.Service;


import co.com.springboot.Entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();
}
