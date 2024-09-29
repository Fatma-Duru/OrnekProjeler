import java.util.Scanner;

public class SMSMesajBoyuHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan mesaj alma
        System.out.print("Mesajınızı girin: ");
        String mesaj = scan.nextLine();

        // Mesajın uzunluğunu hesaplama
        int mesajUzunlugu = mesaj.length();
        int toplamSMS = (mesajUzunlugu <= 160) ? 1 : (mesajUzunlugu / 153) + 1;

        // Sonuçları yazdırma
        System.out.println("Mesaj Boyu: " + mesajUzunlugu + " karakter");
        System.out.println("Toplam SMS Sayısı: " + toplamSMS);

        // Kaynağı kapatma
        scan.close();
    }
}
