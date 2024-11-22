package Programlar;

public class ifelse
{
    public static void main(String[] args)
    {
        for (int ust = 0; ust < 10; ust++)
        {
            for (int alt = 0; alt < ust+1; alt++)
            {
                int carpim1 = 1;
                int carpim2 = 1;
                for (int i = 1; i <= alt; i++)
                {
                    carpim1 *= i;
                    carpim2 *= ust + 1 - i;
                }
                System.out.printf("%d ", carpim2 / carpim1);
            }
            System.out.println("\n");
        }
    }
}
