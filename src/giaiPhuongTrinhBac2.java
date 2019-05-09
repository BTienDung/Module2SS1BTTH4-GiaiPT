import java.net.SocketOption;
import java.util.Scanner;

public class giaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        float a, b, c, x, denta, x1, x2;
        System.out.println("giai phuong trinh bac 2");
        System.out.println("ax+b=0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        a = scanner.nextFloat();
        System.out.println("b = ");
        b = scanner.nextFloat();

        if (a==0){
            x = -b;
            System.out.println("x = "+x);
        } else {
            x = -b/a;
            System.out.println("x = "+x);
        }
    }
}
