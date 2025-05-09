package day04;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İlk oyuncu sayıyı belirliyor
        System.out.println("1. Oyuncu - Lütfen tuttuğunuz sayıyı giriniz: ");
        int tutulanSayi = scanner.nextInt();

        // Ekranı temizlemek için birkaç boş satır
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("2. Oyuncu - Tahmin oyunu başlıyor!");
        int tahmin;
        int denemeSayisi = 0;

        do {
            System.out.println("Lütfen tahmininizi giriniz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin < tutulanSayi) {
                System.out.println("Daha BÜYÜK bir sayı giriniz!");
            } else if (tahmin > tutulanSayi) {
                System.out.println("Daha KÜÇÜK bir sayı giriniz!");
            }

        } while (tahmin != tutulanSayi);

        System.out.println("TEBRİKLER! " + denemeSayisi + ". denemede bildiniz!");

        scanner.close();
    }
}