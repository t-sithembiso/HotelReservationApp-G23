package za.ac.mycput.repository;
import za.ac.mycput.domain.Reservation;
import java.util.List;
/*
 Author Thalitha Sithembiso-221123598 (Team lead)
 * Date: 21 march 2024  */

//will import the class from domain here
//extends IRepository
//implementation
public interface IReservationRepository  extends IRepository<Reservation, String>{
    List<Reservation> getall();
}
