

import model.Aircraft;
import model.City;
import model.Passenger;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testGettersAndSetters() {
        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000);
        Aircraft aircraft1 = new Aircraft();
        aircraft1.setId(1);


        Aircraft aircraft2 = new Aircraft();
        aircraft2.setId(2);


        List<Aircraft> aircraftList = new ArrayList<>();
        aircraftList.add(aircraft1);
        aircraftList.add(aircraft2);

        Passenger passenger = new Passenger();
        passenger.setId(1);
        passenger.setFirstName("John");
        passenger.setLastName("Doe");
        passenger.setPhoneNumber("1234567890");
        passenger.setCity(city);
        passenger.setAircraftList(aircraftList);

        assertEquals(1, passenger.getId());
        assertEquals("John", passenger.getFirstName());
        assertEquals("Doe", passenger.getLastName());
        assertEquals("1234567890", passenger.getPhoneNumber());
        assertEquals(city, passenger.getCity());
        assertEquals(aircraftList, passenger.getAircraftList());
    }

    @Test
    public void testDefaultConstructor() {
        Passenger passenger = new Passenger();
        assertEquals(0, passenger.getId());
        assertNull(passenger.getFirstName());
        assertNull(passenger.getLastName());
        assertNull(passenger.getPhoneNumber());
        assertNull(passenger.getCity());
        assertNull(passenger.getAircraftList());
    }
}
