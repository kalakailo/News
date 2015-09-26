package news.data.data_factory;

import news.domain.entities.News;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by �������� on 25.09.2015.
 */
public class DataBaseFactory {
    private static DataBaseFactory factory;

    private DataBaseFactory(){
    }

    public static DataBaseFactory getInstance(){
        if (factory == null){
            factory = new DataBaseFactory();
        }
        return factory;
    }
    public List<News>getNewses(){

        List<News> newses = new ArrayList<News>();
        for (int i = 0;i <8;i++){
            newses.add(new News(i,"Новина" + i));
        }
        return newses;
    }
}
