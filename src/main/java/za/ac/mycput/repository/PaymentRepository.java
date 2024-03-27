package za.ac.mycput.repository;
/*Author Sibusiso Kubalo 218316038
 * Date: 26 March 2024  */

import za.ac.mycput.domain.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepository implements IPaymentRepository {
    private static IPaymentRepository repository = null;
    private ArrayList<Payment> listOfPayment;

    private PaymentRepository() {
        listOfPayment = new ArrayList<>();
    }

    public static IPaymentRepository getRepository() {
        if (repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }

    @Override
    public Payment create(Payment payment) {
        boolean success = listOfPayment.add(payment);
        if (success) {
            return payment;
        }
        return null;
    }

    @Override
    public Payment read(String s) {
        return null;
    }

    @Override
    public Payment read(int id) {
        for (Payment p : listOfPayment) {
            if (p.getPaymentID().equals(id))
                return p;
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        String id = String.valueOf(payment.getPaymentID());
        Payment outdatedPayment = read(id);
        if (outdatedPayment == null)
            return null;
        boolean success = delete(id);
        if (success) {
            if (listOfPayment.add(payment))
                return payment;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Payment deletedPayment = read(id);
        if (deletedPayment == null)
            return false;
        return listOfPayment.remove(deletedPayment);
    }

    @Override
    public List<Payment> getallstuff() {
        return null;
    }

    // Implementing the getAllStuff() method
    @Override
    public List<Payment> getAllStuff() {
        // Implement your logic to return all items in the list
        return new ArrayList<>(listOfPayment);
    }

    @Override
    public List<Payment> getAll() {
        return listOfPayment;
    }

    @Override
    public List<Payment> getall() {
        return null;
    }
}