package entity;

import java.sql.Date;
import java.util.Objects;

public class KhachHang {
	private String sdt;
	private String hoTenKH;
	private Date ngaySinh;
	private String email;
	private String diaChi;
	private String tinhTrang;
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String sdt, String hoTenKH, Date ngaySinh, String email, String diaChi, String tinhTrang) {
		super();
		this.sdt = sdt;
		this.hoTenKH = hoTenKH;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.diaChi = diaChi;
		this.tinhTrang = tinhTrang;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	@Override
	public String toString() {
		return "KhachHang [sdt=" + sdt + ", hoTenKH=" + hoTenKH + ", ngaySinh=" + ngaySinh + ", email=" + email
				+ ", diaChi=" + diaChi + ", tinhTrang=" + tinhTrang + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(diaChi, email, hoTenKH, ngaySinh, sdt, tinhTrang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(diaChi, other.diaChi) && Objects.equals(email, other.email)
				&& Objects.equals(hoTenKH, other.hoTenKH) && Objects.equals(ngaySinh, other.ngaySinh)
				&& Objects.equals(sdt, other.sdt) && Objects.equals(tinhTrang, other.tinhTrang);
	}
	

}
