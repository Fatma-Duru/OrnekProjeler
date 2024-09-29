import java.util.Scanner;

public class GuvenliGirisSistemi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Önceden tanımlı kullanıcı adı ve şifre
        String dogruKullaniciAdi = "admin";
        String dogruSifre = "12345";

        // Kullanıcıdan giriş bilgilerini alma
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = scan.nextLine();

        System.out.print("Şifre: ");
        String sifre = scan.nextLine();

        // Giriş kontrolü
        if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı! Hoş geldiniz.");
        } else {
            System.out.println("Giriş başarısız! Kullanıcı adı veya şifre hatalı.");
        }

        scan.close();
    }
}
