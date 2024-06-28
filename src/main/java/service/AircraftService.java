package service;

import model.Aircraft;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {
    private List<Aircraft> aircrafts = new ArrayList<>();

    public List<Aircraft> getAllAircrafts() {
        return aircrafts;
    }

    public Aircraft getAircraft(int index) {
        return aircrafts.get(index);
    }

    public Aircraft createAircraft(Aircraft newAircraft) {
        aircrafts.add(newAircraft);
        return newAircraft;
    }

    public Aircraft updateAircraft(int index, Aircraft updatedAircraft) {
        aircrafts.set(index, updatedAircraft);
        return updatedAircraft;
    }

    public void deleteAircraft(int index) {
        aircrafts.remove(index);
    }
}
