package Lab1;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    /**
     * a map data structure is used to store pairs of objects
     * */
    public static void main(String[] args) {
        Map <String , Boolean > map = new HashMap<>() ;
        map.put("0", false) ;
        map.put("1" , true);
        System.out.println(map);
    }
}
