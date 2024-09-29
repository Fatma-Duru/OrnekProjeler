import java.util.Scanner;

public class MetniTersCevir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan metni alma
        System.out.print("Lütfen bir metin giriniz: ");
        String metin = scan.nextLine();

        // Metni ters çevirme
        String tersMetin = tersCevir(metin);

        // Sonucu ekrana yazdırma
        System.out.println("Ters çevrilmiş metin: " + tersMetin);

        scan.close();
    }

    // Metni ters çeviren metot
    public static String tersCevir(String metin) {
        StringBuilder sb = new StringBuilder(metin);
        return sb.reverse().toString();
    }
}
