import java.util.Scanner;
public class VicutKitleİndeksi {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // Kullanıcıdan kilo ve boy bilgilerini alma
            System.out.print("Kilonuzu giriniz (kg): ");
            double kilo = scan.nextDouble();

            System.out.print("Boyunuzu giriniz (metre cinsinden, örneğin 1.75): ");
            double boy = scan.nextDouble();

            // Vücut Kitle İndeksi hesaplama
            double vki = kilo / (boy * boy);

            // Sonucu ekrana yazdırma
            System.out.println("Vücut Kitle İndeksiniz: " + vki);

            // VKİ'ye göre sınıflandırma
            if (vki < 18.5) {
                System.out.println("Durum: Zayıf");
            } else if (vki >= 18.5 && vki < 24.9) {
                System.out.println("Durum: Normal");
            } else if (vki >= 25 && vki < 29.9) {
                System.out.println("Durum: Fazla kilolu");
            } else {
                System.out.println("Durum: Obez");
            }

            scan.close();
        }
    }


