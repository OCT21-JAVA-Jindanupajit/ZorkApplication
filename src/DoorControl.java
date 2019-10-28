import java.util.HashMap;

public class DoorControl {

    public static int moveThrough(int currentRoom, String direction) {
        int nextRoom = currentRoom;
        String roomName;

        if(ValidateDirection.IsValid(currentRoom,direction)) {


            HashMap<String,Integer> nextDoor = Data.roomDoorCollection.get(currentRoom);


            nextRoom = nextDoor.get(direction);


            roomName = Data.roomName.get(nextRoom);
            System.out.println("You are in " + roomName);
            System.out.println(nextRoom);
        }


        return nextRoom;
    }

}
