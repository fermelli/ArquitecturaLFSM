package main;

import news.ObserverJournal;
import news.ObserverTelevisionNewscast;
import news.Subject;

/**
 *
 * @author fermelli
 */
public class NewsSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Subject subject = new Subject();

        new ObserverJournal(subject, "Correo del Sur");
        new ObserverJournal(subject, "El Deber");
        new ObserverTelevisionNewscast(subject, "Al Día", 9);
        new ObserverTelevisionNewscast(subject, "Telepaís", 36);

        subject.setNewsItem("Arce dice que la oposición a la Ley 1386 es un pretexto de la derecha para evitar juicios por la crisis de 2019");
    }

}
