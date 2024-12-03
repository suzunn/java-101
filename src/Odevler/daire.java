package Odevler;

import java.util.Scanner;

public class daire {
    public static void main(String[] Args){
        float p = 3.14f;

        Scanner sc = new Scanner(System.in);
        System.out.print("yarıçap giriniz: ");
        int r = sc.nextInt();
        double cevre = 2*p*r;
        double alan = p*r*r;

        System.out.printf("cevre: %.2f\n",cevre);
        System.out.printf("alan: %.2f", alan);
    }
}
