package entity;

public class CaTruc {
	private int maCT;
	private int vaoCa;
	private int raCa;
	public int getMaCT() {
		return maCT;
	}
	public void setMaCT(int maCT) {
		this.maCT = maCT;
	}
	public int getVaoCa() {
		return vaoCa;
	}
	public void setVaoCa(int vaoCa) {
		this.vaoCa = vaoCa;
	}
	public int getRaCa() {
		return raCa;
	}
	public void setRaCa(int raCa) {
		this.raCa = raCa;
	}
	public CaTruc(int maCT, int vaoCa, int raCa) {
		super();
		this.maCT = maCT;
		this.vaoCa = vaoCa;
		this.raCa = raCa;
	}
	public CaTruc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CaTruc [maCT=" + maCT + ", vaoCa=" + vaoCa + ", raCa=" + raCa + "]";
	}



}
