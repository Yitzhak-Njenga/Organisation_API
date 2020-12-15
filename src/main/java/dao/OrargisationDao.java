package dao;

import models.Department;

import java.util.List;


public interface OrargisationDao  {
    void save(Department department);

    List<Department> allDepartments();

     Department findbyId(int id);
}
