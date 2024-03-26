package za.ac.mycput.factory;
import za.ac.mycput.domain.Reservation;
import za.ac.mycput.util.Helper;

/*Author Thalitha Sithembiso-221123598 (Team lead)
 * Date: 21 march 2024  */
public interface ReservationFactory {
    public static Reservation buildReservation(String reservationID,String startDate, String endDate, String guestName ,int roomNumber){

        if (Helper.isNullorEmpty(reservationID)|| Helper.isNullorEmpty(guestName)
        || Helper.isNullorEmpty(startDate) || Helper.isNullorEmpty(endDate)
                || Helper.isNullorEmpty(String.valueOf(roomNumber)))
            return null;

        return new Reservation.Builder().setReservationID(reservationID)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setGuestName(guestName)
                .setRoomNumber(roomNumber)
                .build();
    }
    public static Reservation buildReservation(String startDate, String endDate, String guestName, int roomNumber){
        if (Helper.isNullorEmpty(guestName) || Helper.isNullorEmpty(endDate)
                || Helper.isNullorEmpty(startDate) || Helper.isNullorEmpty(String.valueOf(roomNumber)))
            return null;

        String reservationID= Helper.generateReservationId();
        return new Reservation.Builder().setReservationID(reservationID)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setGuestName(guestName)
                .setRoomNumber(roomNumber)
                .build();
    }
}
