import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Faktöriyelini hesaplamak istediğiniz pozitif tam sayıyı girin: ");
        int sayi = scan.nextInt();

        // Faktöriyel hesaplama
        long faktoriyel = 1; // Sonuç değişkeni

        if (sayi < 0) {
            System.out.println("Negatif sayılar için faktöriyel tanımlı değildir.");
        } else {
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i; // Çarpma işlemi
            }

            // Sonucu yazdırma
            System.out.println(sayi + "! = " + faktoriyel);
        }

        // Kaynağı kapatma
        scan.close();
    }
}
