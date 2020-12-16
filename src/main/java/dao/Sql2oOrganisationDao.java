package dao;

import models.Department;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oOrganisationDao implements OrargisationDao  {


    private final Sql2o sql2o;


    public Sql2oOrganisationDao(Sql2o sql2o) {

        this.sql2o = sql2o;

    }



    @Override
    public void save(Department department) {

        String sql = "INSERT INTO departments(dept_description, dept_deptname, dept_empnumber) VALUES(:description :dept_deptname :empnumber)";
        try (Connection connection = sql2o.open()) {
            int id = (int) connection.createQuery(sql, true)
                    .bind(department)
                    .executeUpdate()
                    .getKey();
            department.setId(id);
        } catch (SecurityException insert) {
            System.out.println(insert);


        }
    }

    @Override
    public List<Department> allDepartments() {
        String sql ="SELECT * FROM departments";
        try(Connection connection= sql2o.open()){
            return connection.createQuery(sql)
                    .executeAndFetch(Department.class);
        }

    }

    @Override
    public Department findbyId(int id) {
        String sql = "SELECT * departments where id = :id";
        try(Connection connection =sql2o.open()){
            return connection.createQuery(sql)
                    .addParameter("id",id)
                    .executeAndFetchFirst(Department.class);
        }
    }
}
