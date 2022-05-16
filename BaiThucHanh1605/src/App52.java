import java.util.HashSet;
import java.util.Scanner;

public class App52 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetIntegers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hashSetIntegers.add(0);
        hashSetIntegers.add(3);
        hashSetIntegers.add(1);
        hashSetIntegers.add(4);
        hashSetIntegers.add(2);
        hashSetIntegers.add(8);
        
        System.out.println("Cac phan tu trong hashInterger: ");
        System.out.println(hashSetIntegers);
        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();

        if (hashSetIntegers.contains(number)) {
            hashSetIntegers.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hastSetInterger sau khi them: ");
            System.out.println(hashSetIntegers);

        }else {
            System.out.println("Phan tu " + number + " Da ton tai!");
        }

    }
        
    }
