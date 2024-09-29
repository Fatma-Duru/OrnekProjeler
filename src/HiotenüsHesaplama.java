import java.util.Scanner;
public class HiotenüsHesaplama {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // Kullanıcıdan dik kenar uzunluklarını alma
            System.out.print("1. Kenarı Giriniz: ");
            int a = scan.nextInt();

            System.out.print("2. Kenarı Giriniz: ");
            int b = scan.nextInt();

            // Hipotenüs hesaplama
            double c = Math.sqrt((a * a) + (b * b));

            // Sonucu ekrana yazdırma
            System.out.println("Hipotenüs: " + c);

            scan.close();
        }
    }


