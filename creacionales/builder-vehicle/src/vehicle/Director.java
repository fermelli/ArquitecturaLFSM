package vehicle;

/**
 *
 * @author fermelli
 */
public class Director {

    IBuilder builder;

    public void construct(IBuilder builder) {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}
