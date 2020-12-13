package models;

import com.sun.org.apache.xpath.internal.objects.XString;

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
}

