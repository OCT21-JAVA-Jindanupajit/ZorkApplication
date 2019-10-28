public class ValidateDirection {

    public static boolean IsValid(int currentRoom, String direction){
        for (Integer room : Data.roomDoorCollection.keySet()) {

            if(Data.roomDoorCollection.get(room).containsKey(direction.toUpperCase())) {
                return true;
            }

            if(Data.roomDoorCollection.get(room).containsKey(direction.toUpperCase()+"X")) {
                return true;
            }
        }
        return false;
    }

}
