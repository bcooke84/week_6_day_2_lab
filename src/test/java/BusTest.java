import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus1;
    Person person1;
    Person person2;
    Person person3;
    Person person4;

    @Before
    public void before() {
        bus1 = new Bus("Glasgow", 3);
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
        bus1.addPassenger(person1);
        bus1.addPassenger(person2);
        bus1.addPassenger(person3);
        assertEquals(3, bus1.passengerCount());
    }

    @Test
    public void busFull() {
        bus1.addPassenger(person1);
        bus1.addPassenger(person2);
        bus1.addPassenger(person3);
        bus1.addPassenger(person4);
        assertEquals(3, bus1.passengerCount());
    }

    @Test
    public void removePassengerFromBus() {
        bus1.addPassenger(person1);
        bus1.addPassenger(person2);
        bus1.addPassenger(person3);
        bus1.removePassenger();
        assertEquals(2, bus1.passengerCount());
    }



}
