package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.ChiTietPhieuDP;
import entity.Phong;

public class ChiTietPhieuDatPhong_Dao {

	public static ArrayList<ChiTietPhieuDP> getAllDBYetPayment() {

		var list = new ArrayList<ChiTietPhieuDP>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();

		try {
			String spl = "Select * From ChiTietPhieuDatPhong";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while (resultSet.next()) {
				list.add(new ChiTietPhieuDP(resultSet.getString(1), resultSet.getString(2),
						LocalDateTime.of(resultSet.getTimestamp(3).getYear() - 100 + 2000,
								resultSet.getTimestamp(3).getMonth(), resultSet.getTimestamp(3).getDate(),
								resultSet.getTimestamp(3).getHours(), resultSet.getTimestamp(3).getMinutes(),
								resultSet.getTimestamp(3).getSeconds()),
						resultSet.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();

		return list;
	}

	public static ArrayList<ChiTietPhieuDP> getAllDB() {

		var list = new ArrayList<ChiTietPhieuDP>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();

		try {
			String spl = "Select * From ChiTietPhieuDatPhong";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while (resultSet.next()) {
				if(resultSet.getTimestamp(4) == null) {
					list.add(new ChiTietPhieuDP(
							resultSet.getString(1), 
							resultSet.getString(2),
							LocalDateTime.of(resultSet.getTimestamp(3).getYear() - 100 + 2000,
									resultSet.getTimestamp(3).getMonth() + 1, resultSet.getTimestamp(3).getDate(),
									resultSet.getTimestamp(3).getHours(), resultSet.getTimestamp(3).getMinutes(),
									resultSet.getTimestamp(3).getSeconds()),
							null,
							resultSet.getString(5)));
				}else {
					list.add(new ChiTietPhieuDP(
							resultSet.getString(1), 
							resultSet.getString(2),
							LocalDateTime.of(resultSet.getTimestamp(3).getYear() - 100 + 2000,
									resultSet.getTimestamp(3).getMonth(), resultSet.getTimestamp(3).getDate(),
									resultSet.getTimestamp(3).getHours(), resultSet.getTimestamp(3).getMinutes(),
									resultSet.getTimestamp(3).getSeconds()),
							LocalDateTime.of(resultSet.getTimestamp(4).getYear() - 100 + 2000,
									resultSet.getTimestamp(4).getMonth(), resultSet.getTimestamp(4).getDate(),
									resultSet.getTimestamp(4).getHours(), resultSet.getTimestamp(4).getMinutes(),
									resultSet.getTimestamp(4).getSeconds()),
							resultSet.getString(5)));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();

		return list;
	}
	
	

	public static void main(String[] args) {
		for (ChiTietPhieuDP p : ChiTietPhieuDatPhong_Dao.getAllDB()) {
			System.out.println(p);
		}
	}

	public static void add(String maPhieuDP, String maP) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		int n = HoaDon_Dao.getAllDB().size()+1;
		String sql = "INSERT ChiTietPhieuDatPhong(maPDP, maP, tgRa, tinhTrang) VALUES (?,?,?,?)";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, maPhieuDP);
			prepare.setString(2, maP);
			prepare.setDate(3, null);
			prepare.setString(4, "CHƯA THANH TOÁN");
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		
		}		
		ConnectDB.disconect();
		
	}

	public static void changeStatusRoomsBooked() {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "update Phong "
				+ "set tinhTrang = N'ĐANG SỬ DỤNG' "
				+ "where maP in (Select p.maP from Phong as p inner join ChiTietPhieuDatPhong as ctp "
				+ "on p.maP = ctp.maP "
				+ "where ctp.tinhTrang = N'CHƯA THANH TOÁN')";
		try {
			prepare = con.prepareStatement(sql);
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		ConnectDB.disconect();
	}

	public static void fixPDP(String maPCu, String maPMoi) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "UPdate ChiTietPhieuDatPhong "
				+ "set maP = N'"+maPMoi+"' "
				+ "where tinhTrang = N'CHƯA THANH TOÁN' and maP = N'"+maPCu+"'";
		try {
			prepare = con.prepareStatement(sql);
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		
		}		
		ConnectDB.disconect();
		
	}

	public static String searchPDPUsing(String tenPhong) {
		
		return null;
	}

}
