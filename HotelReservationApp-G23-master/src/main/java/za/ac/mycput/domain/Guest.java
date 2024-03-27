package za.ac.mycput.domain;

import java.util.Objects;

//*Andisiwe Qhuva 218272510
public class Guest {

    private Integer guestID;
    private String guestName;
    private String emailAddress;
    private Integer roomNumber;
    private String feedback;
    private Builder builder;


    private Guest(Guest guest) {
    }

    private boolean Guest(Builder builder) {
        this.guestID = builder.guestID;
        this.guestName = builder.guestName;
        this.emailAddress = builder.emailAddress;
        this.roomNumber = builder.roomNumber;
        this.feedback = builder.feedback;

        return false;
    }
    public Integer getGuestID() {return guestID;}
    public String getGuestName() {return guestName;}
    public String getEmailAddress() {return emailAddress;}
    public int getRoomNumber() {return roomNumber;}
    public String getFeedback() {return feedback;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest that)) return false;
        return Objects.equals(guestID, that.guestID) && Objects.equals(guestName, that.guestName) && Objects.equals(emailAddress, that.emailAddress) && Objects.equals(roomNumber, that.roomNumber) && Objects.equals(feedback, that.feedback);
    }

    //private Object guestName() {
    //return null;
    //}
    @Override
    public int hashCode() {
        return Objects.hash(guestID, guestName, emailAddress, roomNumber,feedback);
    }


    @Override
    public String toString() {
        return "Guest{" +
                "guestID=" + guestID +
                ", guestName='" + guestName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", roomNumber=" + roomNumber +
                ", feedback='" + feedback + '\'' +
                '}';
    }

    public static class Builder {
        private Integer guestID;
        private String guestName;
        private String emailAddress;
        private Integer roomNumber;
        private String feedback;


        public Guest Builder() {
            return null;
        }
    }

    public Guest setGuestID(Integer guestID) {
        this.guestID = guestID;
        return this;
    }

    public Guest setGuestName(String guestName) {
        this.guestName = guestName;
        return this;
    }

    public Guest setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public Guest setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public Guest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public Guest copy(Guest guest){
        this.guestID = guest.guestID;
        this.guestName = guest.guestName;
        this.emailAddress = guest.emailAddress;
        this.roomNumber = guest.roomNumber;
        this.feedback = guest.feedback;
        return this;

    }
    public Guest build(){return new Guest(this);
    }



}
