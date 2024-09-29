import java.util.Scanner;

public class YukselenBurcBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan doğum tarihi ve saati alma
        System.out.print("Doğum tarihinizi (GG/AA/YYYY) formatında girin: ");
        String tarih = scan.nextLine();

        System.out.print("Doğum saatinizi girin (0-23 saat, 0-59 dakika): ");
        String saat = scan.nextLine();

        // Yükselen burcu tahmin etme (basit bir örnek)
        String yukselenBurc = hesaplaYukselenBurc(tarih, saat);

        // Sonucu yazdırma
        System.out.println("Yükselen Burcunuz: " + yukselenBurc);

        // Kaynağı kapatma
        scan.close();
    }

    private static String hesaplaYukselenBurc(String tarih, String saat) {
        // Basit bir örnek, gerçek hesaplama için karmaşık algoritmalar gereklidir
        // Bu örnek sadece sabit tarihler kullanır

        // Örnek hesaplama için tarih ve saat üzerinden basit bir mantık
        // Gerçek hesaplamalar için astronomik veriler ve daha fazla detay gerekir
        String[] tarihParcalari = tarih.split("/");
        int gun = Integer.parseInt(tarihParcalari[0]);
        int ay = Integer.parseInt(tarihParcalari[1]);
        int yil = Integer.parseInt(tarihParcalari[2]);

        // Basit bir şekilde ayın 1-12 aralığında olup olmadığını kontrol et
        if (ay < 1 || ay > 12) {
            return "Geçersiz ay.";
        }

        // Yükselen burcu basit bir şekilde belirle
        if (gun >= 21 && ay == 3 || gun <= 19 && ay == 4) {
            return "Koç"; // Koç burcu
        } else if (gun >= 20 && ay == 4 || gun <= 20 && ay == 5) {
            return "Boğa"; // Boğa burcu
        } else if (gun >= 21 && ay == 5 || gun <= 20 && ay == 6) {
            return "İkizler"; // İkizler burcu
        } else if (gun >= 21 && ay == 6 || gun <= 22 && ay == 7) {
            return "Yengeç"; // Yengeç burcu
        } else if (gun >= 23 && ay == 7 || gun <= 22 && ay == 8) {
            return "Aslan"; // Aslan burcu
        } else if (gun >= 23 && ay == 8 || gun <= 22 && ay == 9) {
            return "Başak"; // Başak burcu
        } else if (gun >= 23 && ay == 9 || gun <= 22 && ay == 10) {
            return "Terazi"; // Terazi burcu
        } else if (gun >= 23 && ay == 10 || gun <= 21 && ay == 11) {
            return "Akrep"; // Akrep burcu
        } else if (gun >= 22 && ay == 11 || gun <= 21 && ay == 12) {
            return "Yay"; // Yay burcu
        } else if (gun >= 22 && ay == 12 || gun <= 19 && ay == 1) {
            return "Oğlak"; // Oğlak burcu
        } else if (gun >= 20 && ay == 1 || gun <= 18 && ay == 2) {
            return "Kova"; // Kova burcu
        } else {
            return "Balık"; // Balık burcu
        }
    }
}
