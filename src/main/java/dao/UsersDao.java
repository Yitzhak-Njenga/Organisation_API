package dao;


import models.Users;

import java.util.List;

public interface UsersDao {
    void save(Users users);

    List<Users> allUsers();

    Users findbyId(int id);
}

