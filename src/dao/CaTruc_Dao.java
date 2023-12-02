package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.CaTruc;
import entity.Phong;

public class CaTruc_Dao {
	
	private ArrayList<CaTruc> list;

	public ArrayList<CaTruc> getList() {
		return list;
	}

	public void setList(ArrayList<CaTruc> list) {
		this.list = list;
	}

	public CaTruc_Dao(ArrayList<CaTruc> list) {
		super();
		this.list = list;
	}

	public CaTruc_Dao() {
		list = new ArrayList<CaTruc>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From CaTruc";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new CaTruc(
						resultSet.getInt(1),
						resultSet.getInt(2),
						resultSet.getInt(3)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectDB con = new ConnectDB();
		con.connect();
		CaTruc_Dao list = new CaTruc_Dao();
		for (CaTruc p : list.getList()) {
			System.out.println(p.toString());
		}
		con.disconect();
	}
	
	
	
	
}
