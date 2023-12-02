package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.ChucVu;
import entity.Phong;

public class ChucVu_Dao {
	
	private ArrayList<ChucVu> list;

	public ArrayList<ChucVu> getList() {
		return list;
	}

	public void setList(ArrayList<ChucVu> list) {
		this.list = list;
	}

	public ChucVu_Dao(ArrayList<ChucVu> list) {
		super();
		this.list = list;
	}

	public ChucVu_Dao() {
		list = new ArrayList<ChucVu>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From ChucVu";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new ChucVu(
						resultSet.getString(1),
						resultSet.getString(2)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectDB con = new ConnectDB();
		con.connect();
		ChucVu_Dao list = new ChucVu_Dao();
		for (ChucVu p : list.getList()) {
			System.out.println(p.toString());
		}
		con.disconect();
	}
	
	
	
	
}
