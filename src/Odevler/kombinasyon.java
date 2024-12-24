package Odevler;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args){
        int s1=1, s2=1, s3=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("eleman sayısını gir: ");
        int n = sc.nextInt();

        System.out.print("seçilecek eleman sayısı: ");
        int r = sc.nextInt();

        for (int i=1;i<=n;i++){
            s1*=i;
        }

        for (int i=1;i<=r;i++){
            s2*=i;
        }

        for (int i=1;i<=n-r;i++){
            s3*=i;
        }
        int sonuc = s1/(s2*s3);
        System.out.printf("C(%d,%d)= %d",n,r,sonuc);
    }
}
