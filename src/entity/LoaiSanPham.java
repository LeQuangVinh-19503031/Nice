package entity;

public class LoaiSanPham {
	private String maLSP;
	private String tenLSP;
	private String maLDV;
	
	public LoaiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiSanPham(String maLSP, String tenLSP, String maLDV) {
		super();
		this.maLSP = maLSP;
		this.tenLSP = tenLSP;
		this.maLDV = maLDV;
	}
	@Override
	public String toString() {
		return "LoaiSanPham [maLSP=" + maLSP + ", tenLSP=" + tenLSP + ", maLDV=" + maLDV + "]";
	}
	public String getMaLSP() {
		return maLSP;
	}
	public void setMaLSP(String maLSP) {
		this.maLSP = maLSP;
	}
	public String getTenLSP() {
		return tenLSP;
	}
	public void setTenLSP(String tenLSP) {
		this.tenLSP = tenLSP;
	}
	public String getMaLDV() {
		return maLDV;
	}
	public void setMaLDV(String maLDV) {
		this.maLDV = maLDV;
	}
	
	
	
	
}
