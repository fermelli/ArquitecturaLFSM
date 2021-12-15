package vehicle;

/**
 *
 * @author fermelli
 */
public interface IBuilder {

    void startUpOperations();

    void buildBody();

    void insertWheels();

    void addHeadlights();

    void endOperations();

    Product getVehicle();
}
