
public class TransportPlane extends Plane {
    private int yearOfRelease;

    public TransportPlane() {
    }

    public TransportPlane(String name, int amountOfPassenger, int maxDist, double fuelConsumption, int amountOfCargo, int length, int width, int height, int yearOfRelease) {
        super(name, amountOfPassenger, maxDist, fuelConsumption, amountOfCargo, length, width, height);
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "TransportPlane{" +
                "name='" + getName() + '\'' +
                ", amountOfPassenger=" + getAmountOfPassenger() +
                ", maxDist=" + getMaxDist() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", amountOfCargo=" + getAmountOfCargo() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    @Override
    public String displayInfo() {
        return "year of release: " + yearOfRelease;
    }
    @Override
    protected String displayTypeOfPlane(){
        return "It`s a transport plane";
    }
}
