package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.SanPham;
import entity.Phong;

public class SanPham_Dao {

	public static ArrayList<SanPham> getAllDB() {
		var list = new ArrayList<SanPham>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();

		try {
			String spl = "Select * From SanPham";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while (resultSet.next()) {
				list.add(new SanPham(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getDate(4), resultSet.getDouble(5), resultSet.getDouble(6), resultSet.getInt(7),
						resultSet.getString(8)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}

	public static void main(String[] args) {
		for (SanPham p : SanPham_Dao.getAllDB()) {
			System.out.println(p.toString());
		}
	}

//	insert LoaiSanPham values ('LSP4', N'TRÁI CÂY', 'DOAN') 
//	go
//	insert SanPham (maSP, maLSP, tenSP, soLuongTon, giaNhap, giaBan, tinhTrang)
//	values ('SP5','LSP4',N'ĐĨA TRÁI CÂY',100,16000, 30000 , N'CÒN HÀNG')
	public static boolean addNew(SanPham sp) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "insert SanPham (maSP, maLSP, tenSP, soLuongTon, giaNhap, giaBan, tinhTrang) values (?,?,?,?,?,?,?)";
//		System.out.println();
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, sp.getMaSP());
			prepare.setString(2, sp.getMaLSP());
			prepare.setString(3, sp.getTenSP());
			prepare.setInt(4, sp.getSoLuongTon());
			prepare.setDouble(5, sp.getGiaNhap());
			prepare.setDouble(6, sp.getGiaBan());
			prepare.setString(7, sp.getTinhTrang());
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		ConnectDB.disconect();
		return true;
	}

	public static SanPham searchName(SanPham sp) {
		for (SanPham item : SanPham_Dao.getAllDB()) {
			if (item.getTenSP().equalsIgnoreCase(sp.getTenSP()))
				return item;
		}
		return null;
	}
//	update SanPham
//	set soLuongTon = 100
//	where tenSP = N'ĐĨA TRÁI CÂY'
	public static boolean update(SanPham sp) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		int n = searchName(sp).getSoLuongTon();
		String sql = "update SanPham set soLuongTon = ?, giaNhap = ?, giaBan = ? where tenSP = N'"+sp.getTenSP()+"'";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setInt(1, n + sp.getSoLuongTon());
			prepare.setDouble(2, n + sp.getGiaNhap());
			prepare.setDouble(3, n + sp.getGiaBan());
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		ConnectDB.disconect();
		return true;
	}

	public static boolean addNew(SanPham sp, String typeProductNew) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "insert SanPham (maSP, maLSP, tenSP, soLuongTon, giaNhap, giaBan, tinhTrang) values (?,?,?,?,?,?,?)";
//		System.out.println();
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, sp.getMaSP());
			prepare.setString(2, typeProductNew);
			prepare.setString(3, sp.getTenSP());
			prepare.setInt(4, sp.getSoLuongTon());
			prepare.setDouble(5, sp.getGiaNhap());
			prepare.setDouble(6, sp.getGiaBan());
			prepare.setString(7, sp.getTinhTrang());
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		ConnectDB.disconect();
		return true;
	}

}
