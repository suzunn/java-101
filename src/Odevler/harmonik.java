package Odevler;

import java.util.Scanner;
public class harmonik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("sayı girin: ");
        int num = sc.nextInt();
        double temp=0;
        double temp1=0;
        for(int i = 1;i <= num;i++){
            temp1=1.0/i;
            temp=temp+temp1;
        }
        System.out.print(temp);
    }
}
