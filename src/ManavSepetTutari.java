import java.util.Scanner;
public class ManavSepetTutari { // Türkçe karakter kullanılmayan isim
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Meyve fiyatları (TL/kg)
        double elmaFiyat = 3.67;
        double armutFiyat = 2.14;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan alınan miktarlar (kg cinsinden)
        System.out.print("Kaç kilo elma aldınız? : ");
        double elmaKilo = scan.nextDouble();

        System.out.print("Kaç kilo armut aldınız? : ");
        double armutKilo = scan.nextDouble();

        System.out.print("Kaç kilo domates aldınız? : ");
        double domatesKilo = scan.nextDouble();

        System.out.print("Kaç kilo muz aldınız? : ");
        double muzKilo = scan.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız? : ");
        double patlicanKilo = scan.nextDouble();

        // Toplam tutarı hesaplama
        double toplamTutar = (elmaKilo * elmaFiyat) + (armutKilo * armutFiyat) +
                (domatesKilo * domatesFiyat) + (muzKilo * muzFiyat) +
                (patlicanKilo * patlicanFiyat);

        // Sonucu ekrana yazdırma
        System.out.println("Toplam Sepet Tutarınız: " + toplamTutar + " TL");

        scan.close();
    }
}
