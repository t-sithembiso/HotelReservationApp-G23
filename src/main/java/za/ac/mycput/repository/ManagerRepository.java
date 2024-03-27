package za.ac.mycput.repository;
/*Author Oupa Brian Ramoroka
   Student Number: 221013962
 * Date: 26 march 2024
 https://github.com/Brian-obr/HotelReservationApp-G23 */

import za.ac.mycput.domain.Manager;
import za.ac.mycput.domain.Reservation;

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
        boolean success = listOfManager.add(manager);
        if (success){
            return manager;
        }
        return null;
    }

    @Override
    public Manager read(String num) {
        for (Manager man:listOfManager){
            if (man.getStaffNo().equals(num))
                return man;
        }return null;
    }

    @Override
    public Manager update(Manager manager) {
        String staffNum = manager.getStaffNo();
        Manager retiredManager = read(staffNum);
        if (retiredManager==null)
            return null;
        boolean success = delete(staffNum);
        if (success){
            if (listOfManager.add(manager))
                return manager;
        }
        return null;
    }

    @Override
    public boolean delete(String staffNum) {
        Manager fireManager = read(staffNum);
        if (fireManager==null)
            return false;
        return (listOfManager.remove(fireManager));
    }

    @Override
    public List<Manager> getallstuff() {
        return null;
    }

    @Override
    public List<Manager> getall() {
        return listOfManager;
    }
}
