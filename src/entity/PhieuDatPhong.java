package entity;

import java.util.Date;

public class PhieuDatPhong {
	private String maPhieuDP;
	private String maNV;
	private Date ngayLap;
	private String tinhTrang;
	
	public String getMaPhieuDP() {
		return maPhieuDP;
	}
	public void setMaPhieuDP(String maPhieuDP) {
		this.maPhieuDP = maPhieuDP;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	
	public PhieuDatPhong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PhieuDatPhong(String maPhieuDP, String maNV, Date ngayLap, String tinhTrang) {
		super();
		this.maPhieuDP = maPhieuDP;
		this.maNV = maNV;
		this.ngayLap = ngayLap;
		this.tinhTrang = tinhTrang;
	}
	@Override
	public String toString() {
		return "PhieuDatPhong [maPhieuDP=" + maPhieuDP + ", maNV=" + maNV + ", ngayLap=" + ngayLap + ", tinhTrang="
				+ tinhTrang + "]";
	}
	

	
}
