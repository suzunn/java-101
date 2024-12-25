package Odevler;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,temp=1,bas=1,birler,sayi=0,sub=1,son=0,num=0,ilk;

        System.out.print("sayı girin: ");
        n = sc.nextInt();
        ilk=n;
        temp = n/10;
        while(temp!=0){
            temp /= 10;
            bas++;
        }
        System.out.println(bas);
        for(int i = 1;i<=bas;i++){

            num=n%10;
            for(int p = 1;p<=bas;p++){
                sub=sub*num;
            }
            n=n/10;
            son+=sub;
            sub=1;
        }
        System.out.println(son);
        if(son==ilk){
            System.out.printf("%d armstrong sayısıdır",ilk);
        }else{
            System.out.printf("%d armstrong sayısı değildir",ilk);
        }


    }
}
