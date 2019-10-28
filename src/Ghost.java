import java.util.Random;

public class Ghost {

    public static boolean FollowByGhost() {
        boolean isFollowByGhost = false;
        Random r=new Random();
        int ghost=1+r.nextInt(4);
        if (ghost==1){
            isFollowByGhost=true;
        }

        return isFollowByGhost;
    }
}
