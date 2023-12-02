package entity;

import java.util.Date;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String maLSP;
	private Date ngayNhap;
	private double giaNhap;
	private double giaBan;
	private int soLuongTon;
	private String tinhTrang;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(String maSP, String tenSP, String maLSP, Date ngayNhap, double giaNhap, double giaBan,
			int soLuongTon, String tinhTrang) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.maLSP = maLSP;
		this.ngayNhap = ngayNhap;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.soLuongTon = soLuongTon;
		this.tinhTrang = tinhTrang;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", maLSP=" + maLSP + ", ngayNhap=" + ngayNhap
				+ ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", soLuongTon=" + soLuongTon + ", tinhTrang="
				+ tinhTrang + "]";
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getMaLSP() {
		return maLSP;
	}
	public void setMaLSP(String maLSP) {
		this.maLSP = maLSP;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}
