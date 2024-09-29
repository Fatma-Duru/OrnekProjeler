import java.util.Scanner;

public class KuvvetBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan taban ve kuvvet alma
        System.out.print("Tabanı girin: ");
        double taban = scan.nextDouble();

        System.out.print("Kuvveti girin: ");
        int kuvvet = scan.nextInt();

        // Kuvvet hesaplama
        double sonuc = Math.pow(taban, kuvvet);

        // Sonucu yazdırma
        System.out.println(taban + " üzeri " + kuvvet + " = " + sonuc);

        // Kaynağı kapatma
        scan.close();
    }
}
