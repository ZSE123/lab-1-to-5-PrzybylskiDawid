package zadanie2;

public class Bakery extends Shop{
	
	String[] products = {"chleb pszenny","chleb tostowy","chleb żytni"};

	public Bakery(String name, String size) {
		super(name, size);		
	}

	public String getproducts(){ return products[0]; }
	
}