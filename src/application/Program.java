package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Department obj = new Department(1, "Books");
		//Seller seller = new Seller(21, "Jose", "jose@@mail.com", new Date(), 3000.0, obj);
		System.out.println("=== Test 1: Seller findById ===");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3: Seller findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Jose", "jose@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id: " + newSeller.getId());
		
		System.out.println("\n=== Test 5: Seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Valentina Santos");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== Test 6: Seller delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);;
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
