import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan cümle alma
        System.out.print("Bir cümle girin: ");
        String cumle = scan.nextLine();

        // Harf frekansını tutmak için bir HashMap
        Map<Character, Integer> frekans = new HashMap<>();

        // Cümledeki her karakteri kontrol etme
        for (char harf : cumle.toCharArray()) {
            // Harf bir boşluk değilse
            if (harf != ' ') {
                // Harf frekansını güncelleme
                frekans.put(harf, frekans.getOrDefault(harf, 0) + 1);
            }
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Harflerin frekansları:");
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " kez");
        }

        scan.close();
    }
}
