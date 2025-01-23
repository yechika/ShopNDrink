package uas_part3;

public class Coffee extends Drink{
	public Coffee(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public double getCaffeine() {
		return Caffeine;
	}

	public void setCaffeine(double caffeine) {
		Caffeine = caffeine;
	}

	double Caffeine;

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Coffee [Caffeine=" + Caffeine + ", Name=" + Name + ", Price=" + Price + "]");
	}

}
