package Odevler;

import java.util.Scanner;

public class NotOrtalamasiHesaplama{
    public static void main(String[] Args){
        int mat, fizik, muzik, kimya, turkce;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();


        int toplam = mat+fizik+muzik+kimya+turkce;
        double sonuc = toplam / 5;

        boolean gecti = sonuc >= 60;
        String son = gecti ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Not ortalamanız: " + sonuc);
        System.out.print(son);
    }
}