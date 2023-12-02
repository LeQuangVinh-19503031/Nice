package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.NhanVien;
import entity.Phong;

public class NhanVien_Dao {

	public static ArrayList<NhanVien> getAllDB() {
		ConnectDB.connect();
		var list = new ArrayList<NhanVien>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		try {
			String spl = "Select * From NhanVien";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new NhanVien(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getDate(6),
						resultSet.getString(7),
						resultSet.getFloat(8),
						resultSet.getString(9),
						resultSet.getString(10)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}
	
	public static void main(String[] args) {
		for (NhanVien p : NhanVien_Dao.getAllDB()) {
			System.out.println(p);
		}
	}
	
	
	
	
}
