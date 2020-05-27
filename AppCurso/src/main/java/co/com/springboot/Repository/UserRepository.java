package co.com.springboot.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.springboot.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	
}
