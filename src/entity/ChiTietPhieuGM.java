package entity;

import java.util.Date;

public class ChiTietPhieuGM {
	private String maPhieuGP;
	private String maSP;
	private int soLuong;
	private String tinhTrang;
	public ChiTietPhieuGM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietPhieuGM(String maPhieuGP, String maSP, int soLuong, String tinhTrang) {
		super();
		this.maPhieuGP = maPhieuGP;
		this.maSP = maSP;
		this.soLuong = soLuong;
		this.tinhTrang = tinhTrang;
	}
	@Override
	public String toString() {
		return "ChiTietPhieuGM [maPhieuGP=" + maPhieuGP + ", maSP=" + maSP + ", soLuong=" + soLuong + ", tinhTrang="
				+ tinhTrang + "]";
	}
	public String getMaPhieuGP() {
		return maPhieuGP;
	}
	public void setMaPhieuGP(String maPhieuGP) {
		this.maPhieuGP = maPhieuGP;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}
