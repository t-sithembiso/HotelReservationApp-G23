package za.ac.mycput.factory;
/*Author Thalitha Sithembiso-221123598 (Team lead)
 * Date: 21 march 2024  */
import org.junit.jupiter.api.Test;
import za.ac.mycput.domain.Reservation;

import static org.junit.jupiter.api.Assertions.*;

class ReservationFactoryTest {

    @Test
    void testBuildReservation() {
        Reservation r= ReservationFactory.buildReservation("12 March", "14 March","Itha", 121);
        assertNotNull(r);
        System.out.println(r.toString());
    }
    @Test
    void testBuildReservationtoFail() {
        Reservation r= ReservationFactory.buildReservation("","","","", 121);
        assertNotNull(r);
        System.out.println(r.toString());
    }
}