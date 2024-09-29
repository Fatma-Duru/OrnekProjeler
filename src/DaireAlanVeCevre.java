import java.util.Scanner;

public class DaireAlanVeCevre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan dairenin yarıçapını al
        System.out.print("Dairenin yarıçapını giriniz (cm): ");
        double yaricap = scan.nextDouble();

        // Alan ve çevre hesaplama
        double alan = Math.PI * yaricap * yaricap; // Alan = π * r^2
        double cevre = 2 * Math.PI * yaricap; // Çevre = 2 * π * r

        // Sonuçları ekrana yazdırma
        System.out.println("Dairenin Alanı: " + alan + " cm²");
        System.out.println("Dairenin Çevresi: " + cevre + " cm");

        scan.close();
    }
}
