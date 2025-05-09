package day04;

public class UcgenYazdirma {
    public static void main(String[] args) {
        int satirSayisi = 6;

        // Dış döngü - satırları kontrol eder
        for (int i = 1; i <= satirSayisi; i++) {
            // Boşlukları yazdırmak için
            for (int bosluk = 1; bosluk < i; bosluk++) {
                System.out.print(" ");
            }

            // Sayıları yazdırmak için
            for (int j = i; j <= satirSayisi; j++) {
                System.out.print(j + " ");
            }

            // Her satır sonunda alt satıra geç
            System.out.println();

            //1. En hızlı yöntem - Kısayol kullanarak:
            //    - Tüm editörlerde yazı boyutunu artırmak için: `.` `Alt``Shift`
            //    - Azaltmak için: `,` `Alt``Shift`
        }
    }
}
