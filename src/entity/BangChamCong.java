package entity;

import java.util.Date;

public class BangChamCong {
	
	private int maCT;
	private String maNV;
	private Date ngay;
	private boolean chamCong;
	
	public int getMaCT() {
		return maCT;
	}
	public void setMaCT(int maCT) {
		this.maCT = maCT;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public boolean isChamCong() {
		return chamCong;
	}
	public void setChamCong(boolean chamCong) {
		this.chamCong = chamCong;
	}
	public BangChamCong(int maCT, String maNV, Date ngay, boolean chamCong) {
		super();
		this.maCT = maCT;
		this.maNV = maNV;
		this.ngay = ngay;
		this.chamCong = chamCong;
	}
	public BangChamCong() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BangChamCong [maCT=" + maCT + ", maNV=" + maNV + ", ngay=" + ngay + ", chamCong=" + chamCong + "]";
	}
	
	
	
	
}
