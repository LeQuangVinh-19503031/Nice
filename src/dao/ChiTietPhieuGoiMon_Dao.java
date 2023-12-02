package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.ChiTietPhieuGM;
import entity.Phong;

public class ChiTietPhieuGoiMon_Dao {
	
	private ArrayList<ChiTietPhieuGM> list;

	public ArrayList<ChiTietPhieuGM> getList() {
		return list;
	}

	public void setList(ArrayList<ChiTietPhieuGM> list) {
		this.list = list;
	}

	public ChiTietPhieuGoiMon_Dao(ArrayList<ChiTietPhieuGM> list) {
		super();
		this.list = list;
	}

	public ChiTietPhieuGoiMon_Dao() {
		list = new ArrayList<ChiTietPhieuGM>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From ChiTietPhieuGoiMon";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new ChiTietPhieuGM(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getInt(3),
						resultSet.getString(4)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectDB con = new ConnectDB();
		con.connect();
		ChiTietPhieuGoiMon_Dao list = new ChiTietPhieuGoiMon_Dao();
		for (ChiTietPhieuGM p : list.getList()) {
			System.out.println(p.toString());
		}
		con.disconect();
	}
	
	
	
	
}
