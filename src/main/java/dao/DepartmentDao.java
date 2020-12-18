package dao;

import models.Department;

import java.util.List;


public interface DepartmentDao {
    void save(Department department);

    List<Department> allDepartments();

     Department findbyId(int id);
}
