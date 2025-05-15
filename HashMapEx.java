import java.util.Map;
import java.util.HashMap;

public class HashMapEx 
{
    public static void main(String[] args) {
        
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",10);
        map1.put("B",20);
        System.out.println("Keys of HashMap: " + map1.keySet());
        System.out.println("Values of HashMap: " + map1.values());
        System.out.println("HashMap: "+map1);
        System.out.println("Entries of HashMap: " + map1.entrySet());
        int removedValue = map1.remove("A");
        System.out.println("Removed value: " + removedValue);
        System.out.println("HashMap after removing key 'A': " + map1);
    }    
}
