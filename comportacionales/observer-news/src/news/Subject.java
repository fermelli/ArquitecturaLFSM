package news;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fermelli
 */
public class Subject implements ISubject {

    private List<IObserver> observers;
    private String newsItem;

    public Subject() {
        this.observers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(newsItem);
        }
    }

    public void addedNewsItem() {
        notifyObservers();
    }

    public void setNewsItem(String newsItem) {
        this.newsItem = newsItem;
        addedNewsItem();
    }

}
