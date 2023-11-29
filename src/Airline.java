import java.util.Arrays;
import java.util.Comparator;

public class Airline {
    public static Plane[] allPlanes = new Plane[]{};
    //

    public Airline() {
    }

    public static void add(Plane plane) {
        if (allPlanes.length == 0) {
            allPlanes = new Plane[]{plane};
        } else {
            Plane[] allPlanes = new Plane[Airline.allPlanes.length + 1];
            System.arraycopy(Airline.allPlanes, 0, allPlanes, 0, Airline.allPlanes.length);
            allPlanes[allPlanes.length - 1] = plane;
            Airline.allPlanes = allPlanes;
        }
    }

    public static void printAllPlanes() {
        for (Plane plane : allPlanes) {
            System.out.println(plane);
        }
    }

    public static void sumOfPassengerSeats() {
        int sum = 0;
        for (Plane planes : allPlanes) {
            sum += planes.getAmountOfPassenger();
        }
        System.out.println("Sum of all passenger seats: " + sum);
    }

    public static void sumOfAmountOfCargo() {
        int sum = 0;
        for (Plane planes : allPlanes) {
            sum += planes.getAmountOfCargo();
        }
        System.out.println("Sum of cargo of all planes: " + sum + "tons");
    }

    public static void sortByMaxDistance() {
        System.out.println("\t> Sort by max distance: ");
        Arrays.sort(allPlanes, Comparator.comparingInt(Plane::getMaxDist));
        Airline.printAllPlanes();
    }

    public static void displayInfo(Plane plane) {
        System.out.println(plane.displayInfo());
    }

    public static void displayTypeOfPlane(Plane plane) {
        System.out.println(plane.displayTypeOfPlane());
    }

    public static String searchPlaneByFuelConsumption(double valueOfFuelConsumption) {
        for (Plane plane : allPlanes) {
            if (valueOfFuelConsumption == plane.getFuelConsumption()) {
                return "Fuel consumption by value: " + valueOfFuelConsumption + ", plane found: " + plane;
            }
        }
        return "Nothing were found by value: " + valueOfFuelConsumption;
    }

    public static String searchPlaneInCompany(Plane searchPlane) {
        for (Plane plane : allPlanes) {
            if ((plane.hashCode() == searchPlane.hashCode() && (plane.equals(searchPlane)))) {
                return "plane is found, it is a " + plane;
            }
        }
        return "plane is not found";
    }

    public static Plane[] getArrayOfPlanes() {
        return allPlanes;
    }
}
