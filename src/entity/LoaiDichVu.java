package entity;

public class LoaiDichVu {
	private String ma;
	private String ten;
	public LoaiDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiDichVu(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	@Override
	public String toString() {
		return "LoaiDichVu [ma=" + ma + ", ten=" + ten + "]";
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	
}
