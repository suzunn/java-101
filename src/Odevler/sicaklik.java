package Odevler;

import java.util.Scanner;

public class sicaklik {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("sicaklik gir: ");
        float sicaklik = sc.nextFloat();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsin");
        }else if (5<=sicaklik && sicaklik<=15){
            System.out.println("Sinema yapabilirsin");
        }else if (15<=sicaklik && sicaklik<=25){
            System.out.println("Piknik yapabilirsin");
        }else if(25<= sicaklik){
            System.out.println("Yüzme yapabilirsin");
        }
    }
}
