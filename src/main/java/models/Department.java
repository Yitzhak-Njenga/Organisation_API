package models;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Objects;

public class Department {

    private int id;
    private String description;
    private String deptname;
    private int empnumber;

    public Department(String description, String deptname, int empnumber) {
        this.description = description;
        this.deptname = deptname;
        this.empnumber = empnumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getEmpnumber() {
        return empnumber;
    }

    public void setEmpnumber(int empnumber) {
        this.empnumber = empnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                empnumber == that.empnumber &&
                Objects.equals(description, that.description) &&
                Objects.equals(deptname, that.deptname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, deptname, empnumber);
    }
}

