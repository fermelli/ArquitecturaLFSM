package classicimplementation;

/**
 *
 * @author fermelli
 */
public class ProxyTextStore implements IStore {

    private TextStore textStore;

    public ProxyTextStore() {
    }

    @Override
    public void save(String data) {
        System.out.println("Called 'save' from ProxyTextStore with data=" + data);

        if (textStore == null) {
            System.out.println("Lazy init: textStore.");
            textStore = new TextStore();
        }
        textStore.save(data);
    }
}
