import java.util.Scanner;

public class SelectionSort {
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

        // Seçim sıralama algoritması
        for (int i = 0; i < diziBoyutu - 1; i++) {
            int minIndex = i; // En küçük elemanın indeksini başta mevcut indeks olarak ayarlama

            // Dizinin geri kalanını kontrol etme
            for (int j = i + 1; j < diziBoyutu; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j; // Yeni en küçük eleman bulundu
                }
            }

            // En küçük eleman ile mevcut elemanı takas etme
            if (minIndex != i) {
                int temp = dizi[i];
                dizi[i] = dizi[minIndex];
                dizi[minIndex] = temp;
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("Sıralanmış dizi:");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

        scan.close();
    }
}
