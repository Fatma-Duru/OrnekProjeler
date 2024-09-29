import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan bir sayı alma
        System.out.print("Bir tam sayı girin: ");
        int sayi = scan.nextInt();

        // Basamak sayısını hesaplama
        int basamakSayisi = 0;

        // Sayının negatif olup olmadığını kontrol etme
        if (sayi < 0) {
            sayi = -sayi; // Negatifse sayıyı pozitif yap
        }

        // Sayı sıfırsa, basamak sayısı 1'dir
        if (sayi == 0) {
            basamakSayisi = 1;
        } else {
            // Sayıyı 10'a bölerek basamak sayısını hesaplama
            while (sayi > 0) {
                sayi /= 10; // Sayıyı 10'a böl
                basamakSayisi++; // Basamak sayısını artır
            }
        }

        // Sonucu yazdırma
        System.out.println("Girilen sayının basamak sayısı: " + basamakSayisi);

        // Kaynağı kapatma
        scan.close();
    }
}
