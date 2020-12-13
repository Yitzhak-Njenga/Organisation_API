package models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id &&
                deptid == news.deptid &&
                Objects.equals(wriitenBy, news.wriitenBy) &&
                Objects.equals(cotent, news.cotent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wriitenBy, cotent, deptid);
    }
}
