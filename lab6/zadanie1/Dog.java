package zadanie1;

class Dog extends Animal{
	
	String sound = "Chał Chał"; 
	public Dog(String name, String color) 
    {
        Dog.name = name; 
		Dog.color = color; 
    }
        public String makeSound()
        {
            return String.format("\nsound: %s\nname: %s\ncolor: %s", sound, name, color);    
        } 

}