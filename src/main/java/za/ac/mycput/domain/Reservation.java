package za.ac.mycput.domain;
/*Author Thalitha Sithembiso-221123598 (Team lead)
* Date: 21 march 2024 
https://github.com/t-sithembiso/HotelReservationApp-G23 */

import java.util.Objects;
public class Reservation {

    private String   reservationID;
    private String startDate;
    private String endDate;
    private String guestName;
    private int roomNumber;
    private Reservation(){}
    

    //constructor added after builder class is done
   private Reservation(Builder builder){
        this.reservationID= builder.reservationID;
        this.startDate= builder.startDate;
        this.endDate= builder.endDate;
        this.guestName= builder.guestName;
        this.roomNumber= builder.roomNumber;

    }

    public String getReservationID() {
        return reservationID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getGuestName() {
        return guestName;
    }
    public int getRoomNumber(){ return roomNumber; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation that)) return false;
        return Objects.equals(reservationID, that.reservationID) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(roomNumber, that.roomNumber) && Objects.equals(guestName, that.guestName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID, startDate, endDate, guestName,roomNumber);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID='" + reservationID + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", guestName='" + guestName + '\'' +
                '}';
    }
    public static class Builder{
        private String   reservationID;
        private String startDate;
        private String endDate;
        private String guestName;
        private int roomNumber;
        //
        public Builder setReservationID(String reservationID){
            this.reservationID= reservationID;
            return this;
        }
        public Builder setStartDate(String startDate){
            this.startDate= startDate;
            return this;
        }
        public Builder setEndDate(String endDate){
            this.endDate= endDate;
            return this;
        }
        public Builder setGuestName(String guestName){
            this.guestName= guestName;
            return this;
        }

        public Builder setRoomNumber(int roomNumber){
            this.roomNumber= roomNumber;
            return this;
        }
        public Builder copy(Reservation reservation){
            this.reservationID= reservation.reservationID;
            this.startDate= reservation.startDate;
            this.endDate= reservation.endDate;
            this.guestName= reservation.guestName;
            this.roomNumber= reservation.roomNumber;
            return this;
        }
        public Reservation build(){
            return new Reservation(this);
        }

    }
}
