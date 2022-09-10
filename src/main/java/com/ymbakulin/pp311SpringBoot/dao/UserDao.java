package com.ymbakulin.pp311SpringBoot.dao;

import com.ymbakulin.pp311SpringBoot.model.User;
import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(long id);

    void removeUserById(long id);

    List<User> getAllUsers();

}
