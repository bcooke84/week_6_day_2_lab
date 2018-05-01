import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop1) {
        if (this.passengerCount() < this.capacity) {
            this.passengers.add(busStop1.removePersonFromQueue()); }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }


}
