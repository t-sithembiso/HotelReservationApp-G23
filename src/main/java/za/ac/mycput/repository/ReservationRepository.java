package za.ac.mycput.repository;
import za.ac.mycput.domain.Reservation;
import java.util.List;
import java.util.ArrayList;
/*Author Thalitha Sithembiso-221123598 (Team lead)
 * Date: 21 march 2024 
 https://github.com/t-sithembiso/HotelReservationApp-G23 */

public class ReservationRepository implements IReservationRepository{

    private static IReservationRepository repository=null;
    private List<Reservation> listOfReservations;
    private ReservationRepository(){
        listOfReservations= new ArrayList<Reservation>();
    }
    public static IReservationRepository getRepository(){
        if (repository ==null){
            repository= new ReservationRepository();
        }
        return repository;

    }
    @Override
    public Reservation create(Reservation reservation){
        boolean success = listOfReservations.add(reservation);
        if (success){
            return reservation;
        }return null;
    }
   @Override
    public Reservation read(String id){
        for (Reservation r:listOfReservations){
            if (r.getReservationID().equals(id))
                return r;
        }return null;
    }
    @Override
    public Reservation update(Reservation reservation){
        String id = reservation.getReservationID();
        Reservation outdatedReservation= read(id);
        if (outdatedReservation==null)
            return null;
        boolean success = delete(id);
        if (success){
            if (listOfReservations.add(reservation))
                return reservation;
        }
        return null;

    }

    @Override
    public boolean delete(String id){
        Reservation deletedReservation= read(id);
        if (deletedReservation==null)
            return false;
        return (listOfReservations.remove(deletedReservation));
    }

    //from IRepository
    @Override
    public List<Reservation> getallstuff() {
        return null;
    }


    @Override
    public List<Reservation> getall(){
        return listOfReservations;
    }
}
