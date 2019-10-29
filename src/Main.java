
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


        Data.init(Data.roomName, Data.roomLocked, Data.roomItemCollection, Data.roomDoorCollection, Data.roomMoneyCollection);
        enter(1);


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


    private static void enter(int room) {

        Data.currentRoom = room;
        PrintItemInRoom(Data.currentRoom);
        CollectMoney(Data.currentRoom);
        if (!Data.roomSeen.contains(room))
            Data.roomSeen.add(room);
    }


    private static void move(String direction) {
        int newRoom = DoorControl.moveThrough(Data.currentRoom, direction);

        if (newRoom != Data.currentRoom) {
            Data.counter++;
            enter(newRoom);
        }

    }

    public static void PrintItemInRoom(int room) {

       if ( Data.roomItemCollection.containsKey(room) ) {
           System.out.printf("Room #%d (%s) has these item(s):\n", room, Data.roomName.get(room));
           ArrayList<String> ItemCollection = Data.roomItemCollection.get(room);
           for (String item : ItemCollection) {
               System.out.println("  * "+item);
           }
           System.out.printf("  * Money of $%.2f\n", Data.roomMoneyCollection.get(room));
       }
    }

    public static void CollectMoney(int room) {
        Float money = Data.roomMoneyCollection.get(room);
        if (money <= 0) {
            System.out.println("There is no money to collect!");
        }
        else {
            System.out.printf("Collecting $%.2f ...\n", money);
            System.out.printf("Balance $%.2f + $%.2f = ", Data.myMoney, money);
            Data.myMoney += Data.roomMoneyCollection.get(room);
            Data.roomMoneyCollection.replace(room,0f);
            System.out.printf("$%.2f\n", Data.myMoney);
            CheckCharacter(Data.currentRoom);
        }

    }

    public static void CheckCharacter(int room) {
        if (room == Data.roomWithCharacter) {
            System.out.printf("Oh! No!, %s is in this room\n", Data.characterName);
            System.out.printf("All of your money was taken by %s\n", Data.characterName);
            Data.myMoney = 0;
            System.out.printf("Balance $%.2f\n", Data.myMoney);
        }
    }

    private static void quit(int counter) {

        System.out.printf("You moved %d times\n",counter);
        System.out.printf("You have seen %d rooms\n", Data.roomSeen.size());
        System.out.printf("You have $%.2f\n", Data.myMoney);
        for (Integer room : Data.roomSeen) {
            System.out.printf("You have seen room #%d (%s)\n", room, Data.roomName.get(room));
            for (String item : Data.roomItemCollection.get(room)) {
                System.out.printf(" * You have seen %s in room #%d (%s)\n", item, room, Data.roomName.get(room));
            }
        }

        if (Ghost.FollowByGhost())
            System.out.println("You are following by ghost!");
        else
            System.out.println("You are alone!");
    }
}



