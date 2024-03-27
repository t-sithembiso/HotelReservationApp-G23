package za.ac.mycput.repository;
/*Author Oupa Brian Ramoroka
   Student Number: 221013962
 * Date: 26 march 2024
 https://github.com/Brian-obr/HotelReservationApp-G23*/

import za.ac.mycput.domain.Manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerRepository implements IManagerRepository {
    private static IManagerRepository repository = null;
    private final List<Manager> listOfManager;

    private ManagerRepository() {
        listOfManager = new ArrayList<Manager>();
    }

    public static IManagerRepository getRepository() {
        if (repository == null) {
            repository = new ManagerRepository();
        }
        return repository;

    }

    @Override
    public Manager create(Manager manager) {
        return null;
    }

    @Override
    public Manager read(String s) {
        return null;
    }

    @Override
    public Manager update(Manager manager) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<Manager> getallstuff() {
        return null;
    }

    @Override
    public List<Manager> getall() {
        return null;
    }
}
