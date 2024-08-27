// package CollectionFramework;
import java.util.*;
public class LearnMaps {
    public static void main(String[] args) {
      
        Map<String,String> map = new HashMap<>();

        map.put("us","United state");
        map.put("in", "India");
        map.put("in", "India");
        map.put("br","Brazil");

        map.putIfAbsent("en", "Enland");

        map.remove("us");

        System.out.println(map.containsKey("in"));
        System.out.println(map.get("in"));

        System.out.println();
        System.out.println(map);

        System.out.println(map.getOrDefault("in", "Pakistan"));
        System.out.println("contain value = " + map.containsValue("India"));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
