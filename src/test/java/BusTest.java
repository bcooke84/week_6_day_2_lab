import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus1;
    BusStop busStop1;
    Person person1;
    Person person2;
    Person person3;
    Person person4;

    @Before
    public void before() {
        bus1 = new Bus("Glasgow", 3);
        busStop1 = new BusStop("Renfrew St");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
    }

    @Test
    public void noPassengersOnBus() {
        assertEquals(0, bus1.passengerCount());
    }

    @Test
    public void somePassengersOnBus() {
        busStop1.addPersonToQueue(person1);
        bus1.addPassenger(busStop1);
        assertEquals(1, bus1.passengerCount());
    }

    @Test
    public void busFull() {
        busStop1.addPersonToQueue(person1);
        busStop1.addPersonToQueue(person2);
        busStop1.addPersonToQueue(person3);
        bus1.addPassenger(busStop1);
        bus1.addPassenger(busStop1);
        bus1.addPassenger(busStop1);
        bus1.addPassenger(busStop1);
        assertEquals(3, bus1.passengerCount());
    }

    @Test
    public void removePassengerFromBus() {
        busStop1.addPersonToQueue(person1);
        busStop1.addPersonToQueue(person2);
        busStop1.addPersonToQueue(person3);
        bus1.addPassenger(busStop1);
        bus1.addPassenger(busStop1);
        bus1.addPassenger(busStop1);
        bus1.removePassenger();
        assertEquals(2, bus1.passengerCount());
    }



}
