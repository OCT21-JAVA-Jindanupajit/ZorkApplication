import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        ArrayList<Room> roomCollection;
        int counter= 0;
        Room currentRoom;





    }


    private static int move(HahMap<> map, int currentRoom, String userRequest) {

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