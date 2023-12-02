package entity;

import java.util.Date;

public class PhieuGoiMon {
	
	private String maPGM;
	private String maNV;
	private Date thoiGianLap;
	private String maP;
	private String tinhTrang;
	
	public String getMaPhieuGM() {
		return maPGM;
	}
	public void setMaPhieuGM(String maPhieuGM) {
		this.maPGM = maPhieuGM;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public Date getThoiGianLap() {
		return thoiGianLap;
	}
	public void setThoiGianLap(Date thoiGianLap) {
		this.thoiGianLap = thoiGianLap;
	}
	public String getMaPhong() {
		return maP;
	}
	public void setMaPhong(String maPhong) {
		this.maP = maPhong;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public PhieuGoiMon(String maPhieuGM, String maNV, Date thoiGianLap, String maPhong, String tinhTrang) {
		super();
		this.maPGM = maPhieuGM;
		this.maNV = maNV;
		this.thoiGianLap = thoiGianLap;
		this.maP = maPhong;
		this.tinhTrang = tinhTrang;
	}
	public PhieuGoiMon() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PhieuGoiMon [maPhieuGM=" + maPGM + ", maNV=" + maNV + ", thoiGianLap=" + thoiGianLap + ", maPhong="
				+ maP + ", tinhTrang=" + tinhTrang + "]";
	}

	
	
}
