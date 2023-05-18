package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Locale.setDefault(Locale.US);
		
		//Department obj = new Department(1, "Books");
		//Seller seller = new Seller(21, "Jose", "jose@@mail.com", new Date(), 3000.0, obj);
		System.out.println("=== Test 1: Seller findById ===");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List <Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
