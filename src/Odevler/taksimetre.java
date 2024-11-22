package Odevler;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] Args){
        float acilis=10f, km=2.20f, min=20f, gidilen, toplam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kac km gittiginizi yaziniz: ");
        gidilen = sc.nextFloat();
        toplam = acilis+ (gidilen*km);
        if(toplam <= 20){
            System.out.printf("Borcunuz %d", 20);
        }else{
            System.out.printf("Borcunuz %.2f", toplam);
        }
    }
}
