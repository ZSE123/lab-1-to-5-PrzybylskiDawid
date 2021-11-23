package lab3;
import java.util.Scanner;



class zadanie3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPodaj rozmiar pierwszej tablicy: ");
        int x1 = scan.nextInt();
        int[] tab1 = new int[x1];

        for(int i = 0; i < x1; i++)
        {
            System.out.print("\nPodaj wartosc " +(i+1)+ " elementu tablicy: ");
            tab1[i] = scan.nextInt();
        }

        System.out.print("\nPodaj rozmiar  drugiej tablicy: ");
        int x2 = scan.nextInt();
        int[] tab2 = new int[x2];
        System.out.println();

        for(int i = 0; i < x2; i++)
        {
            System.out.print("\nPodaj wartosc " +(i+1)+ " elementu tablicy: ");
            tab2[i] = scan.nextInt();
        }
       
        Min(tab1, tab2);

    }

    public static void Min(int x1[], int x2[])
    {     
        if(x1.length != x2.length)
        {
            System.out.println("tablice maja rozne dlugosci");
        }  
        else
        {
        for (int i = 0; i < x1.length; i++) {
            System.out.println(x1[i] + x2[i]);
        }
        }
        System.out.println();
    }
   
}                