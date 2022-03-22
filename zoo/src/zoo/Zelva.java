package zoo;

import java.time.LocalDate;

public abstract class Zelva extends Zvire{

	public Zelva(LocalDate datumNarozeni, String jmeno) {
		super(datumNarozeni, jmeno);
	}
	
	public abstract void vydejZvuk();
	

	
}
