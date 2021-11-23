package lab1;
import java.util.Scanner;

class zadanie6{  
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int[] tab = new int[3];

        System.out.print("\nPodaj 1 liczbe: ");
        tab[0] = scan.nextInt();
        
        System.out.print("\nPodaj 2 liczbe: ");
        tab[1] = scan.nextInt();
        
        System.out.print("\nPodaj 3 liczbe: ");
        tab[2] = scan.nextInt();

        int temp = 0;

        for(int i=0; i < 3; i++)
        {  
            for(int j=1; j < (3-i); j++)
            {  
                if(tab[j-1] > tab[j])
                {  
                            temp = tab[j-1];  
                            tab[j-1] = tab[j];  
                            tab[j] = temp;  
                }  
            }
         }    
        
         for(int i=2; i >= 0; i--)
         {
            System.out.println(tab[i]);
         }

    }  
}  

