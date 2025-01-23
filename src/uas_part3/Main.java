package uas_part3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
static ArrayList<Drink> listdrink= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scanf = new Scanner(System.in);
		int opsi; 
		String namaMinuman="a";
		int hargaMinuman;
		
		do {
			do {
				menu();
				opsi = scanf.nextInt();
			} while(opsi<1||opsi>3);
			
			if (opsi == 1) {// add
				System.out.println("1. sopdrink");
				System.out.println("2. coffee");
				int opsiDrink = scanf.nextInt();
				if(opsiDrink==1) { //softnwet
					String merekMinuman;
					do {
						System.out.println("Input nama");
						namaMinuman = scanf.nextLine();
					} while (namaMinuman.length() < 3);
					
					do {
						System.out.println("Input harga");
						hargaMinuman = scanf.nextInt();
					} while (hargaMinuman>100000 || hargaMinuman<1000);
					SoftDrink softdrink = new SoftDrink(namaMinuman, hargaMinuman);
					do {
						System.out.println("input brand");
						merekMinuman = scanf.nextLine();
					} while (merekMinuman.length() < 1);
					softdrink.setBrand(merekMinuman);
					listdrink.add(softdrink);
				}
				
				else if(opsiDrink==2) { //kopi
					double kafein;
					do {
						System.out.println("Input nama");
						namaMinuman = scanf.nextLine();
					} while (namaMinuman.length() < 3);
					do {
						System.out.println("Input harga");
						hargaMinuman = scanf.nextInt();
					} while (hargaMinuman>100000 || hargaMinuman<1000);
					Coffee coffee = new Coffee(namaMinuman, hargaMinuman);
					do {
						System.out.println("input caffeine");
						kafein = scanf.nextDouble();
					} while (kafein < 10);
					coffee.setCaffeine(kafein);
					listdrink.add(coffee);
				}
				System.out.println("Success");
			}
			else if (opsi == 2) { //delete
				int i = 1;
				for(Drink drink : listdrink) {
					System.out.print(i+". ");
					drink.showDetails();
					i++;
				}
				System.out.println("choose drink index");
				int opsiHapus = scanf.nextInt();
				listdrink.remove(opsiHapus-1);
				
			}
			else if (opsi ==3) {
				break;
			}
		} while(opsi ==1 || opsi == 2 || opsi == 3);
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. add");
		System.out.println("2. delete");
		System.out.println("3. exit");
	}

}
