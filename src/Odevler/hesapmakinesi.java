package Odevler;

import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args){
        float sayi1, sayi2, sonuc;
        Scanner sc = new Scanner(System.in);

        System.out.print("1. sayiyi girin: ");
        sayi1 = sc.nextFloat();
        System.out.print("2. sayiyi girin: ");
        sayi2 = sc.nextFloat();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int islem = sc.nextInt();

        switch(islem){
            case 1:
                System.out.println("Toplam: "+(sayi1+sayi2));
            break;
            case 2:
                System.out.println("Çıkarma: "+(sayi1-sayi2));
            break;
            case 3:
                System.out.println("Çarpma: "+(sayi1*sayi2));
            break;
            case 4:
                if(sayi2==0){
                    System.out.println("bir sayi 0'a bölünmez");
                }else{
                    System.out.println("Bölme: "+(sayi1/sayi2));
                }
            break;
            default:
                System.out.println("yanlış seçim  yaptınız tekrar deneyiniz");
        }
    }
}
