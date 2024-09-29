import java.util.Scanner;
public class KdvHesaplama {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // Değişkenlerin tanımlanması
            double price, total, kdvPrice, rate = 18;

            // Kullanıcıdan fiyat girişi
            System.out.print("Tutar Giriniz: ");
            price = scan.nextDouble();

            // KDV'li fiyat hesaplama
            kdvPrice = price * rate / 100;
            total = price + kdvPrice;

            // Sonuçları ekrana yazdırma
            System.out.println("KDV Oranı: " + rate);
            System.out.println("KDV Tutarı: " + kdvPrice);
            System.out.println("KDV'li Fiyat: " + total);

            scan.close();
        }
    }


