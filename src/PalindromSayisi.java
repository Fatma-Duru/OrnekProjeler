import java.util.Scanner;

public class PalindromSayisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir tam sayı girin: ");
        int sayi = scan.nextInt();

        // Palindrom kontrolü için değişkenler
        int orijinalSayi = sayi; // Orijinal sayıyı saklamak için
        int tersSayi = 0; // Ters çevrilen sayıyı tutmak için

        // Sayıyı ters çevirme
        while (sayi > 0) {
            int basamak = sayi % 10; // Sayının son basamağını alma
            tersSayi = (tersSayi * 10) + basamak; // Ters sayıyı oluşturma
            sayi /= 10; // Son basamağı kaldırma
        }

        // Palindrom kontrolü
        if (orijinalSayi == tersSayi) {
            System.out.println(orijinalSayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(orijinalSayi + " bir palindrom sayı değildir.");
        }

        // Kaynağı kapatma
        scan.close();
    }
}
