package news.ui.NewsListView;

import news.domain.entities.News;

import java.util.List;

/**
 * Created by Михайлик on 25.09.2015.
 */
public interface NewsListView {

    void showNewses(List<News> newses);
}
