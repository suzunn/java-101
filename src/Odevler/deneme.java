package Programlar;

import java.util.Scanner;

public class deneme{
    public static void main(String[] Args){
        float kdv = 18/100f, oran, kdvli, kdvsiz;
        Scanner sc = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı girin: ");
        kdvsiz = sc.nextFloat();
        oran = kdvsiz * kdv;
        kdvli = kdvsiz + oran;
        System.out.println("Kdv miktari: " + oran);
        System.out.print("Kdv'li fiyatı: " + kdvli);
    }
}
