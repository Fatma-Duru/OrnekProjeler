import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan doğum yılı alma
        System.out.print("Doğum yılınızı girin: ");
        int dogumYili = scan.nextInt();

        // Çin Zodyağı hayvanlarını tutan dizi
        String[] zodyakHayvanlari = {
                "Fare", "Sığır", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "Ata", "Koyun",
                "Maymun", "Horoz", "Köpek", "Domuz"
        };

        // Doğum yılının hangi hayvana denk geldiğini hesaplama
        int zodyakIndex = (dogumYili - 4) % 12; // 4 yılı başlangıç noktası olarak alır
        String zodyakHayvani = zodyakHayvanlari[zodyakIndex];

        // Sonucu yazdırma
        System.out.println("Doğum yılınız: " + dogumYili);
        System.out.println("Çin Zodyağı hayvanınız: " + zodyakHayvani);

        scan.close();
    }
}
