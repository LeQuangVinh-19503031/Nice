package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.LoaiDichVu;

public class LoaiDichVu_Dao {
	public static ArrayList<LoaiDichVu> getAllDB() {
		var list = new ArrayList<LoaiDichVu>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From LoaiDichVu";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new LoaiDichVu(
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
		for (LoaiDichVu a : LoaiDichVu_Dao.getAllDB()) {
			System.out.println(a);
		}
	}
}
