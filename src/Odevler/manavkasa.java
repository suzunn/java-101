package Odevler;

import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args){
        float karmut=2.14f, kelma=3.67f, kdomates=1.11f, kmuz=0.95f, kpatlican=5.00f, toplam;
        Scanner sc = new Scanner(System.in);

        System.out.print("kaç kilo armut: ");S
        int armut = sc.nextInt();

        System.out.print("kaç kilo elma: ");
        int elma = sc.nextInt();

        System.out.print("kaç kilo domates: ");
        int domates = sc.nextInt();

        System.out.print("kaç kilo muz: ");
        int muz = sc.nextInt();

        System.out.print("kaç kilo patlican: ");
        int patlican = sc.nextInt();

        toplam = karmut*armut + kelma*elma + kdomates*domates + kmuz*muz + kpatlican*patlican;

        System.out.printf("Toplam: %.2fTL",toplam);



    }
}
