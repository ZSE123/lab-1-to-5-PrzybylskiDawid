package zadanie1;

public class Main{

    public static void main(String args[]){

        Dog Zora = new Dog("Zora", "czarny");
        
        System.out.println(Zora.makeSound());

        Cat Puszek = new Cat("Puszek", "szylkret");
        System.out.println(Puszek.makeSound());

    }
}