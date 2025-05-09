package day04;

import java.util.Scanner;

public class DoWhileSayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* while ve do-while farkını görelim:
         * while -> önce kontrol eder, sonra çalışır
         * do-while -> önce bir kez çalışır, sonra kontrol eder
         */

        // ÖRNEK 1: while kullanımı
        System.out.println("1. Oyuncu - 1 ile 100 arasında bir sayı giriniz: ");
        int tutulanSayi = scanner.nextInt();

        while (tutulanSayi < 1 || tutulanSayi > 100) {
            System.out.println("Lütfen 1-100 arasında bir sayı giriniz!");
            tutulanSayi = scanner.nextInt();
        }

        // Ekranı temizle
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("2. Oyuncu - Tahmin oyunu başlıyor!");
        System.out.println("1-100 arasındaki sayıyı tahmin edin");

        // ÖRNEK 2: do-while kullanımı
        int tahmin;
        int denemeSayisi = 0;

        do {
            System.out.println("\nTahmininizi giriniz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            // Tahmin kontrolü ve ipuçları
            if (tahmin < tutulanSayi) {
                System.out.println("YUKARI - Daha büyük bir sayı söylemelisin!");
            } else if (tahmin > tutulanSayi) {
                System.out.println("AŞAĞI - Daha küçük bir sayı söylemelisin!");
            }

            // Uzaklık ipucu ekleyelim
            int fark = Math.abs(tutulanSayi - tahmin);
            if (tahmin != tutulanSayi) {
                if (fark <= 5) System.out.println("ÇOK YAKINSIN!");
                else if (fark <= 10) System.out.println("YAKINLAŞIYORSUN!");
                else System.out.println("UZAKSIN!");
            }

        } while (tahmin != tutulanSayi); // Şart sağlandığı sürece döngü devam eder

        System.out.println("\n🎉 TEBRİKLER! " + denemeSayisi + ". denemede bildiniz!");

        scanner.close();
    }
}
