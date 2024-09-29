import java.util.Scanner;

public class EBOKEKOK {

    // EBOK hesaplama fonksiyonu
    public static int ebok(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // EKOK hesaplama fonksiyonu
    public static int ekok(int a, int b) {
        return (a * b) / ebok(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sayıları alma
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scan.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scan.nextInt();

        // EBOK ve EKOK hesaplama
        int ebokSonuc = ebok(sayi1, sayi2);
        int ekokSonuc = ekok(sayi1, sayi2);

        // Sonuçları yazdırma
        System.out.println("EBOK(" + sayi1 + ", " + sayi2 + ") = " + ebokSonuc);
        System.out.println("EKOK(" + sayi1 + ", " + sayi2 + ") = " + ekokSonuc);

        // Kaynağı kapatma
        scan.close();
    }
}
