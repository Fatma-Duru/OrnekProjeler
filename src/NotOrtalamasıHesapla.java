import java.util.Scanner;

public class NotOrtalamasıHesapla {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Değişkenlerin tanımlanması
                int fizik, matematik, turkce, kimya, muzik, tarih;

                // Kullanıcıdan notları alma
                System.out.print("Fizik Notunuz: ");
                fizik = input.nextInt();

                System.out.print("Matematik Notunuz: ");
                matematik = input.nextInt();

                System.out.print("Türkçe Notunuz: ");
                turkce = input.nextInt();

                System.out.print("Kimya Notunuz: ");
                kimya = input.nextInt();

                System.out.print("Müzik Notunuz: ");
                muzik = input.nextInt();

                System.out.print("Tarih Notunuz: ");
                tarih = input.nextInt();

                // Not ortalamasını hesaplama
                double ortalama = (fizik + matematik + turkce + kimya + muzik + tarih) / 6.0;

                // Ortalamayı ekrana yazdırma
                System.out.println("Not Ortalamanız: " + ortalama);

                // Başarı durumunu kontrol etme
                if (ortalama >= 60) {
                    System.out.println("Tebrikler, sınıfı geçtiniz!");
                } else {
                    System.out.println("Maalesef, sınıfta kaldınız.");
                }

                input.close();
            }
        }




