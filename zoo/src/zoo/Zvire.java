package zoo;

import java.time.LocalDate;

public abstract class Zvire {

	private LocalDate datumNarozeni;
	private String jmeno;
	
	public Zvire(LocalDate datumNarozeni, String jmeno) {
		super();
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
	}
	
	public void vypisJmenoADatum() {
		System.out.println("Narodil jsem se v: "+datumNarozeni+" a jmenuju se: "+jmeno);
	}
	
	public abstract void vydejZvuk();
	
}
