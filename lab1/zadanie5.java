package lab1;
import java.util.Scanner;

class zadanie5{  
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nPodaj liczbę od 1 do 7: ");
        int liczba = scan.nextInt();

        if(liczba > 7 || liczba < 1)
        {
            System.out.println("liczba powinna być od 1 do 7");    
            System.exit(0);
        }
        
        switch(liczba) {
            case 1:
            System.out.println("Poniedziałek"); 
            break;
            
            case 2:
            System.out.println("Wtorek");
            break;
              
            case 3:
            System.out.println("Środa");
            break;
              
            case 4:
            System.out.println("Czwartek");
            break;
              
            case 5:
            System.out.println("Piątek");
            break;
              
            case 6:
            System.out.println("Sobota");
            break;
              
            case 7:
            System.out.println("Niedziela");
            break;
          }
        

    }  
}  
