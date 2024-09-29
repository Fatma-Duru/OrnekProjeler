import java.util.Scanner;

public class ArmstrongSayilari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan aralık alma
        System.out.print("Armstrong sayıları için alt sınırı girin: ");
        int altSinir = scan.nextInt();

        System.out.print("Armstrong sayıları için üst sınırı girin: ");
        int ustSinir = scan.nextInt();

        System.out.println(altSinir + " ile " + ustSinir + " arasındaki Armstrong sayıları:");

        // Armstrong sayıları bulma
        for (int sayi = altSinir; sayi <= ustSinir; sayi++) {
            int toplam = 0;
            int basamakSayisi = String.valueOf(sayi).length();
            int temp = sayi;

            // Her bir basamağı kontrol etme
            while (temp != 0) {
                int basamak = temp % 10;
                toplam += Math.pow(basamak, basamakSayisi);
                temp /= 10;
            }

            // Armstrong sayısı kontrolü
            if (toplam == sayi) {
                System.out.println(sayi);
            }
        }

        // Kaynağı kapatma
        scan.close();
    }
}
