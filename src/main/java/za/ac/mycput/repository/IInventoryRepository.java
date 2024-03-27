package za.ac.mycput.repository;

import za.ac.mycput.domain.Inventory;

import java.util.List;
/*Sbonga Shweni 219143188
 * https://github.com/SbongaS/HotelReservationApp-G23/tree/master*/

//will import the class from domain here
//extends IRepository
//implementation
public interface IInventoryRepository extends IRepository<Inventory, String>{
    List<Inventory> getall();
}
