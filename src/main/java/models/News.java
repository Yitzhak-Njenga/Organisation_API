package models;

import java.util.Objects;

public class News {
    private int id;
    private String writtenby ;
    private String content;

    News(String writtenby , String content) {
        this.writtenby  = writtenby ;
        this.content = content;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getwrittenby () {
        return writtenby ;
    }

    public void setwrittenby (String writtenby ) {
        this.writtenby  = writtenby ;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
