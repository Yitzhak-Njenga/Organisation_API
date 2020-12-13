package models;

public class News {
    private int id;
    private String wriitenBy;
    private String cotent;
    private int deptid;

    public News(String wriitenBy, String cotent, int deptid) {
        this.wriitenBy = wriitenBy;
        this.cotent = cotent;
        this.deptid = deptid;
    }
}
