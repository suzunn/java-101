package Odevler;

import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int buyuk;

        System.out.print("1. sayiyi gir: ");
        int n1 = sc.nextInt();
        System.out.print("2. sayiyi gir: ");
        int n2 = sc.nextInt();
        System.out.print("3. sayiyi gir: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.printf("%d>%d>%d", n1, n2, n3);

        } else if (n1 > n3 && n3 > n2) {
            System.out.printf("%d>%d>%d", n1, n3, n2);

        } else if (n2 > n1 && n1 > n3) {
            System.out.printf("%d>%d>%d", n2, n1, n3);

        } else if (n2 > n3 && n3 > n1) {
            System.out.printf("%d>%d>%d", n2, n3, n1);

        } else if (n3 > n1 && n1 > n2) {
            System.out.printf("%d>%d>%d", n3, n1, n2);

        } else if (n3 > n2 && n2 > n1) {
            System.out.printf("%d>%d>%d", n3, n2, n1);

        }
    }
}