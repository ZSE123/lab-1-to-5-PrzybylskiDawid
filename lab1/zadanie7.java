package lab1;
import java.util.Scanner;

class zadanie7{  
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPodaj x1: ");
        double x1 = scan.nextDouble();
        
        System.out.print("\nPodaj y1: ");
        double y1 = scan.nextDouble();

        System.out.print("\nPodaj x2: ");
        double x2 = scan.nextDouble();
        
        System.out.print("\nPodaj y2: ");
        double y2 = scan.nextDouble();

        double wynik = Math.sqrt(Math.pow((x2- x1), 2) + Math.pow((y2- y1), 2));
        
        System.out.println("wynik = " + wynik);
    }  
}  