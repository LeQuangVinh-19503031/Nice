package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.KhachHang;

public class KhachHang_Dao {

	private ArrayList<KhachHang> list;
	private Connection connection;

	public ArrayList<KhachHang> getList() {
		return list;
	}

	public void setList(ArrayList<KhachHang> list) {
		this.list = list;
	}

	public KhachHang_Dao(ArrayList<KhachHang> list) {
		super();
		this.list = list;
	}
	
	public static ArrayList<KhachHang> getAllDB(){
		var list = new ArrayList<KhachHang>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		try {
			String spl = "Select * From KhachHang";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new KhachHang(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getString(6)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}

	public KhachHang_Dao() {
		list = new ArrayList<KhachHang>();
		ConnectDB.connect();
		connection = ConnectDB.getCon();
		
		try {
			String spl = "Select * From KhachHang";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			while(resultSet.next()) {
				list.add(new KhachHang(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getDate(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getString(6)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
// add khách hàng
	public void addKhachHang(KhachHang khachHang) {
		try {
			String query = "INSERT INTO KhachHang(sdt, hoTenKH, ngaySinh, diaChi, email, tinhTrang )" 
						    + "VALUES(?,?,?,?,?,?)";
			try(PreparedStatement preparedStatement =  connection.prepareStatement(query) ){
				if(connection != null) {
				preparedStatement.setString(1, khachHang.getSdt());
				preparedStatement.setString(2, khachHang.getHoTenKH());
				preparedStatement.setDate(3, khachHang.getNgaySinh());
				preparedStatement.setString(4, khachHang.getEmail());
				preparedStatement.setString(5, khachHang.getDiaChi());
				preparedStatement.setString(6, khachHang.getTinhTrang());
				}else {
					System.out.println("Connection is null");
				}
				preparedStatement.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
// Sửa khách hàng
	public void updateKhachHang(KhachHang khachHang) {
		try {
			String query = "UPDATE  KhachHang SET hoTenKH=?, ngaySinh=?"
						   +  "diaChi=?, email=? WHERE sdt=?";
			try(PreparedStatement stm = connection.prepareStatement(query)) {
				stm.setString(1, khachHang.getHoTenKH());
				stm.setDate(2, khachHang.getNgaySinh());
				stm.setString(3, khachHang.getDiaChi());
				stm.setString(4, khachHang.getEmail());
				stm.setString(7, khachHang.getTinhTrang());
				stm.setString(8, khachHang.getSdt());
				
				stm.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// Tìm kiếm khách hàng 
	public List<KhachHang> timKiemKhachHang(String key, String key1,String key2, String key3) {
		List<KhachHang> khachHangList = new ArrayList<>();
		try {
			String sql = "SELECT * From KhachHang WHERE sdt LIKE ? OR hoTenKH LIKE ? OR diaChi LIKE ? OR tinhTrang LIKE ?";
			try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
				String searchKey = "%" + key + "%";
				String searchKey1 = "%" + key1 + "%";
				String searchKey2 = "%" + key2 + "%";
				String searchKey3 = "%" + key3 + "%";
				preparedStatement.setString(1, searchKey);
				preparedStatement.setString(2, searchKey1);
				preparedStatement.setString(3, searchKey2);
				preparedStatement.setString(4, searchKey3);

				try(ResultSet resultSet = preparedStatement.executeQuery()){
						while(resultSet.next()) {
							KhachHang kh = new KhachHang(
									resultSet.getString(1),
									resultSet.getString(2),
			                        resultSet.getDate(3),
			                        resultSet.getString(4),
			                        resultSet.getString(5),
			                        resultSet.getString(6)
									);
							khachHangList.add(kh);
						}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return khachHangList;
	}
	
 // Lấy toàn bộ danh sách khách hàng
	public List<KhachHang> getAllList() {
		List<KhachHang> khachHangList = new ArrayList<>();
		try {
			String sql = "SELECT * FROM KhachHang";
			try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
				try(ResultSet resultSet = preparedStatement.executeQuery()){
					while(resultSet.next()) {
						KhachHang kh = new KhachHang(
								resultSet.getString(1),
		                        resultSet.getString(2),
		                        resultSet.getDate(3),
		                        resultSet.getString(4),
		                        resultSet.getString(5),
		                        resultSet.getString(6)
								
						);
						khachHangList.add(kh);
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return khachHangList;
		
	}
	
	public static void main(String[] args) {
		
		for (KhachHang a : KhachHang_Dao.getAllDB()) {
			System.out.println(a);
		}
		
	}
	
	// khách hàng vẵng lai
	public static void add(String sdt) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		int n = PhieuDatPhong_Dao.getAllPDP().size()+1;
		String sql = "INSERT KhachHang (sdt, tinhTrang)"
				+ " VALUES (?,?)";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, sdt);
			prepare.setString(2, "KHÁCH HÀNG CHƯA ĐĂNG KÝ");
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}		
		ConnectDB.disconect();
//		INSERT KhachHang (maKH, hoTenKH, sdt, diaChi, ngaySinh, tinhTrang)
//		VALUES ('0111111111', N'CHƯA ĐĂNG KÝ', '0985189541', N'CHƯA ĐĂNG KÝ', '2001-02-12', N'CHƯA ĐĂNG KÝ')
	}

	public static KhachHang search(String sdt) {
		for (KhachHang a : KhachHang_Dao.getAllDB()) {
			if(a.getSdt().equalsIgnoreCase(sdt))
				return a;
		}
		return null;
	}
	
	
}
