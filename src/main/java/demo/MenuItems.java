package demo;

public class MenuItems {
	private int price;
	String item_name;
	
	MenuItems(int price,String item_name)
	{
		this.setPrice(price);
		this.item_name = item_name;
		
	}
	
	public void Add_items(int price,String name){
		
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
