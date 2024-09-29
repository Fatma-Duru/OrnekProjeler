import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Harmonik serisini hesaplamak istediğiniz pozitif tam sayıyı girin: ");
        int n = scan.nextInt();

        // Harmonik seriyi hesaplama
        double harmonikSeri = 0.0; // Sonuç değişkeni

        if (n <= 0) {
            System.out.println("Pozitif bir tam sayı girin.");
        } else {
            for (int i = 1; i <= n; i++) {
                harmonikSeri += 1.0 / i; // Tersini toplama
            }

            // Sonucu yazdırma
            System.out.println(n + " sayısının harmonik serisi H(" + n + ") = " + harmonikSeri);
        }

        // Kaynağı kapatma
        scan.close();
    }
}
