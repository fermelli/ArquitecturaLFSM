package classicimplementation;

/**
 *
 * @author fermelli
 */
public class TextStore implements IStore {

    @Override
    public void save(String data) {
        System.out.println("Called 'save' from TextStore with data=" + data);
    }

}
