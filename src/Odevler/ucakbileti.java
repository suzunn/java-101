package Odevler;

import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double mil, ucret;
        int age, tip;

        do{
            System.out.print("Mesafe giriniz: ");
            mil = sc.nextFloat();
            if(mil<=0)System.out.println("Hatalı Veri Girdiniz !");

        }while(mil<=0);

        do{
            System.out.print("Yaşınızı giriniz: ");
            age = sc.nextInt();
            if(age<=0)System.out.println("Hatalı Veri Girdiniz !");
        }while(age<=0);

        do{
            System.out.print("Yolculuk tipi:\n1-)Tek Yön\n2-)Gidiş-Dönüş");
            tip = sc.nextInt();
            if(tip!=1 && tip!=2)System.out.println("Hatalı Veri Girdiniz !");
        }while(tip!=1 && tip!=2);

        ucret = mil*1/10;
        double indirimli=0;
        if(age<12)indirimli = ucret * 1/2;
        if(12<=age && age<=24)indirimli = ucret*1/10;
        if(65<=age)indirimli = ucret*3/10;
        ucret = ucret - indirimli;
        if(tip==2){
            ucret = ucret*8/10;
            ucret*=2;
        }
        System.out.printf("Toplam Tutar: %.1fTL", ucret);
    }
}
