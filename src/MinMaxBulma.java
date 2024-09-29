import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan kaç sayı gireceğini alma
        System.out.print("Kaç sayı gireceksiniz? ");
        int n = scan.nextInt();

        // Sayıları tutmak için dizi oluşturma
        int[] sayilar = new int[n];

        // Kullanıcıdan sayıları alma
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scan.nextInt();
        }

        // Min ve Max değerleri hesaplama
        int min = sayilar[0];
        int max = sayilar[0];

        for (int i = 1; i < n; i++) {
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        }

        // Sonuçları yazdırma
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maksimum Değer: " + max);

        // Kaynağı kapatma
        scan.close();
    }
}

