package entity;

import java.util.ArrayList;

public class Phong{
	private String maP;
	private String tenP;
	private String maLP;
	private String tinhTrang;
	private double giaP;

	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phong(String maPhong, String tenPhong, String loaiPhong, double giaPhong, String tinhTrang) {
		super();
		this.maP = maPhong;
		this.tenP = tenPhong;
		this.tinhTrang = tinhTrang;
		this.giaP = giaPhong;
		this.maLP = loaiPhong;
	}

	public String getMaPhong() {
		return maP;
	}

	public void setMaPhong(String maPhong) {
		this.maP = maPhong;
	}

	public String getTenPhong() {
		return tenP;
	}

	public void setTenPhong(String tenPhong) {
		this.tenP = tenPhong;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public double getGiaPhong() {
		return giaP;
	}

	public void setGiaPhong(double giaPhong) {
		this.giaP = giaPhong;
	}

	public String getLoaiPhong() {
		return maLP;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.maLP = loaiPhong;
	}

	public static ArrayList<Phong> nhapCung(int x) {
		ArrayList<Phong> list = new ArrayList<>();
		for (int i = 1; i < x; i++) {
				list.add(new Phong("P0"+i, "Phòng "+i, "Trống", 0, ""));
		}
		return list;
	}


	@Override
	public String toString() {
		return "Phong [maPhong=" + maP + ", tenPhong=" + tenP + ", tinhTrang=" + tinhTrang + ", giaPhong="
				+ giaP + ", loaiPhong=" + maLP + "]";
	}
	
	

}
