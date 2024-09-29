import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ücret bilgileri
        double baslangicUcreti = 5.0; // Başlangıç ücreti (TL)
        double kilometreUcreti = 2.0; // Kilometre başına ücret (TL)
        double beklemeUcreti = 0.5; // Bekleme süresi ücreti (TL/dakika)

        // Kullanıcıdan veri al
        System.out.print("Toplam mesafeyi (km) girin: ");
        double mesafe = scan.nextDouble();

        System.out.print("Bekleme süresini (dakika) girin: ");
        double beklemeSuresi = scan.nextDouble();

        // Ücret hesaplama
        double toplamUcret = baslangicUcreti + (kilometreUcreti * mesafe) + (beklemeUcreti * beklemeSuresi);

        // Sonucu ekrana yazdırma
        System.out.println("Toplam Taksimetre Ücreti: " + toplamUcret + " TL");

        scan.close();
    }
}
