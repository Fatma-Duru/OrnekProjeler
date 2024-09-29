import java.util.Scanner;

public class SicaklikDonusturucu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sıcaklık Dönüştürücü");
        System.out.println("1. Celsius'tan Fahrenheit'a");
        System.out.println("2. Fahrenheit'tan Celsius'a");
        System.out.print("Dönüştürmek istediğiniz seçeneği girin (1 veya 2): ");
        int secim = scan.nextInt();

        double sonuc;

        if (secim == 1) {
            System.out.print("Celsius değerini girin: ");
            double celsius = scan.nextDouble();
            sonuc = celsiusToFahrenheit(celsius);
            System.out.printf("Sonuç: %.2f Fahrenheit\n", sonuc);
        } else if (secim == 2) {
            System.out.print("Fahrenheit değerini girin: ");
            double fahrenheit = scan.nextDouble();
            sonuc = fahrenheitToCelsius(fahrenheit);
            System.out.printf("Sonuç: %.2f Celsius\n", sonuc);
        } else {
            System.out.println("Geçersiz seçim. Lütfen 1 veya 2 girin.");
        }

        scan.close();
    }

    // Celsius'tan Fahrenheit'a dönüşüm
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit'tan Celsius'a dönüşüm
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
