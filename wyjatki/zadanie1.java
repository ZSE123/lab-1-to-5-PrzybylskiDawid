import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
  public MyException() {
    System.out.println("liczba nie może być równa 4");
  }
}

class zadanie1 {

   static void myMethod(int liczba) throws MyException {
      if (liczba == 4)
      {
        throw new MyException();
      }
      return;
   }
   public static void main(String  args[]) {
     Scanner scan = new Scanner(System.in);
      int liczba = 4;
      try {
         System.out.println("podaj liczbe całkowitą inną niż 4");
        liczba = scan.nextInt();
         myMethod(liczba);
      }
      catch ( MyException ex) {
        System.out.println("Podałeś liczbę 4");
      }
      catch (InputMismatchException e) {
        System.out.println("Podałeś liczbę w złym formacie");
    }

}
}