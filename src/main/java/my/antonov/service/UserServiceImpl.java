package my.antonov.service;

import my.antonov.dao.RoleDao;
import my.antonov.dao.UserDao;
import my.antonov.model.entities.Role;
import my.antonov.model.entities.User;
import my.antonov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by alex on 01.05.2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles  = new HashSet<>();
        roles.add(roleDao.getOne(2L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByusername(String username) {
        return userDao.findByusername(username);
    }
}
