package my.antonov.dao;

import my.antonov.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alex on 01.05.2018.
 */
public interface RoleDao extends JpaRepository<Role, Long> {
}
