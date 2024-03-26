package za.ac.mycput.repository;
/*Author Sibusiso Kubalo 218316038
 * Date: 26 March 2024  */

import za.ac.mycput.domain.Payment;
import za.ac.mycput.domain.Reservation;

import java.util.List;

public interface IPaymentRepository extends IRepository<Payment, String> {

    List<Payment> getall();
}
