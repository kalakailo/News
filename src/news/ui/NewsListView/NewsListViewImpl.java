package news.ui.NewsListView;

import news.data.repository.NewsRepositoryImpl;
import news.domain.entities.News;
import news.domain.repository.NewsRepository;
import news.ui.presenter.NewsListPresenter;
import news.ui.presenter.NewsListPresenterImpl;

import java.util.List;

/**
 * Created by Михайлик on 25.09.2015.
 */
public class NewsListViewImpl implements NewsListView  {
    private NewsListPresenter presenter;

    public NewsListViewImpl(){
        NewsRepository repository = new NewsRepositoryImpl();
        presenter = new NewsListPresenterImpl(this,repository);
        presenter.showNewses();
        

    }

    @Override
    public void showNewses(List<News> newses) {
        for (News news : newses){
            System.out.println(news.getName());
        }

    }
}
