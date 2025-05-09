package day04;

import java.util.Scanner;

public class gmailKontrol {
    public static void main(String[] args) {
        /*
          kullanıcıdan bir e-posta adresi girmesini isteyin,
           ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,

örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen e posta adresinizi giriniz.");

        String email = scanner.nextLine();

        if (!email.contains("hotmail")){

            email = email.replace("hotmail","gmail");
        }
        System.out.println("sisteme kayıt alınan mail adresiniz  "+ email);





















    }
}
