package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;

	public Varelager(int n) {
		varer = new Vare[n];
		antall = 0;
	}

	public Vare[] getVarer() {
		return varer;
	}

	public boolean leggTilVare(Vare v) {

		if (varer.length == antall) {
			return false;
		} else {
			varer[antall] = v;
			antall++;
			return true;
		}

	}

	public boolean leggTil(int varenr, String navn, double pris) {
		Vare v = new Vare(varenr, navn, pris);
		if (leggTilVare(v) == true) {
			return true;
		} else return false;
	}

	public Vare finnVare(int varenr) {
		for (int i = 0; i < varer.length; i++) {
			if (varenr == varer[i].getVarenr()) {
				return varer[i];
			}
		}
		return null;
//		throw new TODO("finnVare");

	}

	private String SEP = "==============================";

	public void printVarelager() {
		System.out.println(SEP);
		for (int i = 0; i < varer.length; i++) {
			System.out.println(varer[i].toString());
		}
		System.out.println(SEP);

	}

}
