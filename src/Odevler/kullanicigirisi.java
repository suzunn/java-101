package Odevler;

import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args){
        String kullaniciadi, sifre;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanci adinizi girin: ");
        kullaniciadi = sc.nextLine();

        System.out.print("Şifrenizi girin: ");
        sifre = sc.nextLine();

        if(kullaniciadi.equals("sarif") && sifre.equals("1234567s")){
            System.out.println("Başarıyla giriş yaptınız!");
        }else{
            System.out.println("Şifreniz yanlış,\nSıfırlamak için: \"1\"\nÇıkmak için: \"2\"");
            int yesno = sc.nextInt();
            sc.nextLine();

            if (yesno==1){
                while(true){
                    System.out.print("Yeni şifrenizi girin: ");
                    sifre = sc.nextLine();

                    if(sifre.equals("1234567s")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu.");
                        break;
                    }
                }
            }else{
                System.out.println("Çıkış yapıldı.");
            }
        }
    }
}
