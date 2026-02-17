package application;
import java.sql.Connection;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Sellers;
import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();

		Department obj = new Department(1, "Books");
		
		Sellers seller = new Sellers(21, "Augusto", "augusto@teste.com.br", new Date(), 4500.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		System.out.println(seller);
	}

}
 