package za.ac.mycput.factory;

import za.ac.mycput.domain.Payment;
import za.ac.mycput.util.Helper;

/*Author Sibusiso Kubalo 218316038
 * Date: 26 March 2024  */
public interface PaymentFactory {
    public static Payment buildPayment(int PaymentID, boolean Amount , String PaymentDate, String guestName){

        if (Helper.isNullorEmpty(String.valueOf(PaymentID))|| Helper.isNullorEmpty(String.valueOf(Amount))
                || Helper.isNullorEmpty(PaymentDate) || Helper.isNullorEmpty(guestName))
            return null;

        return new Payment.Builder().setPaymentID(PaymentID)
                .setAmount()
                .setPaymentDate()
                .setGuestName(guestName)
                .build();
    }

    public static Payment buildPayments(int PaymentID, boolean Amount , String PaymentDate, String guestName){
        if (Helper.isNullorEmpty(guestName) || Helper.isNullorEmpty(String.valueOf(PaymentID))
                || Helper.isNullorEmpty(PaymentDate) || Helper.isNullorEmpty(String.valueOf(Amount)))
            return null;

        PaymentID = Integer.parseInt(Helper.generatePaymentId());
        return new Payment.Builder().setPaymentID(PaymentID)
                .setAmount()
                .setPaymentDate()
                .setGuestName(guestName)
                .build();
    }
}
