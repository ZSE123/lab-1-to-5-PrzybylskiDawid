package lab3;
import java.util.Scanner;

class zadanie2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPodaj rozmiar tablicy: ");
        int x = scan.nextInt();
        int[] tablica = new int[x];

        System.out.print("\nPodaj wartosc pierwszego elementu tablicy: ");
        int y = scan.nextInt();
        tablica[0] = y;
        System.out.println();

        for(int i = 1; i < x; i++)
        {
            if(y % 2 != 0)
            {
                y++;
                tablica[i] = y; 
            }
            else
            {
                y=y+2;
                tablica[i] = y;
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.println(tablica[i]);
        }
        System.out.println();
        
        Min(tablica);
        Max(tablica);
        Suma(tablica);
        Srednia(tablica);
        Mediana(tablica);
       
        
    }
    public static void Min(int x[])
    {
        int result = x[0];
        for(int i = 0; i < x.length; i++)
        {
            if(result > x[i])
            {
                result = x[i];
            }
        }
        
        System.out.println("min: [" +result+ "]");
    }
    public static void Max(int x[])
    {
        int result = 0;
        for(int i = 0; i < x.length; i++)
        {
            if(result < x[i])
            {
                result = x[i];
            }
        }
        
        System.out.println("Max: [" +result+ "]");
    }

    public static void Suma(int x[])
    {
        int result = 0;
        for(int i = 0; i < x.length; i++)
        {
            result += x[i];
        }
        
        System.out.println("Suma: [" +result+ "]");
    }

    public static void Srednia(int x[])
    {
        float result = 0;
        for(int i = 0; i < x.length; i++)
        {
            result += x[i];
        }
        result = result/x.length;
        
        System.out.println("Srednia: [" +result+ "]");
    }

    public static void Mediana(int x[])
    {
        
        float result;
        if(x.length%2 == 0)
        {
            result = (x[x.length/2] + x[x.length/2 -1])/2;
        }
        else
        {
            result = x[Math.round(x.length/2)];
        }
        System.out.println("Mediana: [" +result+ "]");
    }

}                