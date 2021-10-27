package petshop;

/**
 *
 * @author fermelli
 */
public interface IAnimalFeeder {

    public abstract String dropFood(int hungerLevel, boolean water);

    public abstract String displayFood(int hungerLevel);
}
