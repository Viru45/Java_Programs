import java.util.Set;
import java.util.HashSet;

public class HashSetEx 
{
    public static void main(String[] args) 
    {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        System.out.println("Length of HashSet: " + s1.size());
        System.out.println("HashSet: " + s1);

        Set<Integer> s2 = new HashSet<>();
        s2.add(30);
        s2.add(40);
        System.out.println("HashSet: " + s2);

        // Adding all elements of s2 to s1
        s1.addAll(s2);
        System.out.println("HashSet after adding all elements of s2 to s1: " + s1);
    }

}
