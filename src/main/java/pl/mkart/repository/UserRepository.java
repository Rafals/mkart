package pl.mkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mkart.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
