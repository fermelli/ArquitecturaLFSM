package vehicle;

/**
 *
 * @author fermelli
 */
public class MotorCycle implements IBuilder {

    private String brandName;
    private Product product;

    public MotorCycle(String brand) {
        product = new Product();
        this.brandName = brand;
    }

    public void startUpOperations() {
    }

    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    public void insertWheels() {
        product.add("2 wheels are added");
    }

    public void addHeadlights() {
        product.add("1 Headlights are added");
    }

    public void endOperations() {
        product.add(String.format("Motorcycle model is :%s", this.brandName));
    }

    public Product getVehicle() {
        return product;
    }
}
