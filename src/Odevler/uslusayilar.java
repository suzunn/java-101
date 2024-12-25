package Odevler;
import java.util.Scanner;
public class uslusayilar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("taban giriniz: ");
        int taban = sc.nextInt();
        System.out.print("üs giriniz: ");
        int us = sc.nextInt();
        int sonuc = 1;
        for(int i=1;i<=us;i++){
            sonuc=sonuc*taban;
        }
        System.out.print(sonuc);
    }
}
