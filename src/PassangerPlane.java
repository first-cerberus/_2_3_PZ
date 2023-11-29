import java.util.Objects;

public class PassangerPlane extends Plane {
    private String nameOfPilot;

    public PassangerPlane() {
    }

    public PassangerPlane(String name, int amountOfPassenger, int maxDist, double fuelConsumption, int amountOfCargo, int length, int width, int height, String nameOfPilot) {
        super(name, amountOfPassenger, maxDist, fuelConsumption, amountOfCargo, length, width, height);
        this.nameOfPilot = nameOfPilot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassangerPlane that = (PassangerPlane) o;
        return Objects.equals(nameOfPilot, that.nameOfPilot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfPilot);
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "name='" + getName() + '\'' +
                ", amountOfPassenger=" + getAmountOfPassenger() +
                ", maxDist=" + getMaxDist() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", amountOfCargo=" + getAmountOfCargo() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", nameOfPilot=" + nameOfPilot +
                '}';
    }
    @Override
    public String displayInfo(){
        return "name of pilot:" + nameOfPilot;
    }
    @Override
    protected String displayTypeOfPlane(){
        return "It`s a passenger plane";
    }

}
