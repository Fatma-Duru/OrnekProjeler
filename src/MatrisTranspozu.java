import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan matrisin boyutlarını alma
        System.out.print("Matrisin satır sayısını girin: ");
        int satirSayisi = scan.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutunSayisi = scan.nextInt();

        // Matris oluşturma
        int[][] matris = new int[satirSayisi][sutunSayisi];

        // Kullanıcıdan matrisin elemanlarını alma
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("matris[" + i + "][" + j + "] = ");
                matris[i][j] = scan.nextInt();
            }
        }

        // Transpozu oluşturmak için yeni bir matris
        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        // Transpozu hesaplama
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
