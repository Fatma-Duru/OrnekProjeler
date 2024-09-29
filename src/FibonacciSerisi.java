import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını alma
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = scan.nextInt();

        // Fibonacci dizisini yazdırma
        System.out.print("Fibonacci Serisi: ");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // Mevcut sayıyı yazdır

            // Fibonacci hesaplama
            int c = a + b; // Yeni sayı
            a = b; // Bir sonraki sayı için a'yı güncelle
            b = c; // Bir sonraki sayı için b'yi güncelle
        }

        // Kaynağı kapatma
        scan.close();
    }
}
