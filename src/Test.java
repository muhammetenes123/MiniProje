
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu Girin: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu Giriniz (Örnek: 1,72): ");
        double boy = scanner.nextDouble();
        double bki = kilo/(boy*boy);
        
        if (bki > 0 && bki < 18.5) {
            System.out.println("Zayıf");
        }
        else if (bki >= 18.5 && bki< 25) {
            System.out.println("Normal");
        }
        else if (bki >= 25 && bki < 30) {
            System.out.println("Kilolu");
        }
        else if (bki >= 30 ) {
            System.out.println("Obez");
        }
        else
        {
            System.out.println("Hatalı Giriş");
        }
    }
}
