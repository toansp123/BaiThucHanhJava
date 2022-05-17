import java.util.LinkedHashSet;
import java.util.Set;

public class App60 {

    public static void main(String[] args) {
        Set<String> LinkedHashSet = new LinkedHashSet<String>();
        LinkedHashSet.add("Java");
        LinkedHashSet.add("C++");
        LinkedHashSet.add("C#");
        LinkedHashSet.add("Pascal");
        LinkedHashSet.add("Php");

        for (String sc : LinkedHashSet) {
            System.out.println(sc);
        }
    }
}