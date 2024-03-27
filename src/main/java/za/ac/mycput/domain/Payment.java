package za.ac.mycput.domain;
/*Author Sibusiso Kubalo 218316038
 * Date: 26 March 2024  */

import java.util.Objects;

public class Payment {
    private int PaymentID;
    private boolean Amount;
    private String PaymentDate;
    private String guestName;


    private Payment(Payment.Builder builder) {
        this.PaymentID = builder.PaymentID;
        this.Amount = builder.Amount;
        this.PaymentDate = builder.PaymentDate;
        this.guestName = builder.guestName;

    }

    public int getPaymentID() {
        return PaymentID;
    }

    public boolean isAmount() {
        return Amount;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public String getGuestName() {
        return guestName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return PaymentID == payment.PaymentID && Amount == payment.Amount && Objects.equals(PaymentDate, payment.PaymentDate) && Objects.equals(guestName, payment.guestName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PaymentID, Amount, PaymentDate, guestName);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "PaymentID=" + PaymentID +
                ", Amount=" + Amount +
                ", PaymentDate='" + PaymentDate + '\'' +
                ", guestName='" + guestName + '\'' +
                '}';
    }

    public static class Builder {
        private int PaymentID;
        private boolean Amount;
        private String PaymentDate;
        private String guestName;


        public Payment.Builder setPaymentID(int paymentID) {
            this.PaymentID = PaymentID;
            return this;
        }

        public Payment.Builder setAmount() {
            this.Amount = Amount;
            return this;
        }

        public Payment.Builder setPaymentDate() {
            this.PaymentDate = PaymentDate;
            return this;
        }

        public Payment.Builder setGuestName(String guestName) {
            this.guestName = guestName;
            return this;
        }


        private Payment.Builder copy(Payment Payment) {
            this.PaymentID = Payment.PaymentID;
            this.Amount = Payment.Amount;
            this.PaymentDate = Payment.PaymentDate;
            this.guestName = Payment.guestName;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}