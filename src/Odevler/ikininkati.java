package Odevler;
import java.util.Scanner;
public class ikininkati {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = sc.nextInt();

        for(int i = 1,n = 5; i<sayi || n<sayi; i*=4, n*=5){
            if(n < sayi)System.out.println(n);
            System.out.println(i);
            }
        }
}