//
//
//import model.Airport;
//import model.City;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AirportTest {
//
//    @Test
//    public void testGettersAndSetters() {
//        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000);
//        Airport airport = new Airport();
//
//        airport.setId(1);
//        airport.setName("Boryspil");
//        airport.setCode("KBP");
//        airport.setCity(city);
//
//        assertEquals(1, airport.getId());
//        assertEquals("Boryspil", airport.getName());
//        assertEquals("KBP", airport.getCode());
//        assertEquals(city, airport.getCity());
//    }
//
//    @Test
//    public void testDefaultConstructor() {
//        Airport airport = new Airport();
//        assertEquals(0, airport.getId());
//        assertNull(airport.getName());
//        assertNull(airport.getCode());
//        assertNull(airport.getCity());
//    }
//
//    @Test
//    public void testParameterizedConstructor() {
//        City city = new City(1L, "Kyiv", "Kyiv Province", 2804000);
//        Airport airport = new Airport();
//        airport.setId(1);
//        airport.setName("Boryspil");
//        airport.setCode("KBP");
//        airport.setCity(city);
//
//        assertEquals(1, airport.getId());
//        assertEquals("Boryspil", airport.getName());
//        assertEquals("KBP", airport.getCode());
//        assertEquals(city, airport.getCity());
//    }
//}
