package entity;

import java.util.Date;
import java.util.Objects;

public class NhanVien {
	
	private String maNV;
	private String hoTenNV;
	private String maCV;
	private String sdt;
	private String cccd;
	private Date ngaySinh;
	private String diaChi;
	private float heSoLuong;
	private String maNVQL;
	private String trinhTrang;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTenNV() {
		return hoTenNV;
	}
	public void setHoTenNV(String hoTenNV) {
		this.hoTenNV = hoTenNV;
	}
	public String getMaCV() {
		return maCV;
	}
	public void setMaCV(String maCV) {
		this.maCV = maCV;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public String getMaNVQL() {
		return maNVQL;
	}
	public void setMaNVQL(String maNVQL) {
		this.maNVQL = maNVQL;
	}
	public String getTrinhTrang() {
		return trinhTrang;
	}
	public void setTrinhTrang(String trinhTrang) {
		this.trinhTrang = trinhTrang;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String maNV, String hoTenNV, String maCV, String sdt, String cccd, Date ngaySinh, String diaChi,
			float heSoLuong, String maNVQL, String trinhTrang) {
		super();
		this.maNV = maNV;
		this.hoTenNV = hoTenNV;
		this.maCV = maCV;
		this.sdt = sdt;
		this.cccd = cccd;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.heSoLuong = heSoLuong;
		this.maNVQL = maNVQL;
		this.trinhTrang = trinhTrang;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTenNV=" + hoTenNV + ", maCV=" + maCV + ", sdt=" + sdt + ", cccd=" + cccd
				+ ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", heSoLuong=" + heSoLuong + ", maNVQL=" + maNVQL
				+ ", trinhTrang=" + trinhTrang + "]";
	}
	
	
	
	
	
}
