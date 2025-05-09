package day04;

import java.util.Scanner;

public class BaklavaDilimiYazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Baklava dilimi boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Üst kısım
        for (int i = 1; i <= boyut; i++) {
            // Boşluklar
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısım
        for (int i = boyut - 1; i >= 1; i--) {
            // Boşluklar
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}