import java.util.Scanner;

public class FibonacciRecursive {

    // Fibonacci fonksiyonu
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Fibonacci(0) = 0
        } else if (n == 1) {
            return 1; // Fibonacci(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan kaç terim isteneceğini alma
        System.out.print("Fibonacci serisinde kaç terim istiyorsunuz? ");
        int terimSayisi = scan.nextInt();

        // Fibonacci serisini yazdırma
        System.out.print("Fibonacci Serisi: ");
        for (int i = 0; i < terimSayisi; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Kaynağı kapatma
        scan.close();
    }
}
