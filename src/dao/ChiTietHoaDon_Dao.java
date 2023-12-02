package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.ChiTietHoaDon;

public class ChiTietHoaDon_Dao {

	public static void main(String[] args) {
		fixOrdersBookRoom("P1", "P8");
		for (ChiTietHoaDon a : ChiTietHoaDon_Dao.getAllDB()) {
			System.out.println(a);
		}
	}

	public static ArrayList<ChiTietHoaDon> getAllDB() {
		var list = new ArrayList<ChiTietHoaDon>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();

		try {
			String spl = "Select * From ChiTietHoaDon";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);

			while (resultSet.next()) {
				list.add(new ChiTietHoaDon(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5) ));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}
//	private String maHD;
//	private String maPhieuDP;
//	private String maPhieuGM;
//	private String tinhTrang;
	
	public static void add(String orders, String ordersBookRoom, String orderBookFood, String maPhong) {

		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		int n = HoaDon_Dao.getAllDB().size() + 1;
		String sql = "INSERT ChiTietHoaDon VALUES (?,?,?,?,?)";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, orders);
			prepare.setString(2, ordersBookRoom);
			prepare.setString(3, orderBookFood);
			prepare.setString(4, maPhong);
			prepare.setString(5, "CHƯA THANH TOÁN");
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		ConnectDB.disconect();
	}
	public static ChiTietHoaDon search(String orderID, String bookRoomID, String bookFoodID) {
		for (ChiTietHoaDon a : ChiTietHoaDon_Dao.getAllDB()) {
			if(orderID.equalsIgnoreCase(a.getMaHD()) && bookRoomID.equalsIgnoreCase(a.getMaPhieuDP()))
				return a;
		}
		return null;
	}

	public static void fixOrdersBookRoom(String cu, String moi) {
		
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		int n = HoaDon_Dao.getAllDB().size() + 1;
		System.out.println(cu+", "+ moi);
		String sql = "update ChiTietHoaDon set maPhong = ? where maPhong = ? and tinhTrang = N'CHƯA THANH TOÁN'";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, moi);
			prepare.setString(2, cu);
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		ConnectDB.disconect();
	}

}
