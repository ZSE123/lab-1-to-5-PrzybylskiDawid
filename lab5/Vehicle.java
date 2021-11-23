package lab5;

public class Vehicle 
{ 
    private String name; 
    private Engine engine;
    private Color color;
    private Size size;

    public Vehicle(String name, Engine owner, Color color, Size size)
    {
        this.name = name;
        this.engine = owner;
        this.color = color;
        this.size = size;
    }   

    public String toString()
    {
        return String.format("\npojazd: %s\nsilnik: %s\nkolor: %s\nrozmiar: %s", name, engine, color, size);
    }
}