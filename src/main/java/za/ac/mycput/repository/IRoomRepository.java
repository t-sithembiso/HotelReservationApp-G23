package za.ac.mycput.repository;
import za.ac.mycput.domain.Reservation;
import java.util.List;



import java.util.List;

    public interface IRoomRepository extends IRepository<Room, String>{
        List <Room> getall();
    }


