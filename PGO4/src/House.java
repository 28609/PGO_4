import java.util.ArrayList;
import java.util.List;

public class House {
    static int roomCount;
    List<Room> roomList;

    public House() {
        roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
        roomCount++;
    }

    public void addRooms(List<Room> rooms) {
        roomList.addAll(rooms);
        roomCount += rooms.size();
    }

    public int getRoomCount() {
        return roomCount;
    }
}