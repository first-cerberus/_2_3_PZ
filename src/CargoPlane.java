import java.util.Objects;

public class CargoPlane extends Plane {
    private boolean availabilityExtraTanks;

    public CargoPlane() {
    }

    public CargoPlane(String name, int amountOfPassenger, int maxDist, double fuelConsumption, int amountOfCargo, int length, int width, int height, boolean availabilityExtraTanks) {
        super(name, amountOfPassenger, maxDist, fuelConsumption, amountOfCargo, length, width, height);
        this.availabilityExtraTanks = availabilityExtraTanks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return availabilityExtraTanks == that.availabilityExtraTanks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), availabilityExtraTanks);
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "name='" + getName() + '\'' +
                ", amountOfPassenger=" + getAmountOfPassenger() +
                ", maxDist=" + getMaxDist() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", amountOfCargo=" + getAmountOfCargo() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", availabilityExtraTanks=" + availabilityExtraTanks +
                '}';
    }

    @Override
    public String displayInfo() {
        return "availabilityExtraTanks: " + availabilityExtraTanks;
    }
    @Override
    protected String displayTypeOfPlane(){
        return "It`s a cargo plane";
    }
}

