package uas_part3;

public abstract class Drink implements Displayable{
	String Name;
	int Price;
	public Drink(String name, int price) {
		super();
		Name = name;
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
}
