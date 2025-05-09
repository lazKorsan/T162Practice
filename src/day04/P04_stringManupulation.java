package day04;

import java.util.Scanner;

public class P04_stringManupulation {
    public static void main(String[] args) {

        // kredi kartı maskelenirken her 4 no da bir space boşluk bırabilirmiyiz
        // satır 54 deki yorumdaki kod kalsın ona sonra bakacam
        /*
         * SORU: Kullanıcıdan aldığınız Adı, Soyadı ve kredi kartı numaralarını
         * aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, 16 haneden küçük olursa
         * "Geçersiz kredi kartı numarası" yazdırın.
         *
         * Örnek Input : John White 1234234534561478
         * Örnek Output: Ad : J*** Soyad :W**** kartNo:***********1478
         * (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

        /* REGEX BILGISI:
         * \\d    ==> tum rakamlar (0-9)
         * \\D    ==> tum rakam disi karakterler
         * \\w    ==> A-Z, a-z, 0-9, _
         * \\W    ==> \\w'nin tersi
         * \\s    ==> space, whitespace
         * \\S    ==> space dışındaki herşey
         *
         * EXTRA REGEX BILGILERI:
         * (\\d{4}) ==> 4 rakamdan oluşan grup
         * [0-9]    ==> 0'dan 9'a kadar herhangi bir rakam
         * [a-zA-Z] ==> a'dan z'ye veya A'dan Z'ye herhangi bir harf
         * [^abc]   ==> a,b,c dışındaki karakterler
         * .        ==> herhangi bir karakter
         * +        ==> en az 1 veya daha fazla tekrar
         * *        ==> 0 veya daha fazla tekrar
         * ?        ==> 0 veya 1 tekrar
         * {n}      ==> n kez tekrar
         * {n,m}    ==> en az n, en fazla m kez tekrar
         */

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bilgileri alalım
        System.out.println("Lütfen adınızı giriniz: ");
        String ad = scanner.next();

        System.out.println("Lütfen soyadınızı giriniz: ");
        String soyad = scanner.next();

        System.out.println("Lütfen kart numaranızı giriniz: ");
        String kartNo = scanner.next();

        // Kart numarası kontrolü
        if (kartNo.length() != 16) {
            System.out.println("Geçersiz kredi kartı numarası");
            return;
        }

        // Ad maskeleme (ilk harf büyük, kalanı *)
        String maskeli_ad = ad.substring(0, 1).toUpperCase() +
                ad.substring(1).replaceAll("\\w", "*");

        // Soyad maskeleme (ilk harf büyük, kalanı *)
        String maskeli_soyad = soyad.substring(0, 1).toUpperCase() +
                soyad.substring(1).replaceAll("\\w", "*");

        // Kart numarası maskeleme (son 4 hane görünür)
        // String maskeli_kart = "*".repeat(12) + kartNo.substring(12);  satır 54
        String maskeli_kart = "****" + " " + "****" + " " + "****" + " " + kartNo.substring(12);

        // Sonuçları yazdırma
        System.out.println("Ad : " + maskeli_ad +
                " Soyad :" + maskeli_soyad +
                " kartNo:" + maskeli_kart);

        scanner.close();
    }
}
