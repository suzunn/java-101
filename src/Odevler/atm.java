package Odevler;

import java.util.Scanner;
public class atm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nickname, password;
        int hak = 3;
        do {
            System.out.print("Kullanici adinizi girin: ");
            nickname = sc.nextLine();
            System.out.print("Sifrenizi giriniz: ");
            password = sc.nextLine();
            hak--;
            System.out.printf("%d hakkınız kaldı.\n",hak);
            if (hak == 0)break;
        }while(!password.equals("1234567") || !nickname.equals("babapro"));
        System.out.println("Yapmak istediğiniz işlemi girin: \n1-)Para Yatırma");
        int islem = sc.nextInt();
        switch(islem){
            case 1:
                System.out.println("para yatirma sectin");
                break;
            default:
                System.out.println("defolt");
        }
    }
}
