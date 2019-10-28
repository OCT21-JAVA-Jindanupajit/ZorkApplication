
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String userInput;
        ArrayList<Room> roomCollection;
        int counter= 0;
        Room currentRoom;
        boolean quitRequested = false;

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


    private static int move(ArrayList<Room> roomCollection, Room currentRoom) {

    }

    private static void quit(int counter) {

        System.out.printf("You moved %d times",counter);
    }
}


class Room {
    int number;
    String name;
    ArrayList<String> itemCollection;
    ArrayList<Door> doorCollection;
}

class Door {
    String direction; /* N S E W X */
    Room nextRoom;
    boolean isOpen = true;
}