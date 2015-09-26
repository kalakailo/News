package news.domain.entities;

/**
 * Created by �������� on 25.09.2015.
 */
 public class   News {
    private long id;
    private String name;

    public News(){}

    public News(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
