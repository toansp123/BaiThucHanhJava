import java.util.Set;
import java.util.LinkedHashSet;

public class App60 {
    public static void main(String[] args) {
         Set<String> linkedHashSet = new LinkedHashSet<>();
         
         linkedHashSet.add("Java");
         linkedHashSet.add("C++");
         linkedHashSet.add("Pascal");
         linkedHashSet.add("C#");

         for (String sc : linkedHashSet) {
             System.out.println(sc);
        }
    }
   
}