import java.util.Scanner;

public class UsAlmaIslemi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan taban ve kuvvet alma
        System.out.print("Tabanı girin: ");
        double taban = scan.nextDouble();

        System.out.print("Üssü girin: ");
        int us = scan.nextInt();

        // Üs alma işlemi
        double sonuc = 1; // Başlangıç değeri 1

        for (int i = 0; i < us; i++) {
            sonuc *= taban; // Tabanı kendisiyle çarpma
        }

        // Sonucu yazdırma
        System.out.println(taban + " üzeri " + us + " = " + sonuc);

        // Kaynağı kapatma
        scan.close();
    }
}

