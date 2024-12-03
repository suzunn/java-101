package Odevler;

import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        float vki, boy, kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = sc.nextFloat();

        System.out.print("ütfen kilonuzu giriniz: ");
        kilo = sc.nextFloat();

        vki = kilo/(boy*boy);
        System.out.printf("Vücut Kitle İndeksiniz: %.2f", vki);






    }
}
