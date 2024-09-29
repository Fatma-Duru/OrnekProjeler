import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class YilanOyunu {
    private static final char EMPTY = ' ';
    private static final char SNAKE = 'O';
    private static final char FOOD = '*';
    private static final int WIDTH = 20;
    private static final int HEIGHT = 10;

    private static ArrayList<int[]> snake;
    private static int[] food;
    private static char[][] board;
    private static int direction;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeGame();

        while (true) {
            printBoard();
            System.out.print("Yön girin (W/A/S/D): ");
            char input = scanner.nextLine().toUpperCase().charAt(0);
            updateDirection(input);
            moveSnake();
            if (checkCollision()) {
                System.out.println("Oyun Bitti! Yılan duvara çarptı veya kendine vurdu.");
                break;
            }
            if (checkFood()) {
                growSnake();
                spawnFood();
            }
        }

        scanner.close();
    }

    private static void initializeGame() {
        snake = new ArrayList<>();
        snake.add(new int[]{HEIGHT / 2, WIDTH / 2}); // Yılanın başlangıç konumu
        board = new char[HEIGHT][WIDTH];
        spawnFood();
        direction = 1; // Başlangıç yönü (sağ)
    }

    private static void printBoard() {
        // Boş alanları doldur
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                board[y][x] = EMPTY;
            }
        }

        // Yılanı ve meyveyi tahtaya yerleştir
        for (int[] segment : snake) {
            board[segment[0]][segment[1]] = SNAKE;
        }
        board[food[0]][food[1]] = FOOD;

        // Tahtayı yazdır
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    private static void updateDirection(char input) {
        switch (input) {
            case 'W': direction = 0; break; // yukarı
            case 'A': direction = 3; break; // sola
            case 'S': direction = 2; break; // aşağı
            case 'D': direction = 1; break; // sağ
        }
    }

    private static void moveSnake() {
        int[] head = snake.get(0);
        int newX = head[1];
        int newY = head[0];

        // Yılanın yönüne göre yeni pozisyon hesapla
        switch (direction) {
            case 0: newY--; break; // yukarı
            case 1: newX++; break; // sağ
            case 2: newY++; break; // aşağı
            case 3: newX--; break; // sola
        }

        // Yeni baş kısmını ekle
        snake.add(0, new int[]{newY, newX});

        // Yılanın uzunluğunu azalt
        if (!checkFood()) {
            snake.remove(snake.size() - 1);
        }
    }

    private static boolean checkCollision() {
        int[] head = snake.get(0);
        int headY = head[0];
        int headX = head[1];

        // Duvar kontrolü
        if (headX < 0 || headX >= WIDTH || headY < 0 || headY >= HEIGHT) {
            return true;
        }

        // Kendine çarpma kontrolü
        for (int i = 1; i < snake.size(); i++) {
            if (headY == snake.get(i)[0] && headX == snake.get(i)[1]) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkFood() {
        int[] head = snake.get(0);
        return head[0] == food[0] && head[1] == food[1];
    }

    private static void growSnake() {
        // Yılanın boyunu artırmak için mevcut baş konumunu tekrar ekle
        snake.add(snake.size(), snake.get(snake.size() - 1));
    }

    private static void spawnFood() {
        Random rand = new Random();
        int x, y;

        // Meyve için rastgele bir konum oluştur
        do {
            x = rand.nextInt(WIDTH);
            y = rand.nextInt(HEIGHT);
        } while (isFoodOnSnake(y, x));

        food = new int[]{y, x};
    }

    private static boolean isFoodOnSnake(int y, int x) {
        for (int[] segment : snake) {
            if (segment[0] == y && segment[1] == x) {
                return true;
            }
        }
        return false;
    }
}
