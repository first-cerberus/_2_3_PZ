import java.util.Objects;

public abstract class Plane {
    private String name;
    private int amountOfPassenger;
    private int maxDist;
    private double fuelConsumption;
    private int amountOfCargo;
    private int length;
    private int width;
    private int height;

    public Plane() {
    }

    public Plane(String name, int amountOfPassenger, int maxDist, double fuelConsumption, int amountOfCargo, int length, int width, int height) {
        this.name = name;
        this.amountOfPassenger = amountOfPassenger;
        this.maxDist = maxDist;
        this.fuelConsumption = fuelConsumption;
        this.amountOfCargo = amountOfCargo;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return amountOfPassenger == plane.amountOfPassenger && maxDist == plane.maxDist && Double.compare(plane.fuelConsumption, fuelConsumption) == 0 && amountOfCargo == plane.amountOfCargo && length == plane.length && width == plane.width && height == plane.height && Objects.equals(name, plane.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfPassenger, maxDist, fuelConsumption, amountOfCargo, length, width, height);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", amountOfPassenger=" + amountOfPassenger +
                ", maxDist=" + maxDist +
                ", fuelConsumption=" + fuelConsumption +
                ", amountOfCargo=" + amountOfCargo +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAmountOfPassenger() {
        return amountOfPassenger;
    }

    public int getMaxDist() {
        return maxDist;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getAmountOfCargo() {
        return amountOfCargo;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public abstract String displayInfo();
    protected abstract String displayTypeOfPlane();
}
