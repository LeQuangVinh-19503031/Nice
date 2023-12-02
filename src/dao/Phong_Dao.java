package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import constant.Types;
import entity.KhachHang;
import entity.Phong;

public class Phong_Dao {

	public static ArrayList<Phong> getAllRoomDB() {
		ConnectDB.connect();
		ArrayList<Phong> list = new ArrayList<Phong>();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();

		try {
			String sql = "Select * From Phong";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new Phong(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getDouble(4), resultSet.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();
		return list;
	}

	public Phong getIndex(int n) {
		return this.getAllRoomDB().get(n - 1);
	}

	public static void updateStatusRoom(String maP, String status) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "update Phong set tinhTrang = N'" + status + "' where maP = ?";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, maP);
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();

	}

	public static void updateStatusAllFree() {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "update Phong set tinhTrang = N'TRỐNG'";
		try {

			prepare = con.prepareStatement(sql);
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectDB.disconect();

	}

	public static Phong searchPhong(String tenP) {
		for (Phong i : getAllRoomDB()) {
			if (i.getTenPhong().equalsIgnoreCase(tenP))
				return i;
		}
		return null;
	}

	public static ArrayList<Phong> getListTypeRoom(String type) {
		var list = Phong_Dao.getAllRoomDB();
		var res = new ArrayList<Phong>();
		for (Phong phong : list) {
			if (type.equalsIgnoreCase(phong.getLoaiPhong())) {
				res.add(phong);
			}
		}
		return res;
	}

	public static ArrayList<Phong> getRoomTypeAndCount(String roomtype, String countPeople) {
		var list = new ArrayList<Phong>();
		if (roomtype.equalsIgnoreCase(Types.ROOM_TYPE_VIP)) {
			if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_TWENTY)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals(roomtype) && phong.getGiaPhong() == 220000.0)
						list.add(phong);
				}
			} else if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_TEN)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals(roomtype) && phong.getGiaPhong() == 110000.0)
						list.add(phong);
				}
			} else if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_FIVE)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals(roomtype) && phong.getGiaPhong() == 66000.0)
						list.add(phong);
				}
			} else {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals(roomtype))
						list.add(phong);
				}
			}
		} else if (roomtype.equalsIgnoreCase(Types.ROOM_TYPE_NORMAL)) {
			if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_TWENTY)) {
				System.out.println("T_20");
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals("NORMAL") && phong.getGiaPhong() == 200000.0)
						list.add(phong);
				}
			} else if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_TEN)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals("NORMAL") && phong.getGiaPhong() == 100000.0)
						list.add(phong);
				}
			} else if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_FIVE)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals("NORMAL") && phong.getGiaPhong() == 60000.0)
						list.add(phong);
				}
			} else {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getLoaiPhong().equals(roomtype))
						list.add(phong);
				}
			}
		} else {
			if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_TWENTY)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getGiaPhong() >= 200000.0)
						list.add(phong);
				}
			} else if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_TEN)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getGiaPhong() >= 100000.0 && phong.getGiaPhong() < 200000.0) {
						list.add(phong);
					}
				}
			} else if (countPeople.equals(Types.ROOM_COUNT_PEOPLE_FIVE)) {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					if (phong.getGiaPhong() >= 60000.0 && phong.getGiaPhong() < 100000.0)
						list.add(phong);
				}
			} else {
				for (Phong phong : Phong_Dao.getAllRoomDB()) {
					list.add(phong);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
//		updateStatusAllFree();
		for (Phong string : Phong_Dao.getAllRoomDB()) {
			System.out.println(string);
		}
	}

	@SuppressWarnings("finally")
	public static boolean addRoomNew(Phong r) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "INSERT Phong(maP, tenP, maLP, giaP, tinhTrang) VALUES(?,?,?,?,?)";
		try {
			prepare = con.prepareStatement(sql);
			prepare.setString(1, r.getMaPhong());
			prepare.setString(2, r.getTenPhong());
			prepare.setString(3, r.getLoaiPhong());
			prepare.setDouble(4, r.getGiaPhong());
			prepare.setString(5, r.getTinhTrang());
			prepare.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ConnectDB.disconect();
			return true;
		}	
	}

	@SuppressWarnings("finally")
	public static boolean fixRoom(Phong newRoom) {
		ConnectDB.connect();
		ConnectDB.getConDB();
		Connection con = ConnectDB.getCon();
		PreparedStatement prepare = null;
		String sql = "update Phong set tinhTrang = ?, giaP = ?, maLP = ? where maP = ?";
		try {
			
			prepare = con.prepareStatement(sql);
			prepare.setString(1, newRoom.getTinhTrang());
			prepare.setDouble(2, newRoom.getGiaPhong());
			prepare.setString(3, newRoom.getLoaiPhong());
			prepare.setString(4, newRoom.getMaPhong());
			prepare.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ConnectDB.disconect();
			return true;
		}
		
	}
}
