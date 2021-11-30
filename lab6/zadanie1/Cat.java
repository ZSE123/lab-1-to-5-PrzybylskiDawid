package zadanie1;

class Cat extends Animal{
	
	String sound = "Miał Miał"; 
	public Cat(String name, String color) 
    {
        Cat.name = name; 
		Cat.color = color; 
    }
        public String makeSound()
        {
            return String.format("\nsound: %s\nname: %s\ncolor: %s", sound, name, color);    
        } 

}
