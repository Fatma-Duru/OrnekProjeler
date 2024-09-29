import java.util.Scanner;

public class DiziOrtalama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu alma
        System.out.print("Dizi boyutunu girin: ");
        int diziBoyutu = scan.nextInt();

        // Dizi oluşturma
        double[] dizi = new double[diziBoyutu];

        // Kullanıcıdan dizinin elemanlarını alma
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = scan.nextDouble();
        }

        // Elemanların toplamını hesaplama
        double toplam = 0;
        for (double eleman : dizi) {
            toplam += eleman;
        }

        // Ortalama hesaplama
        double ortalama = toplam / diziBoyutu;

        // Sonucu ekrana yazdırma
        System.out.println("Dizinin ortalaması: " + ortalama);

        scan.close();
    }
}
