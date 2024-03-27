package za.ac.mycput.repository;

import za.ac.mycput.domain.Room;

import java.util.ArrayList;
import java.util.List;

//Okuhle Sithole 221137610
//https://github.com/sitgi/HotelReservationApp-G23
public class RoomRepository implements IRoomRepository {

    private static IRoomRepository repository = null;
    private List<Room> listOfRooms;

    // Private constructor to enforce singleton pattern
    private RoomRepository() {
        listOfRooms = new ArrayList<>();
    }

    // Singleton method to get repository instance
    public static IRoomRepository getRepository() {
        if (repository == null) {
            repository = new RoomRepository();
        }
        return repository;
    }

    @Override
    public Room create(Room room) {
        boolean success = listOfRooms.add(room);
        if (success) {
            return room;
        }
        return null;
    }

    @Override
    public Room read(String roomType) {
        for (Room r : listOfRooms) {
            if (r.getRoomType().equals(roomType)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public Room update(Room room) {
        String roomType = room.getRoomType();
        Room outdatedRoom = read(roomType);
        if (outdatedRoom == null) {
            return null;
        }
        boolean success = delete(roomType);
        if (success) {
            if (listOfRooms.add(room)) {
                return room;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String roomType) {
        Room deletedRoom = read(roomType);
        if (deletedRoom == null) {
            return false;
        }
        return listOfRooms.remove(deletedRoom);
    }

    @Override
    public List<Room> getallstuff() {
        return null;
    }

    @Override
    public List<Room> getall() {
        return null;
    }

    @Override
    public List<Room> getAll() {
        return listOfRooms;
    }
}
