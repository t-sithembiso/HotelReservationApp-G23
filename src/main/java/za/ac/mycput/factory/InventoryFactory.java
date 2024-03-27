package za.ac.mycput.factory;
/*Sbonga Shweni 219143188
 * https://github.com/SbongaS/HotelReservationApp-G23/tree/master*/
import za.ac.mycput.domain.Inventory;
import za.ac.mycput.util.Helper;

public interface InventoryFactory {
    public static Inventory buildInventory (String inventoryID, String type, String name, boolean isAvailable , int quantity){

        if (Helper.isNullorEmpty(inventoryID)|| Helper.isNullorEmpty(type)
                || Helper.isNullorEmpty(name) || Helper.isNullorEmpty(String.valueOf(isAvailable))
                || Helper.isNullorEmpty(String.valueOf(quantity)))
            return null;

        return new Inventory.Builder().setInventoryItemID(inventoryID)
                .setType(type)
                .setName(name)
                .setIsAvailable(isAvailable)
                .setQuantity(quantity)
                .build();
    }
    public static Inventory buildInventory( String type, String name, boolean isAvailable , int quantity){
        if (Helper.isNullorEmpty(type)
                || Helper.isNullorEmpty(name) || Helper.isNullorEmpty(String.valueOf(isAvailable))
                || Helper.isNullorEmpty(String.valueOf(quantity)))
            return null;
        String inventoryItemIdID= Helper.generateInventoryItemId();
        return new Inventory.Builder().setInventoryItemID(inventoryItemIdID)
                .setType(type)
                .setName(name)
                .setIsAvailable(isAvailable)
                .setQuantity(quantity).build();

    }
}

