package news.ui.presenter;

import news.domain.entities.News;
import news.domain.repository.NewsRepository;
import news.ui.NewsListView.NewsListView;

import java.util.List;

/**
 * Created by Михайлик on 25.09.2015.
 */
public class NewsListPresenterImpl implements NewsListPresenter {
    private NewsListView newsListView;
    private NewsRepository repository;

    public NewsListPresenterImpl(NewsListView newsListView, NewsRepository repository){
        this.newsListView = newsListView;
        this.repository = repository;

    }



    @Override
    public void showNewses() {
        List<News> list = repository.getNewses();
        newsListView.showNewses(list);

    }
}
