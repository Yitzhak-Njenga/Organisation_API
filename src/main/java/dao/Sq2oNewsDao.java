package dao;

import models.News;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sq2oNewsDao implements NewDao {
    private final Sql2o sql2o;

    public Sq2oNewsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void save(News news) {
        String sql = "INSERT INTO news(writtenby, content) VALUES(:writtenby, :content)";
        try (Connection connection = sql2o.open()) {
            int id = (int) connection.createQuery(sql, true)
                    .bind(news)
                    .executeUpdate()
                    .getKey();
            news.setId(id);
        } catch (SecurityException insert) {
            System.out.println(insert);


        }
    }


    @Override
    public List<News> allNews() {
            String sql ="SELECT * FROM news";
            try(Connection connection= sql2o.open()){
                return connection.createQuery(sql)
                        .executeAndFetch(News.class);
            }
    }


    @Override
    public News findbyId(int id) {
        return null;
    }
}