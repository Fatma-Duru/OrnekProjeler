import java.util.Scanner;

public class GeriSayim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan geri sayım süresini alma
        System.out.print("Geri sayım için kaç saniye giriniz: ");
        int sayac = scan.nextInt();

        // Geri sayım
        for (int i = sayac; i >= 0; i--) {
            System.out.println(i);
            try {
                // 1 saniye bekleme
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Bekleme sırasında bir hata oluştu.");
            }
        }

        System.out.println("Geri sayım tamamlandı!");

        scan.close();
    }
}
