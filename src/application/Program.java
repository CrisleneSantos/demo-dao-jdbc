package application;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Jose", "jose@@mail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
		
	}

}
