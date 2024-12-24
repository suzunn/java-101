package Odevler;
import java.util.Scanner;
public class artikyil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("yil giriniz: ");
        int yil = sc.nextInt();

        if(yil % 100 == 0){
            if(yil%400 == 0){
                System.out.printf("%d artık yildir",yil);
            }else{
                System.out.printf("%d artık yıl değildir", yil);
            }
        }else if(yil % 4==0){
            System.out.printf("%d artık yıldır",yil);
        }else{
            System.out.printf("%d artık yıl değildir", yil);
        }
    }
}
