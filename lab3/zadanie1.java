package lab3;
import java.util.Scanner;

class zadanie1{  
    public static void main(String args[]){  
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPodaj rozmiar tablicy: ");
        int x = scan.nextInt();
        
        char[] tablica = new char[x];

        for(int i = 0; i < x; i++)
        {
            System.out.print("\nPodaj znak: ");
            tablica[i] = scan.next().charAt(0);
        }

        for(int i = 0; i < x; i++)
        {
            System.out.println(tablica[i]);
        }
    }  
}  
 
