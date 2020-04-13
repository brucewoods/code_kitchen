package wannaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wannaapp.model.User;

public interface UserRepository  extends JpaRepository<User,Long> {
	
	 
}
