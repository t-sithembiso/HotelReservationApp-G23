package za.ac.mycput.repository;
import za.ac.mycput.domain.Reservation;
import za.ac.mycput.domain.Room;

import java.util.List;



import java.util.List;
//Okuhle Sithole 221137610
//https://github.com/sitgi/HotelReservationApp-G23
public interface IRoomRepository extends IRepository<Room, String>{
    List <Room> getall();

    List<Room> getAll();
}


