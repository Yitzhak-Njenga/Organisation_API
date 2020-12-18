package dao;

import models.News;

import java.util.List;

public interface NewDao {
        void save(News news);

        List<News> allNews();

        News findbyId(int id);
}
