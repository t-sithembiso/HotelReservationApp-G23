package za.ac.mycput.factory;

import za.ac.mycput.domain.Room;
import za.ac.mycput.util.Helper;

public interface RoomFactory {

    static Room buildRoom(String roomNumber, String roomType, String capacity, String price) {
        if (Helper.isNullorEmpty(roomNumber) || Helper.isNullorEmpty(roomType)
                || Helper.isNullorEmpty(capacity) || Helper.isNullorEmpty(price)) {
            return null;
        }

        return new Room.Builder()
                .setRoomNumber(Integer.parseInt(roomNumber))
                .setRoomType(roomType)
                .setCapacity(Integer.parseInt(capacity))
                .setPrice(Double.parseDouble(price))
                .build();
    }

    static Room buildRoomWithGeneratedNumber(String roomType, String capacity, String price) {
        if (Helper.isNullorEmpty(roomType) || Helper.isNullorEmpty(capacity)
                || Helper.isNullorEmpty(price)) {
            return null;
        }

        String roomNumber = Helper.generateRoomNumber();
        return new Room.Builder()
                .setRoomNumber(Integer.parseInt(roomNumber))
                .setRoomType(roomType)
                .setCapacity(Integer.parseInt(capacity))
                .setPrice(Double.parseDouble(price))
                .build();
    }
}