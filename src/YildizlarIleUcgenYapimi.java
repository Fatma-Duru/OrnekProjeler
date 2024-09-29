import java.util.Scanner;

public class YildizlarIleUcgenYapimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan üçgenin yüksekliğini alma
        System.out.print("Üçgenin yüksekliğini girin: ");
        int yukseklik = scan.nextInt();

        // Üçgenin oluşturulması
        for (int i = 1; i <= yukseklik; i++) {
            // Boşluklar için döngü
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" "); // Yıldızdan önce boşluk
            }

            // Yıldızlar için döngü
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Yıldız
            }

            // Yeni satıra geçme
            System.out.println();
        }

        // Kaynağı kapatma
        scan.close();
    }
}
