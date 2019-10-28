
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String userInput;
        int counter= 0;
        boolean quitRequested = false;

        /* Room currentRoom = null;ArrayList<Room> roomCollection = null; */

        HashMap<Integer, String> roomName;
        HashMap<Integer, Boolean> roomLocked;
        HashMap<Integer, ArrayList<String>> roomItemCollection;
        HashMap<Integer, HashMap<String, Integer>> roomDoorCollection;

        init(roomName, roomLocked, roomItemCollection, roomDoorCollection);


        do {
            System.out.print("Which direction you want to go [ N, S, E, W] ? ");
            userInput = keyboard.nextLine().trim().toUpperCase();
            switch(userInput){
                case "N":
                    move(roomCollection, currentRoom);
                    break;
                case "S":
                    move(roomCollection, currentRoom);
                    break;
                case "E":
                    move(roomCollection, currentRoom);
                    break;
                case "W":
                    move(roomCollection, currentRoom);
                    break;
                case "Q":
                    quitRequested = true;
                    break;
                default:
                    System.out.println("Enter a valid direction.");
            }





        } while (!quitRequested);

        quit(counter);


    }
    private static void init(
        HashMap<Integer, String> roomName,
        HashMap<Integer, Boolean> roomLocked,
        HashMap<Integer, ArrayList<String>> roomItemCollection,
        HashMap<Integer, HashMap<String, Integer>> roomDoorCollection) {

        roomName.put(1,"foyer");
        roomLocked.put(1,false);

        roomName.put(2,"front room");
        roomLocked.put(2,false);


        roomName.put(3,"library");
        roomLocked.put(3,false);

        roomName.put(4,"kitchen");
        roomLocked.put(4,false);

        roomName.put(5,"dining room");
        roomLocked.put(5,false);

        roomName.put(6,"vault");
        roomLocked.put(6,false);

        roomName.put(7,"parlor");
        roomLocked.put(7,false);

        roomName.put(8,"secret room");
        roomLocked.put(8,true);

    }



    private static int move(ArrayList<Room> roomCollection, Room currentRoom) {

        return 0;
    }

    private static void quit(int counter) {

        System.out.printf("You moved %d times",counter);
    }
}







//class Room {
//    int number;
//    String name;
//    ArrayList<String> itemCollection;
//    ArrayList<Door> doorCollection;
//}
//
//class Door {
//    String direction; /* N S E W X */
//    Room nextRoom;
//    boolean isOpen = true;
//}