import java.util.Scanner;

public class OtobusBiletFiyati {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Bilet fiyatı bilgileri
        double normalFiyat = 0.1; // km başına fiyat (TL)

        // Kullanıcıdan mesafe alma
        System.out.print("Seyahat mesafesini (km) girin: ");
        int mesafe = scan.nextInt();

        // Kullanıcıdan yaş alma
        System.out.print("Yaşınızı girin: ");
        int yas = scan.nextInt();

        // Normal bilet fiyatı hesaplama
        double toplamFiyat = mesafe * normalFiyat;

        // İndirim uygulama
        if (yas < 12) {
            toplamFiyat *= 0.5; // %50 indirim
            System.out.println("Çocuk indiriminden faydalandınız.");
        } else if (yas >= 12 && yas < 24) {
            toplamFiyat *= 0.9; // %10 indirim
            System.out.println("Genç indiriminden faydalandınız.");
        } else if (yas > 65) {
            toplamFiyat *= 0.7; // %30 indirim
            System.out.println("Yaşlı indiriminden faydalandınız.");
        }

        // Sonuç yazdırma
        System.out.println("Toplam Bilet Fiyatınız: " + toplamFiyat + " TL");

        scan.close();
    }
}
