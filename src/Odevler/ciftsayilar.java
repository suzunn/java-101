package Odevler;

import java.util.Scanner;
public class ciftsayilar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("sayi gir: ");
        int sayi = sc.nextInt();
        float sum=0;
        int sayac=0;
        for (int i = 1; i<=sayi;i++){
            if(i%12==0){
                sum+=i;
                sayac++;
            }
        }
        sum /= sayac;
        System.out.printf("ortalamasi: %.2f", sum);
    }
}