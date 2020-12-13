package models;

public class Users {

    private int id;
    private String name;
    private String position;
    private int deptId;
    private String roles;


    public Users(String name, String position, int deptId, String roles) {
        this.name = name;
        this.position = position;
        this.deptId = deptId;
        this.roles = roles;
    }
}
