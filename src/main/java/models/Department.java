package models;



import java.util.Objects;

public class Department {

    private int id;
    private String dept_description ;
    private String dept_deptname ;
    private int  dept_empnumber ;

    public Department(String dept_description , String dept_deptname , int  dept_empnumber ) {
        this.dept_description  = dept_description ;
        this.dept_deptname  = dept_deptname ;
        this. dept_empnumber  =  dept_empnumber ;
    }

    public String getdept_description () {
        return dept_description ;
    }

    public void setdept_description (String dept_description ) {
        this.dept_description  = dept_description ;
    }

    public String getdept_deptname () {
        return dept_deptname ;
    }

    public void setdept_deptname (String dept_deptname ) {
        this.dept_deptname  = dept_deptname ;
    }

    public int getdept_empnumber () {
        return  dept_empnumber ;
    }

    public void setdept_empnumber (int  dept_empnumber ) {
        this. dept_empnumber  =  dept_empnumber ;
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
                 dept_empnumber  == that. dept_empnumber  &&
                Objects.equals(dept_description , that.dept_description ) &&
                Objects.equals(dept_deptname , that.dept_deptname );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dept_description , dept_deptname ,  dept_empnumber );
    }
}

