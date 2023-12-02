package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.BangChamCong;
import entity.Phong;

public class BangChamCong_Dao {
	
	private ArrayList<BangChamCong> list;

	public ArrayList<BangChamCong> getList() {
		return list;
	}

	public void setList(ArrayList<BangChamCong> list) {
		this.list = list;
	}

	public BangChamCong_Dao(ArrayList<BangChamCong> list) {
		super();
		this.list = list;
	}

	public BangChamCong_Dao() {
		list = new ArrayList<BangChamCong>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From BangPhanCong";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new BangChamCong(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getBoolean(4)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectDB con = new ConnectDB();
		con.connect();
		BangChamCong_Dao list = new BangChamCong_Dao();
		for (BangChamCong p : list.getList()) {
			System.out.println(p.toString());
		}
		con.disconect();
	}
	
	
	
	
}
