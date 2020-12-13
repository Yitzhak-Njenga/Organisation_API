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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWriitenBy() {
        return wriitenBy;
    }

    public void setWriitenBy(String wriitenBy) {
        this.wriitenBy = wriitenBy;
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
