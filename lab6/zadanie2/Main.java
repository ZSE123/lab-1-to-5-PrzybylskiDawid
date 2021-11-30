package zadanie2;

public class Main{

    public static void main(String args[]){
        
        Bakery hlep = new Bakery("Chlebowa 3", "mały");

        System.out.println("\nadress: "+hlep.name);
        System.out.println("size: "+hlep.size);
        System.out.println("products:\n- "+hlep.products[0]);
        
        for(int i = 1; i < 3; i++)
        {
            System.out.print("- "+hlep.products[i]+"\n");
        }
        System.out.println();

        BookShop bookshop = new BookShop("Książkowa 3", "duży");

        System.out.println("\nadress: "+bookshop.name);
        System.out.println("size: "+bookshop.size);
        System.out.println("products:\n- "+bookshop.products[0]);
        
        for(int i = 1; i < 3; i++)
        {
            System.out.print("- "+bookshop.products[i]+"\n");
        }
        System.out.println();

        
        }


}