package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.TaiKhoan;
import entity.Phong;

public class TaiKhoan_Dao {
	
	private ArrayList<TaiKhoan> list;

	public ArrayList<TaiKhoan> getList() {
		return list;
	}

	public void setList(ArrayList<TaiKhoan> list) {
		this.list = list;
	}

	public TaiKhoan_Dao(ArrayList<TaiKhoan> list) {
		super();
		this.list = list;
	}

	public TaiKhoan_Dao() {
		list = new ArrayList<TaiKhoan>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From TaiKhoan";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new TaiKhoan(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectDB con = new ConnectDB();
		con.connect();
		TaiKhoan_Dao list = new TaiKhoan_Dao();
		for (TaiKhoan p : list.getList()) {
			System.out.println(p.toString());
		}
		con.disconect();
	}
	
	
	
	
}
