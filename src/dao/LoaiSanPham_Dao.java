package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.LoaiDichVu;
import entity.LoaiSanPham;

public class LoaiSanPham_Dao {
	public static ArrayList<LoaiSanPham> getAllDB() {
		var list = new ArrayList<LoaiSanPham>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From LoaiSanPham";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new LoaiSanPham(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}
	
	public static void main(String[] args) {
//		ADD
		for (LoaiSanPham a : LoaiSanPham_Dao.getAllDB()) {
			System.out.println(a);
		}
	}

	public static LoaiSanPham search(String name) {
		for (LoaiSanPham lsp : LoaiSanPham_Dao.getAllDB()) {
			if(lsp.getTenLSP().equalsIgnoreCase(name))
				return lsp;
			else if(lsp.getMaLSP().equalsIgnoreCase(name))
				return lsp;
			else if(lsp.getMaLDV().equalsIgnoreCase(name))
				return lsp;
		}
		return null;
		
	}

	public static boolean add(String tenLoaiSp, String loaiDichVu) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		
		int n = LoaiSanPham_Dao.getAllDB().size()+1;
		System.out.println(n);
		System.out.println(tenLoaiSp);
		System.out.println(loaiDichVu);
		String sql = "insert LoaiSanPham values (?,?,?)";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, "LSP"+n);
			prepare.setString(2, tenLoaiSp);
			prepare.setString(3, loaiDichVu);
			prepare.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		ConnectDB.disconect();
		return true;
		
	}
}
