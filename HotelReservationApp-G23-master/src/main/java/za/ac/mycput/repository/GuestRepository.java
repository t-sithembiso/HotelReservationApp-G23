package za.ac.mycput.repository;

import za.ac.mycput.domain.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestRepository implements IGuestRepository{


    private static IGuestRepository repository = null;
    private List<Guest> ListOfGuests;

    private GuestRepository() {
        ListOfGuests = new ArrayList<Guest>();
    }

    public IGuestRepository getRepository() {
        if (repository == null) repository = new GuestRepository();
        return repository;
    }

    @Override
    public List<Guest> getall() {
        return null;
    }

    @Override
    public Guest create(Guest guest) {
        boolean success = ListOfGuests.add(guest);
        if (success) {
            return guest;
        }
        return null;
    }

    @Override
    public Guest read(String id) {
        for (Guest g : ListOfGuests) {
            if (g.getGuestID().equals(id)) {
                return g;
            }
        }
        return null;

    }

    @Override
    public Guest update(Guest guest) {
        return null;
    }

    @Override
    public Guest update(String Name) {
        String name = read().getGuestName();
        Guest guest1;
        guest1 = read();
        if (guest1 == null)
            return null;
        boolean success = delete(name);
        if (success) {
            if (ListOfGuests.add(guest1))
                return guest1;
        }
        return null;
    }

    private Guest read() {
        return null;
    }


    @Override
    public boolean delete(String id) {
        Guest deletedGuest;
        deletedGuest = read(id);
        if (deletedGuest == null)
            return false;
        return (ListOfGuests.remove(deletedGuest));
    }

    @Override
    public List<Guest> getallstuff() {
        return null;
    }


}
