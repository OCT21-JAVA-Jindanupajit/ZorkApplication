import java.util.ArrayList;
import java.util.HashMap;

public class Data {

        public static HashMap<Integer, String> roomName = new HashMap<>();
        public static HashMap<Integer, Boolean> roomLocked = new HashMap<>();
        public static HashMap<Integer, ArrayList<String>> roomItemCollection = new HashMap<>();
        public static HashMap<Integer, HashMap<String, Integer>> roomDoorCollection = new HashMap<>();
        public static int counter= 0;
        public static int currentRoom = 1;


        public static void init(
                HashMap<Integer, String> roomName,
                HashMap<Integer, Boolean> roomLocked,
                HashMap<Integer, ArrayList<String>> roomItemCollection,
                HashMap<Integer, HashMap<String, Integer>> roomDoorCollection) {

                roomName.put(1,"foyer");
                roomLocked.put(1,false);
                ArrayList<String> itemInRoom1 = new ArrayList<>();
                        itemInRoom1.add("dead scorpion");
                roomItemCollection.put(1,itemInRoom1);
                HashMap<String, Integer> doorInRoom1= new HashMap<>();
                        doorInRoom1.put("N",2);
                roomDoorCollection.put(1,doorInRoom1);

                roomName.put(2,"front room");
                roomLocked.put(2,false);
                ArrayList<String> itemInRoom2 = new ArrayList<>();
                        itemInRoom2.add("piano");
                roomItemCollection.put(2,itemInRoom2);
                HashMap<String, Integer> doorInRoom2= new HashMap<>();
                        doorInRoom2.put("S",1);
                        doorInRoom2.put("W",3);
                        doorInRoom2.put("E",4);
                roomDoorCollection.put(2,doorInRoom2);


                roomName.put(3,"library");
                roomLocked.put(3,false);
                ArrayList<String> itemInRoom3 = new ArrayList<>();
                itemInRoom3.add("spiders");
                roomItemCollection.put(3,itemInRoom3);
                HashMap<String, Integer> doorInRoom3= new HashMap<>();
                doorInRoom3.put("E",2);
                doorInRoom3.put("N",5);
                roomDoorCollection.put(3,doorInRoom3);

                roomName.put(4,"kitchen");
                roomLocked.put(4,false);
                ArrayList<String> itemInRoom4 = new ArrayList<>();
                itemInRoom4.add("bats");
                roomItemCollection.put(4,itemInRoom4);
                HashMap<String, Integer> doorInRoom4= new HashMap<>();
                doorInRoom4.put("W",2);
                doorInRoom4.put("N",7);
                roomDoorCollection.put(4,doorInRoom4);


                roomName.put(5,"dining room");
                roomLocked.put(5,false);
                ArrayList<String> itemInRoom5 = new ArrayList<>();
                itemInRoom5.add("dust");
                itemInRoom5.add("empty box");
                roomItemCollection.put(5,itemInRoom5);
                HashMap<String, Integer> doorInRoom5= new HashMap<>();
                doorInRoom5.put("S",3);
                roomDoorCollection.put(5,doorInRoom5);


                roomName.put(6,"vault");
                roomLocked.put(6,false);
                ArrayList<String> itemInRoom6 = new ArrayList<>();
                itemInRoom6.add("3 walking skeletons");
                roomItemCollection.put(6,itemInRoom6);
                HashMap<String, Integer> doorInRoom6= new HashMap<>();
                doorInRoom6.put("E",7);
                doorInRoom6.put("EX",8);
                roomDoorCollection.put(6,doorInRoom6);


                roomName.put(7,"parlor");
                roomLocked.put(7,false);
                ArrayList<String> itemInRoom7 = new ArrayList<>();
                itemInRoom7.add("treasure chest");
                roomItemCollection.put(7,itemInRoom7);
                HashMap<String, Integer> doorInRoom7= new HashMap<>();
                doorInRoom7.put("W",6);
                doorInRoom7.put("S",4);
                roomDoorCollection.put(7,doorInRoom7);

                roomName.put(8,"secret room");
                roomLocked.put(8,true);
                ArrayList<String> itemInRoom8 = new ArrayList<>();
                itemInRoom8.add("piles of gold");
                roomItemCollection.put(8,itemInRoom8);
                HashMap<String, Integer> doorInRoom8= new HashMap<>();
                doorInRoom8.put("W",6);
                roomDoorCollection.put(8,doorInRoom8);

        }

}

