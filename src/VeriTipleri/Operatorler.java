package VeriTipleri;

public class Operatorler {
    public static void main(String[] Args){
        int a = 5, b = 1;
        System.out.println(a%b);

        a = 5;
        b = 5;
        System.out.println(a==b);

        boolean c = true, d = false;
        System.out.println(c && d);
        System.out.println(!(!(c || d)));

        boolean sonuc = c && d;

        String str = sonuc ? "Doğru" : "Yanlış";
        System.out.println(str);

        int result = sonuc ? 1 : 0;
        System.out.println(result);

        str = 3==3 ? "Doğru" : "Yanlış";
        System.out.println(str);

        int x = 1, y = 2, r = 3;
        r *= x + y;  //ilk önce *='ın sağındaki kısmı yapıyor
        System.out.println(r);

        int t = 1, i = 2;

         //t = t + i;
         //i = i + 1;
         t += ++i;  //++i yerine i++ yaparsak ilk önce toplar ondan sonra değere +1 ekler

        System.out.println(t);
        System.out.println(i);

        //Eğer m = −12 ve n = −5, ise m%n işleminin sonucu ne olur? Cevap: -2 olacak
    }
}
