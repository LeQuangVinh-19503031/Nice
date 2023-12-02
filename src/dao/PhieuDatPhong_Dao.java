package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.PhieuDatPhong;
import entity.Phong;

public class PhieuDatPhong_Dao {
	
	public static ArrayList<PhieuDatPhong> getAllPDP() {
		ArrayList<PhieuDatPhong> list = new ArrayList<PhieuDatPhong>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From PhieuDatPhong";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new PhieuDatPhong(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}
	
	public static void main(String[] args) {
		for (PhieuDatPhong p : PhieuDatPhong_Dao.getAllPDP()) {
			System.out.println(p);
		}
	}
//	create table PhieuDatPhong (
//			maPDP varchar(10) not null primary key,
//			maNV varchar(10) constraint fk_Dp_nv foreign key references NhanVien(maNV) not null,
//			ngayLap Date default getDate(),
//			tinhTrang nvarchar(100) not null
//		)
	
	public static void add(String maNV, String tinhTrang) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		int n = PhieuDatPhong_Dao.getAllPDP().size()+1;
		String sql = "INSERT PhieuDatPhong(maPDP, maNV, tinhTrang) VALUES (?,?,?)";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, "PDP"+n);
			prepare.setString(2, maNV);
			prepare.setString(3, tinhTrang);
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}		
		ConnectDB.disconect();
	}
	
	public static ArrayList<Phong> getRoomsUsingToday(){
		var list = PhieuDatPhong_Dao.getAllPDP();
		var listRoom = Phong_Dao.getAllRoomDB();
		
		return listRoom;
	}
	
}
