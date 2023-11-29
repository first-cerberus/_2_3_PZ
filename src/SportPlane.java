import java.util.Objects;

public class SportPlane extends Plane {
    private int maxSpeed;

    public SportPlane() {
    }

    public SportPlane(String name, int amountOfPassenger, int maxDist, double fuelConsumption, int amountOfCargo, int length, int width, int height, int maxSpeed) {
        super(name, amountOfPassenger, maxDist, fuelConsumption, amountOfCargo, length, width, height);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportPlane that = (SportPlane) o;
        return maxSpeed == that.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "SportPlane{" +
                "name='" + getName() + '\'' +
                ", amountOfPassenger=" + getAmountOfPassenger() +
                ", maxDist=" + getMaxDist() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", amountOfCargo=" + getAmountOfCargo() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public String displayInfo() {
        return "maxSpeed: " + maxSpeed;
    }
    @Override
    protected String displayTypeOfPlane(){
        return "It`s a sport plane";
    }
}

