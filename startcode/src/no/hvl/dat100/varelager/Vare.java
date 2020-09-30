package no.hvl.dat100.varelager;

public class Vare {

	private int varenr;
	private String navn;
	private double pris;

	public Vare(int varenr, String navn, double pris) {
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
//		throw new TODO("Vare"); // REMOVE ME WHEN DONE
	}

	public int getVarenr() {
		return varenr;
//		throw new TODO("getVarenr");

	}

	public void setVarenr(int varenr) {
		this.varenr = varenr;
//		throw new TODO("setVarenr");
	}

	public String getNavn() {
		return navn;
//		throw new TODO("getNavn");
	}

	public void setNavn(String navn) {
		this.navn = navn;
//		throw new TODO("setNavn");
	}

	public double getPris() {
		return pris;
//		throw new TODO("getPris");
	}

	public void setPris(double pris) {
		this.pris = pris;
//		throw new TODO("setPris");
	}

	public double beregnMoms() {
		return pris * 0.2;
//		throw new TODO("beregnMoms");
	}

	public String toString() {
		return "Vare [varenr=" + this.varenr + ", navn=" + this.navn + ", pris=" + this.pris + "]";
		//		throw new TODO("toString");
	}

	public boolean erBilligereEnn(Vare v) {
		if (pris >= v.getPris()) {
			return false;
		} else
			return true;

//		throw new TODO("erBilligereEnn");
	}

}
