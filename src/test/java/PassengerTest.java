import model.Aircraft;
import model.City;
import model.Passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerTest {

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

    @Test
    public void testParameterizedConstructor() {
        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000, new ArrayList<>(), new ArrayList<>());
        List<Aircraft> aircraftList = new ArrayList<>();

        Passenger passenger = new Passenger(1, "Kateryna", "Danevych", "123456789", city, aircraftList);

        assertEquals(1, passenger.getId());
        assertEquals("Kateryna", passenger.getFirstName());
        assertEquals("Danevych", passenger.getLastName());
        assertEquals("123456789", passenger.getPhoneNumber());
        assertEquals(city, passenger.getCity());
        assertEquals(aircraftList, passenger.getAircraftList());
    }

    @Test
    public void testSettersAndGetters() {
        Passenger passenger = new Passenger();
        passenger.setId(1);
        passenger.setFirstName("Oleh");
        passenger.setLastName("Olenev");
        passenger.setPhoneNumber("987654321");

        City city = new City(2L, "Lviv", "Lviv Province", 720000, new ArrayList<>(), new ArrayList<>());
        passenger.setCity(city);

        List<Aircraft> aircraftList = new ArrayList<>();
        passenger.setAircraftList(aircraftList);

        assertEquals(1, passenger.getId());
        assertEquals("Oleh", passenger.getFirstName());
        assertEquals("Olenev", passenger.getLastName());
        assertEquals("987654321", passenger.getPhoneNumber());
        assertEquals(city, passenger.getCity());
        assertEquals(aircraftList, passenger.getAircraftList());
    }
}

