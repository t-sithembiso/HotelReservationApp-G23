package za.ac.mycput.domain;
//Okuhle Sithole 221137610
//https://github.com/sitgi/HotelReservationApp-G23
import java.util.Objects;

public class Room {
    private int RoomNumber;
    private String roomType;
    private int capacity;
    private double price;

    private Room(){
        




    }
    private Room(Room.Builder builder) {
        this.RoomNumber = builder.RoomNumber;
        this.roomType = builder.roomType;
        this.capacity = builder.capacity;
        this.price = builder.price;
    }


    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return RoomNumber;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return getRoomNumber() == room.getRoomNumber() && getCapacity() == room.getCapacity() && getPrice() == room.getPrice() && getRoomType().equals(room.getRoomType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomNumber(), getRoomType(), getCapacity(), getPrice());


    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomNumber=" + RoomNumber +
                ", roomType='" + roomType + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
    public static class Builder{
        private int  RoomNumber;
        private String roomType;
        private int capacity;
        private double price;

        public Room.Builder setRoomNumber(int roomNumber){
            this.RoomNumber= RoomNumber;
            return this;
        }
        public Room.Builder setRoomType(String roomType){
            this.roomType= roomType;
            return this;
        }
        public Room.Builder setCapacity(int Capacity){
            this.capacity= capacity;
            return this;
        }
        public Room.Builder setPrice(double price){
            this.price= price;
            return this;
        }
        public Room.Builder copy(Room room){
            this.RoomNumber= room.RoomNumber;
            this.roomType= room.roomType;
            this.capacity= room.capacity;
            this.price= room.price;
            return this;
        }
        public Room build(){
            return new Room(this);
        }

    }
}


