package in.codecrescendo.blog.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.codecrescendo.blog.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

	@Query("From User as u where u.userName=:userName")
	public User findByName(@Param(value = "userName") String userName);
	
}
