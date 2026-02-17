package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.dao.SellerDao;
import model.entities.Sellers;

public class SellerDaoJDBC implements SellerDao{

	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Sellers obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Sellers obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Sellers obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sellers findById(Integer id) {
		PreparedStatement st =null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					 "SELECT * " 
					 + "FROM SELLER"
					);
					
			st.setInt(1, id);
			rs = st.executeQuery();
			
		}
		
	}

	@Override
	public List<Sellers> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
