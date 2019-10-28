
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String userInput;

        boolean quitRequested = false;


        Data.init(Data.roomName, Data.roomLocked, Data.roomItemCollection, Data.roomDoorCollection);


        do {
            System.out.print("Enter direction you want to go [N,S,E,W], or [Q] to quit > ");

            // Might produce error
            userInput = keyboard.nextLine().trim().substring(0,1).toUpperCase();

            switch(userInput){
                case "N":
                    move("N");
                    break;
                case "S":
                    move("S");
                    break;
                case "E":
                    move("E");
                    break;
                case "W":
                    move("W");
                    break;
                case "Q":
                    quitRequested = true;
                    break;
                default:
                    System.out.println("Enter a valid direction.");
            }


        } while (!quitRequested);

        quit(Data.counter);


    }





    private static void move(String direction) {
        int newRoom = DoorControl.moveThrough(Data.currentRoom, direction);

        if (newRoom != Data.currentRoom) {
            Data.counter++;
        }

    }

    private static void quit(int counter) {

        System.out.printf("You moved %d times",counter);
    }
}



