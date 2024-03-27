package za.ac.mycput.factory;
//Andisiwe Qhuva 218272510

import za.ac.mycput.domain.Guest;
import za.ac.mycput.domain.Reservation;
import za.ac.mycput.util.Helper;

public interface GuestFactory {


    public static GuestFactory buildReservation(Integer guestID, String guestName, String emailAddress, Integer roomNumber, String feedback) {

        if (Helper.isNullorEmpty(String.valueOf(guestID)) || Helper.isNullorEmpty(guestName)
                || Helper.isNullorEmpty(emailAddress) || Helper.isNullorEmpty(feedback)
                || Helper.isNullorEmpty(String.valueOf(roomNumber)))
            return null;


        return (GuestFactory) new Guest.Builder().Builder().setGuestID(guestID)
                .setEmailAddress(emailAddress)
                .setFeedback(feedback)
                .setGuestName(guestName)
                .setRoomNumber(roomNumber)
                .setGuestID(guestID)
                .build();
    }

    public static Guest buildGuests(String feedback, String emailAddress, String guestName, Integer guestID) {
        if (Helper.isNullorEmpty(guestName) || Helper.isNullorEmpty(emailAddress)
                || Helper.isNullorEmpty(feedback) || Helper.isNullorEmpty(String.valueOf(guestID))) {
            return null;
        }

        String reservationID = Helper.generateReservationId();
        return new Reservation.Builder().setReservationID(reservationID)
                .setGuestName(guestName)
                .setGuestID(guestID)
                .setEmailAddress(emailAddress)
                .setFeedback(feedback)
                .build();

    }
}
