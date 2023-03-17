import java.util.Scanner;
import java.util.LinkedList;
import java.text.DecimalFormat;

public class App111 {
    public static void main(String[] args) {
        int n, node, sum = 0, count = 0;
        double tbCong;
        DecimalFormat DCF = new DecimalFormat("#.##");
        Scanner TBC = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
         
    System.out.println("Nhap vao so phan tu cua danh sach : ");
    n = TBC.nextInt();
         
    for (int i = 1; i < n; i++) {
        System.out.println("Nhap vao phan tu thu " + i + ": ");
        node = TBC.nextInt();
        linkedList.add(node);
    }
         
    for (int i = 0; i < n; i++) {
        if (linkedList.get(i) % 2 == 0) {
            sum += linkedList.get(i);
            count++;  
        }
    }

    tbCong = (double)sum / count;
    System.out.println("Trung binh cong cac so chan trong danh sach = " + 
        DCF.format(tbCong));
    }

}