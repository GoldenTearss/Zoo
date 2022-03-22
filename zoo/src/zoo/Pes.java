package zoo;

import java.time.LocalDate;

public class Pes extends Zvire {

	public Pes(LocalDate datumNarozeni, String jmeno) {
		super(datumNarozeni, jmeno);
	}
	
	
	public void vydejZvuk() {
		System.out.println("Haf");
	}

	
}
