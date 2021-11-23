package lab3;
import java.util.Scanner;

class zadanie6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPodaj rozmiar tablicy: ");
        int x = scan.nextInt();
        int[][] tab = new int[x][x];

        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < x; j++) {
                System.out.print("\nPodaj wartosc tablicy: ");
                tab[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        Min(tab);
    }

    public static void Min(int x1[][])
    {     int x2 = x1.length;
        int x3 = x1.length;

        for (int i = 0; i < x3; i++) {
            System.out.print("[");
            for (int j = 0; j < x2; j++) {
                System.out.print(x1[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        
        System.out.println();
    }
   
}                