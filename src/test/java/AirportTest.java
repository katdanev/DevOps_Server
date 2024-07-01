import model.Airport;
import model.City;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {

    @Test
    public void testDefaultConstructor() {
        Airport airport = new Airport();
        assertEquals(0, airport.getId());
        assertNull(airport.getName());
        assertNull(airport.getCode());
        assertNull(airport.getCity());
    }

    @Test
    public void testParameterizedConstructor() {
        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000, null, null);

        Airport airport = new Airport(1, "Boryspil", "KBP", city);

        assertEquals(1, airport.getId());
        assertEquals("Boryspil", airport.getName());
        assertEquals("KBP", airport.getCode());
        assertEquals(city, airport.getCity());
    }

    @Test
    public void testSettersAndGetters() {
        Airport airport = new Airport();
        airport.setId(1);
        airport.setName("Lviv");
        airport.setCode("LWO");

        City city = new City(2L, "Lviv", "Lviv Province", 720000, null, null);
        airport.setCity(city);

        assertEquals(1, airport.getId());
        assertEquals("Lviv", airport.getName());
        assertEquals("LWO", airport.getCode());
        assertEquals(city, airport.getCity());
    }

    @Test
    public void testToString() {
        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000, null, null);
        Airport airport = new Airport(1, "Boryspil", "KBP", city);

        String expected = "Airport{id=1, name='Boryspil', code='KBP', city=City{id=1, name='Kyiv', province='Kyiv Province', population=2804000, airports=null, passengers=null}}";
        assertEquals(expected, airport.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        City city1 = new City(1L, "Kyiv", "Kyiv Province", 2804000, null, null);
        City city2 = new City(2L, "Lviv", "Lviv Province", 720000, null, null);

        Airport airport1 = new Airport(1, "Boryspil", "KBP", city1);
        Airport airport2 = new Airport(1, "Boryspil", "KBP", city1);
        Airport airport3 = new Airport(2, "Lviv", "LWO", city2);

        assertEquals(airport1, airport2);
        assertNotEquals(airport1, airport3);
        assertEquals(airport1.hashCode(), airport2.hashCode());
        assertNotEquals(airport1.hashCode(), airport3.hashCode());
    }
}
