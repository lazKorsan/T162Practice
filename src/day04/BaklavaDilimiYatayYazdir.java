package day04;

import java.util.Scanner;

public class BaklavaDilimiYatayYazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Baklava dilimi boyutunu girin: ");
        int boyut = scanner.nextInt();
        int toplamSatir = 2 * boyut - 1;

        // Üst yarı
        for (int i = 1; i <= boyut; i++) {
            // Sol boşluklar
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Yıldızlar
            for (int k = i; k <= boyut; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Alt yarı
        for (int i = boyut - 1; i >= 1; i--) {
            // Sol boşluklar
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Yıldızlar
            for (int k = i; k <= boyut; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}