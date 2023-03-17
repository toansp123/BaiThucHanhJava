import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App113 {
    public static void main(String[] args) throws Exception {
        HashSet<String> Fruit = new HashSet<>();

        Fruit.add("Nho");
        Fruit.add("Buoi");
        Fruit.add("Tao");
        Fruit.add("Mang cut");
        Fruit.add("Nhan");
        Fruit.add("Cam");
        Fruit.add("Chuoi");

        int size = Fruit.size();
        System.out.println("Co " + size + " loai trai cay ");

        System.out.println("Nhap loai trai cay can tim: ");
        Scanner TCay = new Scanner(System.in);
        String fruitNeed = TCay.next();

        for(String item : Fruit) {
            if(item == fruitNeed){
                System.out.println("Co ton tai ! ");
            }
            else
                System.out.println("Khong ton tai ! ");
        }

        Fruit.remove("Chuoi");
        for(String item : Fruit) {
            System.out.println(item);
        }

        HashSet<String> NewFruit = new HashSet<>();
        NewFruit.add("Mit");
        NewFruit.add("Mo");

        for(String item : NewFruit) {
            Fruit.add(item);
        }

        Iterator<String> iterator = Fruit.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}