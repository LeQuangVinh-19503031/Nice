package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.Date;

import connect.ConnectDB;
import entity.HoaDon;

public class HoaDon_Dao {

	private static DateTimeFormatter dtf;

	public static ArrayList<HoaDon> getAllDB() {
//		dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//		LocalDateTime dt = LocalDateTime.of(2023, 11, 11, 11, 11, 0);
//		System.out.println("1: " +dt.format(dtf));
		var list = new ArrayList<HoaDon>();
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		
		try {
			String spl = "Select * From HoaDon";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(spl);
			
			while(resultSet.next()) {
//				System.out.println("2: " +resultSet.getTimestamp(4).toString());
//				System.out.println(resultSet.getTimestamp(4).getYear());
//				System.out.println("3: " +);
				list.add(new HoaDon(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3),
						LocalDateTime.of(resultSet.getTimestamp(4).getYear()-100+2000, resultSet.getTimestamp(4).getMonth(), resultSet.getTimestamp(4).getDate(), resultSet.getTimestamp(4).getHours(), resultSet.getTimestamp(4).getMinutes(), resultSet.getTimestamp(4).getSeconds()),
						resultSet.getString(5)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}
	
	public static void main(String[] args) {
//		add("NV1", "0985189541");
		for (HoaDon p : HoaDon_Dao.getAllDB()) {
			System.out.println(p);
		}
	}

//		private String maHD;
//		private String maNV;
//		private String maKH;
//		private Date thoiGianLap;
//		private String tinhTrang;
//		2023-11-18 00:00:00.000
	public static void add(String nvWorking, String maKH) {
		
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		int n = HoaDon_Dao.getAllDB().size()+1;
		String sql = "INSERT HoaDon(maHD, maNV, maKH, tinhTrang) VALUES (?,?,?,?)";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, "HD"+n);
			prepare.setString(2, nvWorking);
			prepare.setString(3, maKH);
			prepare.setString(4, "CHƯA THANH TOÁN");
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		
		}		
		ConnectDB.disconect();
	}
	
	
	
	
}
