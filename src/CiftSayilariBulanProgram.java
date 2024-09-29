import java.util.Scanner;

public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir sayı girin: ");
        int sayi = scan.nextInt();

        // Çift sayıları bulma
        System.out.println("0 ile " + sayi + " arasındaki çift sayılar:");
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Kaynağı kapatma
        scan.close();
    }
}
