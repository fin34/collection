import java.util.HashMap;
import java.util.Map;

public class Task403 {

    public static void main(String[] args) {

        Map<Integer,String> myFavoriteColors = new HashMap<Integer,String>();
        Map <Integer,String> myFriendsFavoriteColors = new HashMap <Integer,String> ();

        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColors);
        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColors);

        Map <Integer,String> ourFavoriteColors = new HashMap <Integer,String> ();

        for (Map.Entry<Integer, String> colour:myFavoriteColors.entrySet()) {
            ourFavoriteColors.put(colour.getKey(), colour.getValue());
        }
        for (Map.Entry<Integer, String> colour:myFriendsFavoriteColors.entrySet()) {
            ourFavoriteColors.put(colour.getKey(), colour.getValue());
        }

        System.out.println("Values from connected maps: " + ourFavoriteColors);
    }
}
