package my.antonov.dao;

import my.antonov.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alex on 01.05.2018.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByusername(String username);
}
