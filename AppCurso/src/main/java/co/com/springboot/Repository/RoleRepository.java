package co.com.springboot.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.springboot.Entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {

}
