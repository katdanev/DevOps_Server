import model.Airport;
import model.City;
import model.Passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CityTest {

    @Test
    public void testDefaultConstructor() {
        City city = new City();
        assertNull(city.getId());
        assertNull(city.getName());
        assertNull(city.getProvince());
        assertEquals(0, city.getPopulation());
        assertNull(city.getAirports());
        assertNull(city.getPassengers());
    }

    @Test
    public void testParameterizedConstructor() {
        List<Airport> airports = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();

        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000, airports, passengers);

        assertEquals(1L, city.getId());
        assertEquals("Kyiv", city.getName());
        assertEquals("Kyiv Province", city.getProvince());
        assertEquals(2804000, city.getPopulation());
        assertEquals(airports, city.getAirports());
        assertEquals(passengers, city.getPassengers());
    }

    @Test
    public void testSettersAndGetters() {
        City city = new City();
        city.setId(1L);
        city.setName("Lviv");
        city.setProvince("Lviv Province");
        city.setPopulation(720000);

        assertEquals(1L, city.getId());
        assertEquals("Lviv", city.getName());
        assertEquals("Lviv Province", city.getProvince());
        assertEquals(720000, city.getPopulation());

        // Test setters and getters for airports
        List<Airport> airports = new ArrayList<>();
        city.setAirports(airports);
        assertEquals(airports, city.getAirports());

        // Test setters and getters for passengers
        List<Passenger> passengers = new ArrayList<>();
        city.setPassengers(passengers);
        assertEquals(passengers, city.getPassengers());
    }
}
