package my.antonov.service;

/**
 * Created by alex on 01.05.2018.
 */
public interface SecurityService {

    String findLoggedInusername();

    void autoLogin(String username, String password);
}
