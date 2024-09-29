import java.util.Scanner;

public class AdamAsmaca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Oyun için kelime belirleme
        String[] kelimeler = {"JAVA", "PROGRAMLAMA", "KODLAMA", "OYUN", "ADAMASMACA"};
        String kelime = kelimeler[(int) (Math.random() * kelimeler.length)];

        StringBuilder gizliKelime = new StringBuilder("_".repeat(kelime.length()));
        int kalanHak = 6; // Kullanıcının tahmin hakkı

        System.out.println("Adam Asmaca Oyununa Hoşgeldiniz!");
        System.out.println("Tahmin etmek için bir harf girin.");

        // Oyun döngüsü
        while (kalanHak > 0 && gizliKelime.indexOf("_") != -1) {
            System.out.println("Gizli Kelime: " + gizliKelime);
            System.out.println("Kalan Hak: " + kalanHak);
            System.out.print("Bir harf girin: ");
            char tahmin = scan.next().toUpperCase().charAt(0);

            // Tahminin kelimede olup olmadığını kontrol etme
            boolean dogruTahmin = false;
            for (int i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == tahmin) {
                    gizliKelime.setCharAt(i, tahmin); // Doğru tahmin yapıldı
                    dogruTahmin = true;
                }
            }

            if (!dogruTahmin) {
                kalanHak--; // Hatalı tahmin
                System.out.println("Yanlış tahmin! Kalan hak: " + kalanHak);
            }
        }

        // Oyun sonu durumu
        if (kalanHak > 0) {
            System.out.println("Tebrikler! Kelimeyi buldunuz: " + kelime);
        } else {
            System.out.println("Üzgünüm, kelime: " + kelime + " idi. Oyun bitti.");
        }

        scan.close();
    }
}
