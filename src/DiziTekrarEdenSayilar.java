import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiziTekrarEdenSayilar {
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

        // Tekrar eden sayıları bulmak için bir HashMap kullanma
        Map<Integer, Integer> sayiSayaci = new HashMap<>();

        // Dizideki elemanları sayma
        for (int sayi : dizi) {
            if (sayiSayaci.containsKey(sayi)) {
                sayiSayaci.put(sayi, sayiSayaci.get(sayi) + 1);
            } else {
                sayiSayaci.put(sayi, 1);
            }
        }

        // Tekrar eden sayıları ekrana yazdırma
        System.out.println("Tekrar eden sayılar:");
        boolean tekrarEdenVar = false;
        for (Map.Entry<Integer, Integer> entry : sayiSayaci.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kez tekrar ediyor.");
                tekrarEdenVar = true;
            }
        }

        if (!tekrarEdenVar) {
            System.out.println("Tekrar eden sayı yok.");
        }

        scan.close();
    }
}
