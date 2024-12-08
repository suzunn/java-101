package Odevler;

import java.util.Scanner;

public class sinavortalama {
    public static void main(String[] args){
        float mat, fizik, turkce, kimya, muzik, toplam = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("mat notunu gir: ");
        mat = sc.nextFloat();
        if (0<=mat && mat<=100) toplam += mat;

        System.out.print("fizik notunu gir: ");
        fizik = sc.nextFloat();
        if (0<=fizik && fizik<=100) toplam += fizik;

        System.out.print("turkce notunu gir: ");
        turkce = sc.nextFloat();
        if (0<=turkce && turkce<=100) toplam += turkce;

        System.out.print("kimya notunu gir: ");
        kimya = sc.nextFloat();
        if (0<=kimya && kimya<=100) toplam += kimya;

        System.out.print("muzik notunu gir: ");
        muzik = sc.nextFloat();
        if (0<=muzik && muzik<=100) toplam += muzik;


        double ort = (toplam)/5;

        if(ort<55){
            System.out.printf("Kaldınız!\n");
        }else{
            System.out.printf("Tebrikler geçtiniz\n");
        }
        System.out.printf("Ortalamanız: %.2f", ort);
    }
}
