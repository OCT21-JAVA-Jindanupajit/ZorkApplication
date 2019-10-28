import java.util.ArrayList;
import java.util.HashMap;

public class Data {

        public static HashMap<Integer, String> roomName = new HashMap<>();
        public static HashMap<Integer, Boolean> roomLocked = new HashMap<>();
        public static HashMap<Integer, ArrayList<String>> roomItemCollection = new HashMap<>();
        public static HashMap<Integer, HashMap<String, Integer>> roomDoorCollection = new HashMap<>();
        public static int counter= 0;
        public static int currentRoom = 1;

}

