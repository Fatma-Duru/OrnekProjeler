import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir pozitif tam sayı girin: ");
        int sayi = scan.nextInt();

        // Asal sayıyı kontrol etme
        boolean asal = true;

        // 2'den başlayarak sayının kareköküne kadar kontrol etme
        if (sayi <= 1) {
            asal = false; // 1 ve daha küçük sayılar asal değildir
        } else {
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asal = false; // Sayı asal değil
                    break; // Döngüden çık
                }
            }
        }

        // Sonucu yazdırma
        if (asal) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

        // Kaynağı kapatma
        scan.close();
    }
}
