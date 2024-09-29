import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();
        int secim;

        do {
            System.out.println("\nYapılacaklar Listesi");
            System.out.println("1. Madde Ekle");
            System.out.println("2. Madde Sil");
            System.out.println("3. Listeyi Göster");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scan.nextInt();
            scan.nextLine(); // Buffer temizle

            switch (secim) {
                case 1:
                    System.out.print("Eklemek istediğiniz maddeyi girin: ");
                    String madde = scan.nextLine();
                    todoList.add(madde);
                    System.out.println("Madde eklendi.");
                    break;
                case 2:
                    System.out.print("Silmek istediğiniz madde numarasını girin: ");
                    int silinecekIndex = scan.nextInt() - 1; // Kullanıcıdan 1 tabanlı girdi alıyoruz
                    if (silinecekIndex >= 0 && silinecekIndex < todoList.size()) {
                        todoList.remove(silinecekIndex);
                        System.out.println("Madde silindi.");
                    } else {
                        System.out.println("Geçersiz madde numarası.");
                    }
                    break;
                case 3:
                    System.out.println("Yapılacaklar Listesi:");
                    if (todoList.isEmpty()) {
                        System.out.println("Liste boş.");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        } while (secim != 4);

        scan.close();
    }
}
