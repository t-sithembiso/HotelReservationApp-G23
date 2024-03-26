package za.ac.mycput.repository;
/*Author Oupa Brian Ramoroka
   Student Number: 221013962
 * Date: 26 march 2024
 https://github.com/Brian-obr/HotelReservationApp-G23*/

import za.ac.mycput.domain.Manager;

import java.util.List;

public interface IManagerRepository extends IRepository<Manager, String> {

    List<Manager> getall();
}
