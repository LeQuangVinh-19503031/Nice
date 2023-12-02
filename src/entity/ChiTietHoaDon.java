package entity;

public class ChiTietHoaDon {
	private String maHD;
	private String maPhieuDP;
	private String maPhieuGM;
	private String maPhong;
	private String tinhTrang;
	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietHoaDon(String maHD, String maPhieuDP, String maPhieuGM, String maPhong, String tinhTrang) {
		super();
		this.maHD = maHD;
		this.maPhieuDP = maPhieuDP;
		this.maPhieuGM = maPhieuGM;
		this.maPhong = maPhong;
		this.tinhTrang = tinhTrang;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDon [maHD=" + maHD + ", maPhieuDP=" + maPhieuDP + ", maPhieuGM=" + maPhieuGM + ", maPhong="
				+ maPhong + ", tinhTrang=" + tinhTrang + "]";
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getMaPhieuDP() {
		return maPhieuDP;
	}
	public void setMaPhieuDP(String maPhieuDP) {
		this.maPhieuDP = maPhieuDP;
	}
	public String getMaPhieuGM() {
		return maPhieuGM;
	}
	public void setMaPhieuGM(String maPhieuGM) {
		this.maPhieuGM = maPhieuGM;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
}
