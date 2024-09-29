import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan yıl alma
        System.out.print("Bir yıl girin: ");
        int yil = scan.nextInt();

        // Artık yıl kontrolü
        boolean artikYil = false;

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            artikYil = true;
        }

        // Sonucu yazdırma
        if (artikYil) {
            System.out.println(yil + " yılı artık bir yıldır.");
        } else {
            System.out.println(yil + " yılı artık bir yıl değildir.");
        }

        scan.close();
    }
}
