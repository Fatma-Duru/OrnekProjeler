import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir pozitif tam sayı girin: ");
        int sayi = scan.nextInt();

        // Mükemmel sayıyı kontrol etme
        int toplam = 0;

        // Pozitif bölenleri toplama
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Sonucu yazdırma
        if (toplam == sayi) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }

        // Kaynağı kapatma
        scan.close();
    }
}
