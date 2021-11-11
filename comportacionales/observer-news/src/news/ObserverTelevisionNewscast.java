package news;

/**
 *
 * @author fermelli
 */
public class ObserverTelevisionNewscast implements IObserver {

    private String observerName;
    private int channel;
    private String newsItem;
    private Subject subject;

    public ObserverTelevisionNewscast(Subject subject, String observerName, int channel) {
        this.subject = subject;
        this.observerName = observerName;
        this.channel = channel;
        subject.registerObserver(this);
    }

    @Override
    public void update(String newsItem) {
        this.newsItem = newsItem;
        display();
    }

    public void display() {
        System.out.println(String.format("El noticiero \"%s\" del canal %d recibio la noticia:\n%s", observerName, channel, newsItem));
    }
}
