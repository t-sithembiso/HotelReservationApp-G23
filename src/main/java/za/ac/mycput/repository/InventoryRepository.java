package za.ac.mycput.repository;
/*Sbonga Shweni 219143188
 * https://github.com/SbongaS/HotelReservationApp-G23/tree/master*/
import za.ac.mycput.domain.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryRepository implements IInventoryRepository {
    private static IInventoryRepository repository = null;
    private final List<Inventory> listOfInventoryItems;

    private InventoryRepository() {
        listOfInventoryItems = new ArrayList<Inventory>();
    }

    public static IInventoryRepository getRepository() {
        if (repository == null) {
            repository = new InventoryRepository();
        }
        return repository;

    }

    @Override
    public Inventory create(Inventory inventoryItem) {
        boolean success = listOfInventoryItems.add(inventoryItem);
        if (success) {
            return inventoryItem;
        }
        return null;
    }

    @Override
    public Inventory read(String id) {
        for (Inventory r : listOfInventoryItems) {
            if (r.getInventoryItemID().equals(id))
                return r;
        }
        return null;
    }

    @Override
    public Inventory update(Inventory inventory) {
        String id = inventory.getInventoryItemID();
        Inventory outdatedInventory = read(id);
        if (outdatedInventory == null)
            return null;
        boolean success = delete(id);
        if (success) {
            if (listOfInventoryItems.add(inventory))
                return inventory;
        }
        return null;

    }

    @Override
    public boolean delete(String id) {
        Inventory deletedInventoryItem = read(id);
        if (deletedInventoryItem == null)
            return false;
        return (listOfInventoryItems.remove(deletedInventoryItem));
    }

    //from IRepository
    @Override
    public List<Inventory> getallstuff() {
        return null;
    }


    @Override
    public List<Inventory> getall() {
        return listOfInventoryItems;
    }

}
