package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.LoaiPhong;
import entity.Phong;

public class LoaiPhong_Dao {

	public static ArrayList<LoaiPhong> getAllDB() {
		var list = new ArrayList<LoaiPhong>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From LoaiPhong";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new LoaiPhong(
						resultSet.getString(1),
						resultSet.getString(2)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}
	
	public static void main(String[] args) {
		for (LoaiPhong p : LoaiPhong_Dao.getAllDB()) {
			System.out.println(p);
		}
	}
	
	
	
	
}
