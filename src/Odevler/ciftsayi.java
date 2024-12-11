package Odevler;

import java.util.Scanner;
public class ciftsayi {
    public static void main(String[] args){
        int toplam = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Bir sayı giriniz: ");
            int sayi = sc.nextInt();
            if (sayi%2==1)break;
            if (sayi%4==0){
                toplam += sayi;
            }
        }while(true);
        System.out.println("4 ve katı olan sayıların toplam: "+toplam);
    }
}
