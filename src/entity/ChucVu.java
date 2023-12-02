package entity;

public class ChucVu {
	private String maCV;
	private String tenCV;
	public ChucVu(String maCV, String tenCV) {
		super();
		this.maCV = maCV;
		this.tenCV = tenCV;
	}
	public ChucVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaCV() {
		return maCV;
	}
	public void setMaCV(String maCV) {
		this.maCV = maCV;
	}
	public String getTenCV() {
		return tenCV;
	}
	public void setTenCV(String tenCV) {
		this.tenCV = tenCV;
	}
	@Override
	public String toString() {
		return "ChucVu [maCV=" + maCV + ", tenCV=" + tenCV + "]";
	}
	
	

}
