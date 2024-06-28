
import model.City;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    @Test
    public void testDefaultConstructor() {
        City city = new City();
        assertNull(city.getId());
        assertNull(city.getName());
        assertNull(city.getProvince());
        assertEquals(0, city.getPopulation());
    }

    @Test
    public void testParameterizedConstructor() {
        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000);
        assertEquals(1L, city.getId());
        assertEquals("Kyiv", city.getName());
        assertEquals("Kyiv Province", city.getProvince());
        assertEquals(2804000, city.getPopulation());
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
    }
}