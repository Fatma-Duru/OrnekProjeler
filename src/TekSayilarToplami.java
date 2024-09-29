import java.util.Scanner;

public class TekSayilarToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir sayı girin: ");
        int sayi = scan.nextInt();

        int toplam = 0; // Tek sayıların toplamı

        // Tek sayıları bulma ve toplamını hesaplama
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 != 0) { // Tek sayı kontrolü
                toplam += i; // Tek sayıyı toplama ekle
            }
        }

        // Sonucu yazdırma
        System.out.println("0 ile " + sayi + " arasındaki tek sayıların toplamı: " + toplam);

        // Kaynağı kapatma
        scan.close();
    }
}
