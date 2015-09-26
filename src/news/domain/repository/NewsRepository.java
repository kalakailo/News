package news.domain.repository;

import news.domain.entities.News;

import java.util.List;

/**
 * Created by Михайлик on 25.09.2015.
 */
public interface NewsRepository {

    List<News> getNewses();
    News getNews(long id);

}
