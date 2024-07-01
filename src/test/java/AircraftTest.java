import model.Aircraft;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AircraftTest {

    @Test
    public void testDefaultConstructor() {
        Aircraft aircraft = new Aircraft();
        assertEquals(0, aircraft.getId());
        assertNull(aircraft.getType());
        assertNull(aircraft.getAirlineName());
        assertEquals(0, aircraft.getNumberOfPassengers());
    }

    @Test
    public void testParameterizedConstructor() {
        Aircraft aircraft = new Aircraft(1, "Boeing 737", "Delta Airlines", 160);

        assertEquals(1, aircraft.getId());
        assertEquals("Boeing 737", aircraft.getType());
        assertEquals("Delta Airlines", aircraft.getAirlineName());
        assertEquals(160, aircraft.getNumberOfPassengers());
    }

    @Test
    public void testSettersAndGetters() {
        Aircraft aircraft = new Aircraft();
        aircraft.setId(1);
        aircraft.setType("Airbus A320");
        aircraft.setAirlineName("American Airlines");
        aircraft.setNumberOfPassengers(180);

        assertEquals(1, aircraft.getId());
        assertEquals("Airbus A320", aircraft.getType());
        assertEquals("American Airlines", aircraft.getAirlineName());
        assertEquals(180, aircraft.getNumberOfPassengers());
    }

    @Test
    public void testToString() {
        Aircraft aircraft = new Aircraft(1, "Boeing 737", "Delta Airlines", 160);
        String expected = "Aircraft{id=1, type='Boeing 737', airlineName='Delta Airlines', numberOfPassengers=160}";
        assertEquals(expected, aircraft.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Aircraft aircraft1 = new Aircraft(1, "Boeing 737", "Delta Airlines", 160);
        Aircraft aircraft2 = new Aircraft(1, "Boeing 737", "Delta Airlines", 160);
        Aircraft aircraft3 = new Aircraft(2, "Airbus A320", "American Airlines", 180);

        assertEquals(aircraft1, aircraft2);
        assertNotEquals(aircraft1, aircraft3);
        assertEquals(aircraft1.hashCode(), aircraft2.hashCode());
        assertNotEquals(aircraft1.hashCode(), aircraft3.hashCode());
    }
}
