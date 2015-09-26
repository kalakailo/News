package news.data.repository;

import news.data.data_factory.DataBaseFactory;
import news.domain.entities.News;
import news.domain.repository.NewsRepository;

import java.util.List;

/**
 * Created by Михайлик on 25.09.2015.
 */
public class NewsRepositoryImpl implements NewsRepository {
    @Override
    public List<News> getNewses() {
        return DataBaseFactory.getInstance().getNewses();
    }

    @Override
    public News getNews(long id) {
        return null;
    }
}
