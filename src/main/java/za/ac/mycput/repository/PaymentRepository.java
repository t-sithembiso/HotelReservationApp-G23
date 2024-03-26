package za.ac.mycput.repository;

import za.ac.mycput.domain.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepository implements IPaymentRepository{
    private static IPaymentRepository repository=null;
    private ArrayList<Payment> listOfPayment;
    private PaymentRepository(){
        listOfPayment= new ArrayList<Payment>();
    }
    public static IPaymentRepository getRepository(){
        if (repository ==null){
            repository= new PaymentRepository();
        }
        return repository;

    }
    @Override
    public Payment create(Payment Payment){
        boolean success = listOfPayment.add(Payment);
        if (success){
            return Payment;
        }return null;
    }
    @Override
    public Payment read(String id){
        for (Payment p:listOfPayment){
            if (p.getPaymentID().equal(id))
                return p;
        }return null;
    }
    @Override
    public Payment update(Payment Payment){
        int id = Payment.getPaymentID();
        Payment outdatedPayment= read(String.valueOf(id));
        if (outdatedPayment==null)
            return null;
        boolean success = delete(String.valueOf(id));
        if (success){
            if (listOfPayment.add(Payment))
                return Payment;
        }
        return null;

    }

    @Override
    public boolean delete(String id){
       Payment deletedPayment= read(id);
        if (deletedPayment==null)
            return false;
        return (listOfPayment.remove(listOfPayment));
    }

    //from IRepository
    @Override
    public List<Payment> getallstuff() {
        return null;
    }


    @Override
    public List<Payment> getall(){
        return listOfPayment;
    }
}
