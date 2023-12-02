package entity;

import java.time.LocalDateTime;
import java.util.Date;

public class HoaDon {

	private String maHD;
	private String maNV;
	private String maKH;
	private LocalDateTime thoiGianLap;
	private String tinhTrang;
	
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public LocalDateTime getThoiGianLap() {
		return thoiGianLap;
	}

	public void setThoiGianLap(LocalDateTime thoiGianLap) {
		this.thoiGianLap = thoiGianLap;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public HoaDon(String maHD, String maNV, String maKH, LocalDateTime thoiGianLap, String tinhTrang) {
		super();
		this.maHD = maHD;
		this.maNV = maNV;
		this.maKH = maKH;
		this.thoiGianLap = thoiGianLap;
		this.tinhTrang = tinhTrang;
	}

	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", maNV=" + maNV + ", maKH=" + maKH + ", thoiGianLap=" + thoiGianLap
				+ ", tinhTrang=" + tinhTrang + "]";
	}
}
