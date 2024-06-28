package service;

import model.Aircraft;
import model.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PassengerService {

    private List<Passenger> passengers = new ArrayList<>();

    // Отримання всіх пасажирів http://localhost:8080/passenger
    public List<Passenger> getAllPassengers() {
        return passengers;
    }

    // Отримання пасажира за індексом http://localhost:8080/passenger/1
    public Passenger getPassenger(int index) {
        if (index >= 0 && index < passengers.size()) {
            return passengers.get(index);
        }
        return null;
    }

    // Створення нового пасажира http://localhost:8080/passenger
    public Passenger createPassenger(Passenger newPassenger) {
        passengers.add(newPassenger);
        return newPassenger;
    }

    // Оновлення існуючого пасажира http://localhost:8080/passenger/1
    public Passenger updatePassenger(int index, Passenger updatedPassenger) {
        if (index >= 0 && index < passengers.size()) {
            passengers.set(index, updatedPassenger);
            return updatedPassenger;
        }
        return null;
    }

    // Видалення пасажира за індексом http://localhost:8080/passenger/1
    public void deletePassenger(int index) {
        if (index >= 0 && index < passengers.size()) {
            passengers.remove(index);
        }
    }

    // Отримання літаків для пасажира  http://localhost:8080/passenger/1/aircraft
    public List<Aircraft> getAircraftForPassenger(int index) {
        if (index >= 0 && index < passengers.size()) {
            return passengers.get(index).getAircraftList();
        }
        throw new RuntimeException("Passenger not found with index: " + index);
    }
}
