import java.util.HashMap;

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

    public abstract String getRoomType();
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }

    @Override
    public String getRoomType() {
        return "Single Room";
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }

    @Override
    public String getRoomType() {
        return "Double Room";
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }

    @Override
    public String getRoomType() {
        return "Suite Room";
    }
}

class RoomInventory {
    private HashMap<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
    }

    public void addRoomType(Room room, int count) {
        inventory.put(room.getRoomType(), count);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    public void displayInventoryDetails(Room[] rooms) {
        System.out.println("Hotel Room Inventory Status\n");

        for (Room room : rooms) {
            System.out.println(room.getRoomType() + ":");
            System.out.println("Beds: " + room.getNumberOfBeds());
            System.out.println("Size: " + room.getSquareFeet() + " sqft");
            System.out.println("Price per night: " + room.getPricePerNight());
            System.out.println("Available Rooms: " + getAvailability(room.getRoomType()));
            System.out.println();
        }
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType(single, 5);
        inventory.addRoomType(doubleRoom, 3);
        inventory.addRoomType(suite, 2);

        Room[] rooms = { single, doubleRoom, suite };

        inventory.displayInventoryDetails(rooms);
    }
}