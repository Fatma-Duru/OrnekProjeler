import java.util.Scanner;

public class DiziMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu alma
        System.out.print("Dizi boyutunu girin: ");
        int diziBoyutu = scan.nextInt();

        // Dizi oluşturma
        int[] dizi = new int[diziBoyutu];

        // Kullanıcıdan dizinin elemanlarını alma
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = scan.nextInt();
        }

        // Min ve max değerleri başlangıçta ilk elemanla ayarlama
        int min = dizi[0];
        int max = dizi[0];

        // Min ve max değerleri bulma
        for (int i = 1; i < diziBoyutu; i++) {
            if (dizi[i] < min) {
                min = dizi[i]; // Yeni min değer
            }
            if (dizi[i] > max) {
                max = dizi[i]; // Yeni max değer
            }
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Dizinin en küçük elemanı: " + min);
        System.out.println("Dizinin en büyük elemanı: " + max);

        scan.close();
    }
}
