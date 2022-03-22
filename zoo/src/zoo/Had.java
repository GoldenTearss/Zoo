package zoo;

import java.time.LocalDate;

public class Had extends Zvire{

	public Had(LocalDate datumNarozeni, String jmeno) {
		super(datumNarozeni, jmeno);
	}
	
	public void vydejZvuk() {
		System.out.println("Sssss");
	}
	
}
