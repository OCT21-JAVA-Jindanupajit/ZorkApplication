public class DoorControl {

    public static int moveThrough(int currentRoom, String direction) {
        int nextRoom = currentRoom;
        String roomName;
        if(ValidateDirection.IsValid(currentRoom,direction)) {
            nextRoom = Data.roomDoorCollection.get(currentRoom)
                    .get(direction);
            roomName = Data.roomName.get(nextRoom);
            System.out.println("You are in " + roomName);
            System.out.println(nextRoom);
        }











        return nextRoom;
    }

}
