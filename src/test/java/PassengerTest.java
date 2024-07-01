import model.Aircraft;
import model.City;
import model.Passenger;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

//    @Test
//    public void testGettersAndSetters() {
//        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000);
//        Aircraft aircraft1 = new Aircraft();
//        aircraft1.setId(1);
//
//        Aircraft aircraft2 = new Aircraft();
//        aircraft2.setId(2);
//
//        List<Aircraft> aircraftList = new ArrayList<>();
//        aircraftList.add(aircraft1);
//        aircraftList.add(aircraft2);
//
//        Passenger passenger = new Passenger();
//        passenger.setId(1);
//        passenger.setFirstName("John");
//        passenger.setLastName("Doe");
//        passenger.setPhoneNumber("1234567890");
//        passenger.setCity(city);
//        passenger.setAircraftList(aircraftList);
//
//        assertEquals(1, passenger.getId());
//        assertEquals("John", passenger.getFirstName());
//        assertEquals("Doe", passenger.getLastName());
//        assertEquals("1234567890", passenger.getPhoneNumber());
//        assertEquals(city, passenger.getCity());
//        assertEquals(aircraftList, passenger.getAircraftList());
//    }

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

//    @Test
//    public void testParameterizedConstructor() {
//        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000);
//        Aircraft aircraft1 = new Aircraft();
//        aircraft1.setId(1);
//
//        Aircraft aircraft2 = new Aircraft();
//        aircraft2.setId(2);
//
//        List<Aircraft> aircraftList = new ArrayList<>();
//        aircraftList.add(aircraft1);
//        aircraftList.add(aircraft2);
//
//        Passenger passenger = new Passenger(1, "John", "Doe", "1234567890", city, aircraftList);
//
//        assertEquals(1, passenger.getId());
//        assertEquals("John", passenger.getFirstName());
//        assertEquals("Doe", passenger.getLastName());
//        assertEquals("1234567890", passenger.getPhoneNumber());
//        assertEquals(city, passenger.getCity());
//        assertEquals(aircraftList, passenger.getAircraftList());
//    }
//
//    @Test
//    public void testEqualsAndHashCode() {
//        City city1 = new City(1L, "Kyiv", "Kyiv Province", 2804000);
//        City city2 = new City(2L, "Lviv", "Lviv Province", 720000);
//
//        Aircraft aircraft1 = new Aircraft();
//        aircraft1.setId(1);
//
//        Aircraft aircraft2 = new Aircraft();
//        aircraft2.setId(2);
//
//        List<Aircraft> aircraftList1 = new ArrayList<>();
//        aircraftList1.add(aircraft1);
//
//        List<Aircraft> aircraftList2 = new ArrayList<>();
//        aircraftList2.add(aircraft2);
//
//        Passenger passenger1 = new Passenger(1, "John", "Doe", "1234567890", city1, aircraftList1);
//        Passenger passenger2 = new Passenger(1, "John", "Doe", "1234567890", city1, aircraftList1);
//        Passenger passenger3 = new Passenger(2, "Jane", "Smith", "0987654321", city2, aircraftList2);

//        // Test equals() method
//        assertEquals(passenger1, passenger2);
//        assertNotEquals(passenger1, passenger3);
//
//        // Test hashCode() method
//        assertEquals(passenger1.hashCode(), passenger2.hashCode());
//        assertNotEquals(passenger1.hashCode(), passenger3.hashCode());
//    }
}
