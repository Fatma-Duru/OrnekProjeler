import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class BuyuktenKucugeSirala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan kaç sayı gireceğini al
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scan.nextInt();

        // Sayıları tutacak dizi oluştur
        Double[] sayilar = new Double[n];

        // Kullanıcıdan sayıları al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scan.nextDouble();
        }

        // Sayıları büyükten küçüğe sıralama
        Arrays.sort(sayilar, Collections.reverseOrder());

        // Sonuçları yazdırma
        System.out.println("Büyükten küçüğe sıralanmış sayılar: " + Arrays.toString(sayilar));

        scan.close();
    }
}
