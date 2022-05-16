import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) {
        String name;
    HashSet<String> hashSetStrings = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    hashSetStrings.add("Wilson");
    hashSetStrings.add("Nike");
    hashSetStrings.add("Volvo");
    hashSetStrings.add("Kia");
    hashSetStrings.add("Lenovo");
    hashSetStrings.add("Lenovo");

    System.out.println("Cac phan tu trong HastSetString: ");
    System.out.println(hashSetStrings);
    System.out.println("Nhap phan tu can xoa ");
    name = scanner.nextLine();

    if (hashSetStrings.contains(name)) {
        hashSetStrings.remove(name);
        System.out.println("Xoa thanh cong!");
        System.out.println("Cac phan tu con lai trong hashSetString: ");
        System.out.println("cac phan tu con lai la: " + hashSetStrings);
		}
		else {
			System.out.println("phan tu khong ton tai");
		}
    }    
}
