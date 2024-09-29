import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan yükseklik alma
        System.out.print("Ters üçgenin yüksekliğini girin: ");
        int yukseklik = scan.nextInt();

        // Ters üçgeni oluşturma
        for (int i = yukseklik; i >= 1; i--) {
            // Boşlukları yazdırma
            for (int j = 0; j < yukseklik - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdırma
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Yeni satıra geçme
            System.out.println();
        }

        // Kaynağı kapatma
        scan.close();
    }
}
