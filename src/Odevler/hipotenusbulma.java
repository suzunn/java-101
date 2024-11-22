package Odevler;

import java.util.Scanner;
public class hipotenusbulma {
    public static void main(String[] Args){
        int a,b;


        Scanner sc = new Scanner(System.in);
        System.out.print("Sırayla kenar uzunluklarını girin: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print("Hipotenus uzunlugu: " + Math.sqrt((a*a)+(b*b)));

    }
}
