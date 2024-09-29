import java.util.Scanner;

public class SicakligaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sıcaklık değerini al
        System.out.print("Hava sıcaklığını derece cinsinden girin: ");
        double sicaklik = scan.nextDouble();

        // Sıcaklığa göre etkinlik önerme
        if (sicaklik < 5) {
            System.out.println("Bu havada kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Bu havada sinemaya gidebilirsiniz.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Bu havada pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Bu havada yüzmeye gidebilirsiniz.");
        }

        scan.close();
    }
}
