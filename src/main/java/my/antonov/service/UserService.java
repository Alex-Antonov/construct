package my.antonov.service;

import my.antonov.model.entities.User;

/**
 * Created by alex on 01.05.2018.
 */
public interface UserService {

    void save(User user);

    User findByusername(String username);
}
