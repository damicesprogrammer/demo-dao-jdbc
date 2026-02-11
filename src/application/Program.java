package application;

import java.sql.Connection;
import model.entities.Department;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();

		Department obj = new Department(1, "Books");
		System.out.println(obj);
	}

}
