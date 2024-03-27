package za.ac.mycput.repository;
/*Sbonga Shweni 219143188
 * https://github.com/SbongaS/HotelReservationApp-G23/tree/master*/

import org.junit.jupiter.api.Test;
import za.ac.mycput.domain.Inventory;
import za.ac.mycput.factory.InventoryFactory;

import static org.junit.jupiter.api.Assertions.*;

class InventoryRepositoryTest {
    private static IInventoryRepository repository= InventoryRepository.getRepository();
    private Inventory invent = InventoryFactory.buildInventory("005","Bathroom","Towel",true,10);

    @Test
    void create() {
    Inventory newInventoryItem = repository.create(invent);
    assertNotNull(newInventoryItem);
        System.out.println("A new item: "+newInventoryItem);
    }

    @Test
    void read() {
        Inventory readInventoryItem =repository.read(invent.getInventoryItemID());
        assertNotNull(readInventoryItem);
        System.out.println("Read-out inventory"+readInventoryItem);
    }

    @Test
    void update() {
        Inventory updatedInventoryItemCopy = new Inventory.Builder().copy(invent).setName("Soap").build();
        Inventory updateInventoryItem = repository.update(updatedInventoryItemCopy);
        assertNotNull(updateInventoryItem);
        System.out.println("Item details updated:"+ updateInventoryItem);
    }

    @Test
    void delete() {
        assertTrue(repository.delete(invent.getInventoryItemID()));
        System.out.println("Item deleted successfully");
    }

    @Test
    void getall() {
        System.out.println(repository.getall());
    }
}