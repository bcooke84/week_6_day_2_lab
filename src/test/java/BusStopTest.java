import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BusStopTest {

    BusStop busStop1;
    Person person1;
    Person person2;
    Bus bus1;

    @Before
    public void before() {
        busStop1 = new BusStop("Renfrew Street");
        person1 = new Person();
        person2 = new Person();
        bus1 = new Bus("Glasgow", 5);
    }

    @Test
    public void addPersonToQueue() {
        busStop1.addPersonToQueue(person1);
        assertEquals(1, busStop1.countQueue());
    }

    @Test
    public void removePersonFromQueue() {
        busStop1.addPersonToQueue(person1);
        Person newPerson = busStop1.removePersonFromQueue();
        assertNotNull(newPerson);
    }



}
