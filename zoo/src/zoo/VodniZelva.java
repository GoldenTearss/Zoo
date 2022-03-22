package zoo;

import java.time.LocalDate;

public class VodniZelva extends Zelva {

	@Override
	public void vydejZvuk() {
		System.out.println("Moans");
	}

	public VodniZelva(LocalDate datumNarozeni, String jmeno) {
		super(datumNarozeni, jmeno);
		
	}

}
