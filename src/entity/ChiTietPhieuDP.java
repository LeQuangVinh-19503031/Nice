package entity;

import java.time.LocalDateTime;

public class ChiTietPhieuDP {
	private String maPDP;
	private String maP;
	private LocalDateTime tgVao;
	private LocalDateTime tgRa;
	private String tinhTrang;
	
	
	
	@Override
	public String toString() {
		return "ChiTietPhieuDP [maPDP=" + maPDP + ", maP=" + maP + ", tgVao=" + tgVao + ", tgRa=" + tgRa
				+ ", tinhTrang=" + tinhTrang + "]";
	}



	public String getMaPDP() {
		return maPDP;
	}



	public void setMaPDP(String maPDP) {
		this.maPDP = maPDP;
	}



	public String getMaP() {
		return maP;
	}



	public void setMaP(String maP) {
		this.maP = maP;
	}



	public LocalDateTime getTgVao() {
		return tgVao;
	}



	public void setTgVao(LocalDateTime tgVao) {
		this.tgVao = tgVao;
	}



	public LocalDateTime getTgRa() {
		return tgRa;
	}



	public void setTgRa(LocalDateTime tgRa) {
		this.tgRa = tgRa;
	}



	public String getTinhTrang() {
		return tinhTrang;
	}



	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}



	public ChiTietPhieuDP(String maPDP, String maP, LocalDateTime tgVao, LocalDateTime tgRa, String tinhTrang) {
		super();
		this.maPDP = maPDP;
		this.maP = maP;
		this.tgVao = tgVao;
		this.tgRa = tgRa;
		this.tinhTrang = tinhTrang;
	}



	public ChiTietPhieuDP() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ChiTietPhieuDP(String maPDP, String maP, LocalDateTime tgVao, String tinhTrang) {
		super();
		this.maPDP = maPDP;
		this.maP = maP;
		this.tgVao = tgVao;
		this.tinhTrang = tinhTrang;
	}
	
	

}
