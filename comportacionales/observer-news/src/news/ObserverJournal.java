package news;

/**
 *
 * @author fermelli
 */
public class ObserverJournal implements IObserver {

    private String observerName;
    private String newsItem;
    private Subject subject;

    public ObserverJournal(Subject subject, String observerName) {
        this.subject = subject;
        this.observerName = observerName;
        subject.registerObserver(this);
    }

    @Override
    public void update(String newsItem) {
        this.newsItem = newsItem;
        display();
    }

    public void display() {
        System.out.println(String.format("El periódico \"%s\" recibio la noticia:\n%s", observerName, newsItem));
    }
}
