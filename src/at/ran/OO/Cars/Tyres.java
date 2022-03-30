package at.ran.OO.Cars;

public class Tyres {
    private int size;
    private int tyreProfile;

    public Tyres(int size, int tyreProfile) {
        this.size = size;
        this.tyreProfile = tyreProfile;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTyreProfile() {
        return tyreProfile;
    }

    public void setTyreProfile(int tyreProfile) {
        this.tyreProfile = tyreProfile;
    }
}
