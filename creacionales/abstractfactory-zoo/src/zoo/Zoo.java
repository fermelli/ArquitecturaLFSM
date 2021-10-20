package zoo;

import java.util.List;

public class Zoo {

    private String name;
    private String address;
    private String phone;
    private List<Cage> cages;
    private static Zoo instance;

    public Zoo() {
    }

    public static Zoo getInstance() {

        if (instance == null) {
            return new Zoo();
        }

        return instance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Cage> getCages() {
        return this.cages;
    }

    public void setCages(List<Cage> cages) {
        this.cages = cages;
    }

    @Override
    public String toString() {
        return "{\n" + " Nombre='" + getName() + "'" + ",\n Direccion='" + getAddress() + "'" + ",\n Telefono='"
                + getPhone() + "'" + ",\n Jaulas='" + getCages() + "'" + "\n}";
    }

}
