import com.google.gson.Gson;
import dao.Sq2oNewsDao;
import dao.Sql2oDepartmentDao;
import dao.Sql2oUsersDao;

import models.Department;
import models.News;
import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static spark.Spark.*;

public class App {

    public static void main (String[] args){
        Sql2oDepartmentDao departmentDao;
        Sql2oUsersDao userDao;
        Sq2oNewsDao newsDao;
        Connection connection;
        Gson gson = new Gson();

        String connectionString = "jdbc:postgresql://localhost:5432/organisation";
        Sql2o sql2o = new Sql2o(connectionString,"moringa","1234");
        departmentDao = new Sql2oDepartmentDao(sql2o);
        userDao = new Sql2oUsersDao(sql2o);
        newsDao = new Sq2oNewsDao(sql2o);
        connection = sql2o.open();

        //CREATE:ADD NEW DEPARTMENT
        post("department/new","application/json",(request, response) ->{
            Department department =gson.fromJson(request.body(),Department.class);
            departmentDao.save(department);
            response.status(201);
            response.type("application/json");
            return gson.toJson(department);


        });

        get("/department","application/json",(request, response) -> {
            response.type("application/json");
            return gson.toJson(departmentDao.allDepartments());
        });

        post("users/new","application/json",(request, response) -> {
            Users users = gson.fromJson(request.body(), Users.class);
            userDao.save(users);
            response.status(201);
            response.type("application/json");
            return gson.toJson(users);
        });

        get("/users","application/json",(request, response) -> {
            response.type("application/json");
            return gson.toJson(userDao.allUsers());
        });

        post("news/new","application/json",(request, response) -> {
            News news = gson.fromJson(request.body(), News.class);
            newsDao.save(news);
            response.status(201);
            response.type("application/json");
            return gson.toJson(news);
        });
        get("/news", "application/json", (req, res) -> {
            return gson.toJson(newsDao.allNews());
        });

        get("/users","application/json",(request, response) -> {
            response.type("application/json");
            return gson.toJson(userDao.allUsers());
        });

        }
}
