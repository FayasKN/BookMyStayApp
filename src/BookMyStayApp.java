abstract class Room {

    private int numberOfBeds;
    private int squareFeet;
    private double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}

class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 200, 100.0);
    }
}

class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 350, 180.0);
    }
}

class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 600, 300.0);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialiazation");


        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleRoomAvailability = 10;
        int doubleRoomAvailability = 5;
        int suiteRoomAvailability = 2;

        System.out.println("\nSingle Room Details");
        System.out.println("Beds: " + singleRoom.getNumberOfBeds());
        System.out.println("Size: " + singleRoom.getSquareFeet() + " sq.ft");
        System.out.println("Price per Night: $" + singleRoom.getPricePerNight());
        System.out.println("Available Rooms: " + singleRoomAvailability);

        System.out.println("\nDouble Room Details");
        System.out.println("Beds: " + doubleRoom.getNumberOfBeds());
        System.out.println("Size: " + doubleRoom.getSquareFeet() + " sq.ft");
        System.out.println("Price per Night: $" + doubleRoom.getPricePerNight());
        System.out.println("Available Rooms: " + doubleRoomAvailability);

        System.out.println("\nSuite Room Details");
        System.out.println("Beds: " + suiteRoom.getNumberOfBeds());
        System.out.println("Size: " + suiteRoom.getSquareFeet() + " sq.ft");
        System.out.println("Price per Night: $" + suiteRoom.getPricePerNight());
        System.out.println("Available Rooms: " + suiteRoomAvailability);


    }
}