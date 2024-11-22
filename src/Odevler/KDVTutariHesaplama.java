package Odevler;

import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] Args){
        float KDV = 18/100f, fiyat, kdvli;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ürün fiyatını girin: ");
        fiyat = sc.nextFloat();
        kdvli = fiyat*KDV;

        System.out.printf("KDV'siz fiyat: %.2f\n", fiyat);
        System.out.printf("KDV fiyatı: %.2f\n", kdvli);
        System.out.printf("KDV'li fiyat: %.2f\n", (fiyat + kdvli));

    }
}
