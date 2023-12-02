package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.PhieuGoiMon;
import entity.Phong;

public class PhieuGoiMon_Dao {
	
	private ArrayList<PhieuGoiMon> list;

	public ArrayList<PhieuGoiMon> getList() {
		return list;
	}

	public void setList(ArrayList<PhieuGoiMon> list) {
		this.list = list;
	}

	public PhieuGoiMon_Dao(ArrayList<PhieuGoiMon> list) {
		super();
		this.list = list;
	}

	public PhieuGoiMon_Dao() {
		list = new ArrayList<PhieuGoiMon>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From PhieuGoiMon";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new PhieuGoiMon(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getTimestamp(3),
						resultSet.getString(4),
						resultSet.getString(5)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectDB con = new ConnectDB();
		con.connect();
		PhieuGoiMon_Dao list = new PhieuGoiMon_Dao();
		for (PhieuGoiMon p : list.getList()) {
			System.out.println(p.toString());
		}
		con.disconect();
	}

	public static void fixPGM(String maPhongCu, String maPhong) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
