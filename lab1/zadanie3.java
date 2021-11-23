package lab1;

import java.util.Scanner;

class zadanie3{  
    public static void main(String args[]){  
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj stopnie Celsjusza");
        float celsius = scan.nextFloat();
        
        float fahrenheit = celsius * 9/5 + 32;

        System.out.println(celsius + " stopnie Celsjusza to " + fahrenheit + " F");
    }  
}  
