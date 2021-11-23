package lab1;
import java.util.Scanner;

class zadanie4{  
    public static void main(String args[]){  
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPodaj bok a: ");
        int a = scan.nextInt();
        
        System.out.print("\nPodaj bok b: ");
        int b = scan.nextInt();
        
        System.out.print("\nPodaj bok c: ");
        int c = scan.nextInt();
        
        if(a + b > c && c + b > a && a + c > b)
        {
            System.out.println("\ntak");
        }
        else
        {
            System.out.println("\nnie");
        }
    }  
}  
