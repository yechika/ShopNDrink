package uas_part3;

public class SoftDrink extends Drink{
	public SoftDrink(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	String Brand;

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("SoftDrink [Brand=" + Brand + ", Name=" + Name + ", Price=" + Price + "]");
	}

	
}
