package zadanie2;

public class BookShop extends Shop{
	
	String[] products = {"Władca Pierścieni: Drużyna Pierścienia","Władca Pierścieni: Dwie wieże","Władca Pierścieni: Powrót króla"};

	public BookShop(String name, String size) {
		super(name, size);		
	}

	public String getproducts(){ return products[0]; }
	
}