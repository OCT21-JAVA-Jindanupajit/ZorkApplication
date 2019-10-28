public class ValidateDirection {

    public static boolean IsValid(int currentRoom, String direction){

            if (!Data.roomDoorCollection.containsKey(currentRoom)) {
                return false;
            }

            if(Data.roomDoorCollection.get(currentRoom).containsKey(direction.toUpperCase())) {
                return true;
            }

            if(Data.roomDoorCollection.get(currentRoom).containsKey(direction.toUpperCase()+"X")) {
                return true;
            }

        return false;
    }

    public static boolean HasSecretRoom(int currentRoom, String direction) {
        if ((currentRoom == 6)&&(direction == "E"))
            return true;
        else
            return false;
    }

}
