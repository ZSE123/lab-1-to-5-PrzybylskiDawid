package lab5;

public class Main { 
    public static void main(String args[]) 
    { 
        Engine engine = new Engine("silnik odrzutowy");
        Color color = new Color("zielony");
        Size size = new Size("duży");
        Vehicle vehicle = new Vehicle( "odrzutowiec", engine, color, size);
        System.out.println(vehicle); 
    }
}
