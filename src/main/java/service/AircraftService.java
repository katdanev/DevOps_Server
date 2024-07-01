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
        if (index >= 0 && index < aircrafts.size()) {
            return aircrafts.get(index);
        }
        return null;
    }

    public Aircraft createAircraft(Aircraft newAircraft) {
        aircrafts.add(newAircraft);
        return newAircraft;
    }

    public Aircraft updateAircraft(int index, Aircraft updatedAircraft) {
        if (index >= 0 && index < aircrafts.size()) {
            aircrafts.set(index, updatedAircraft);
            return updatedAircraft;
        }
        return null;
    }

    public void deleteAircraft(int index) {
        if (index >= 0 && index < aircrafts.size()) {
            aircrafts.remove(index);
        }
    }
}
