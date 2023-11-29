
public class Main {
    public static MyArrayList<Plane> myArrayList = new MyArrayList<>();

    public static void main(String[] args) {
        PassangerPlane passengerPlane = new PassangerPlane("Boeing-747", 250, 9000, 45.5, 90, 5, 12, 3, "Joe");
        PassangerPlane passengerPlane1 = new PassangerPlane("IL-76", 150, 4500, 61.5, 92, 4, 10, 5, "Ivan");
        SportPlane sportPlane = new SportPlane("Cessna-147", 2, 400, 2.5, 3, 3, 4, 1, 400);
        TransportPlane transportPlane = new TransportPlane("AN-224", 4, 6500, 65.5, 120, 20, 45, 5, 1986);
        CargoPlane cargoPlane = new CargoPlane("Boeing-240", 3, 7000, 60, 15, 40, 40, 4, true);
        CargoPlane cargoPlane1 = new CargoPlane("Boeing-240(2)", 3, 8200, 49, 12, 35, 15, 5, false);

        Airline.add(passengerPlane);
        Airline.add(passengerPlane1);
        Airline.add(sportPlane);
        Airline.add(transportPlane);
        Airline.add(cargoPlane);
        Airline.add(cargoPlane1);

        Airline.printAllPlanes();
        System.out.println("-----------------------------------");

        Airline.sumOfPassengerSeats();
        System.out.println("-----------------------------------");

        Airline.sumOfAmountOfCargo();
        System.out.println("-----------------------------------");

        Airline.sortByMaxDistance();
        System.out.println("-----------------------------------");

        System.out.println("\t> Dynamic polymorphism: ");
        Airline.displayInfo(passengerPlane);
        Airline.displayInfo(sportPlane);
        Airline.displayInfo(transportPlane);
        Airline.displayInfo(cargoPlane);

        Airline.displayTypeOfPlane(passengerPlane);
        Airline.displayTypeOfPlane(sportPlane);
        Airline.displayTypeOfPlane(transportPlane);
        Airline.displayTypeOfPlane(cargoPlane);
        System.out.println("-----------------------------------");

        System.out.println(Airline.searchPlaneByFuelConsumption(2.5));
        System.out.println(Airline.searchPlaneByFuelConsumption(16.5));
        System.out.println("-----------------------------------");

        System.out.println(Airline.searchPlaneInCompany(cargoPlane));
        System.out.println(Airline.searchPlaneInCompany(cargoPlane1));
        System.out.println("-----------------------------------");

        myArrayList.addAll(Airline.getArrayOfPlanes());

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
