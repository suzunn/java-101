package Odevler;
import java.util.Scanner;
public class yildizlarlaucgen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("basamak sayisini giriniz: ");
        int bas = sc.nextInt();
        for(int i = 1; i <= bas;i++){

            for(int j = bas-i; j > 0 ;j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}