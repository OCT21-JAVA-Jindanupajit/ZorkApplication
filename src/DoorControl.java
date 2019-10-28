import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DoorControl {

    public static int moveThrough(int currentRoom, String direction) {
        int nextRoom = currentRoom;
        String roomName;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Validate %d, %s\n", currentRoom, direction);
        if(ValidateDirection.IsValid(currentRoom,direction)) {
            HashMap<String,Integer> nextDoor = Data.roomDoorCollection.get(currentRoom);
            nextRoom = nextDoor.get(direction);

            System.out.println("Valid Direction");
            if (ValidateDirection.HasSecretRoom(currentRoom, direction)) {
                System.out.println("Has Secret Room");
                Random rand = new Random();
                boolean isLocked = false;
                int secretRoomRandom;


                isLocked = Data.roomLocked.get(nextRoom);


                if (isLocked) {
                    secretRoomRandom = rand.nextInt(5) + 1;
                }
                else {
                    secretRoomRandom = 1;
                }

                if(secretRoomRandom == 1) {
                    System.out.print("Do you want to go to that secret room?(y/n)");
                    switch(scanner.nextLine().trim().toUpperCase()) {
                        case "Y":
                            direction = direction + "X";
                            nextRoom = nextDoor.get(direction);
                            Data.roomLocked.replace(nextRoom,false);

                            break;
                        case "N":
                            break;
                        default:
                            System.out.println("Invalid answer");
                            return currentRoom;
                    }

                }
            }


            roomName = Data.roomName.get(nextRoom);
            System.out.println("You are in " + roomName);
            System.out.println("  room number #"+nextRoom);
            return nextRoom;
        }


        return nextRoom;
    }

}
