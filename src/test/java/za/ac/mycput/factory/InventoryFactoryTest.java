package za.ac.mycput.factory;
/*Sbonga Shweni 219143188
 * https://github.com/SbongaS/HotelReservationApp-G23/tree/master*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.mycput.domain.Inventory;

import static org.junit.jupiter.api.Assertions.*;

class InventoryFactoryTest {

    @Test
    void buildInventory() {
        Inventory inventoryItem = InventoryFactory.buildInventory("beding","Sheets",true,5);
        assertNotNull(inventoryItem);
        System.out.println(inventoryItem.toString());
    }

    @Test
    void testBuildInventory() {
        Inventory inventoryItem = InventoryFactory.buildInventory("","",false,0);
        assertNotNull(inventoryItem);
        System.out.println(inventoryItem.toString());
    }
}