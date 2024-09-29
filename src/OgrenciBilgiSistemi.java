import java.util.ArrayList;
import java.util.Scanner;

class Ogrenci {
    private String isim;
    private String numara;
    private double not;

    public Ogrenci(String isim, String numara, double not) {
        this.isim = isim;
        this.numara = numara;
        this.not = not;
    }

    public String getIsim() {
        return isim;
    }

    public String getNumara() {
        return numara;
    }

    public double getNot() {
        return not;
    }

    @Override
    public String toString() {
        return "İsim: " + isim + ", Numara: " + numara + ", Not: " + not;
    }
}

public class OgrenciBilgiSistemi {
    private static ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim;

        do {
            System.out.println("Öğrenci Bilgi Sistemi");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrencileri Listele");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scan.nextInt();
            scan.nextLine(); // Dummy read to consume newline character

            switch (secim) {
                case 1:
                    ogrenciEkle(scan);
                    break;
                case 2:
                    ogrencileriListele();
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        } while (secim != 3);

        scan.close();
    }

    private static void ogrenciEkle(Scanner scan) {
        System.out.print("Öğrencinin ismini girin: ");
        String isim = scan.nextLine();
        System.out.print("Öğrencinin numarasını girin: ");
        String numara = scan.nextLine();
        System.out.print("Öğrencinin notunu girin: ");
        double not = scan.nextDouble();

        Ogrenci yeniOgrenci = new Ogrenci(isim, numara, not);
        ogrenciListesi.add(yeniOgrenci);
        System.out.println("Öğrenci başarıyla eklendi!");
    }

    private static void ogrencileriListele() {
        if (ogrenciListesi.isEmpty()) {
            System.out.println("Hiç öğrenci kaydedilmemiş.");
        } else {
            System.out.println("Öğrenci Listesi:");
            for (Ogrenci ogrenci : ogrenciListesi) {
                System.out.println(ogrenci);
            }
        }
    }
}
