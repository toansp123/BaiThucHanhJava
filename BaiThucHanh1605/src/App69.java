import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class App69 {
    public static void main(String[] args) {
        int n, number;

        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println("Nhap cac phan tu: ");
        n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1) + ":");
            number = sc.nextInt();
            set.add(number);
        }
        System.out.println("Cac phan tu trong set la: ");
        System.out.println(set);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();

        if (!set.contains(number)) {
            set.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong set: ");
            System.out.println(set);
        } else
            System.out.println("Phan tu " + number + "Khong ton tai trong set");
    }
}
