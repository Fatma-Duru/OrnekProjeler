import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan iki sayı al
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scan.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scan.nextDouble();

        // İşlem seçim
        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("Seçiminiz: ");
        int secim = scan.nextInt();

        double sonuc;

        // Seçime göre işlemi yapma
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
                // Bölme işlemi için sıfıra bölme kontrolü
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Bir sayıyı sıfıra bölemezsiniz!");
                }
                break;
            default:
                System.out.println("Geçersiz seçim! Lütfen 1, 2, 3 veya 4'ü seçin.");
        }

        scan.close();
    }
}
