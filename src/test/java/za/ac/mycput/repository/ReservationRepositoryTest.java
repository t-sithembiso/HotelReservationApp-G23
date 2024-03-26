package za.ac.mycput.repository;
/*Author Thalitha Sithembiso-221123598 (Team lead)
 * Date: 21 march 2024  */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.domain.Reservation;
import za.ac.mycput.factory.ReservationFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReservationRepositoryTest {
    private static IReservationRepository repository= ReservationRepository.getRepository();
    private Reservation reservation= ReservationFactory.buildReservation("2201", "12 march","14 march","Itha",121);

    @Order(1)
    @Test
    void create() {
        Reservation reservationCreated= repository.create(reservation);
        assertNotNull(reservationCreated);
        System.out.println("Reservation:"+ reservationCreated);
    }
    @Order(2)
    @Test
    void read() {
        Reservation readReservation= repository.read(reservation.getReservationID());
        assertNotNull(readReservation);
        System.out.println("Reservation:"+ readReservation);
    }
    @Order(3)
    @Test
    void update() {
        Reservation newReservation= new Reservation.Builder().copy(reservation).setGuestName("Lana").build();
        Reservation updatedReservationDetails= repository.update(newReservation);
        assertNotNull(updatedReservationDetails);
        System.out.println("Reservation updated:"+ updatedReservationDetails);
    }

    @Order(5)
    @Test
    void delete() {
        assertTrue(repository.delete(reservation.getReservationID()));
    System.out.println("Reservation deleted successfully");
    }

    @Order(4)
    @Test
    void getall() {
    System.out.println(repository.getall());
}
}