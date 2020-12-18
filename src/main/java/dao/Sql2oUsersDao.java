package dao;

import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oUsersDao implements UsersDao {

    private final Sql2o sql2o;


    public Sql2oUsersDao(Sql2o sql2o) {

        this.sql2o = sql2o;

    }


    @Override
    public void save(Users users) {
        String sql = "INSERT INTO users(name, position, deptid, roles) VALUES(:name, :position, :deptid, :roles)";
        try (Connection connection = sql2o.open()) {
            int id = (int) connection.createQuery(sql, true)
                    .bind(users)
                    .executeUpdate()
                    .getKey();
            users.setId(id);
        } catch (SecurityException insert) {
            System.out.println(insert);

        }
    }


    @Override
    public List<Users> allUsers() {
        return null;
    }

    @Override
    public Users findbyId(int id) {
        return null;
    }
}
