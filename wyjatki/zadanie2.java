import java.util.Scanner;
public class zadanie2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        int liczba;
        System.out.println("prosze podac liczbe");
        
        while (!valid) 
        {
            try 
            {
                liczba = scan.nextInt();
                valid = true;
            }   
            catch (Exception ex) 
            {
                scan.nextLine();
                System.out.println("prosze podac liczbe");
            }
        }
    }
}

