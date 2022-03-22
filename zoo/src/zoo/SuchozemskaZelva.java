package zoo;

import java.time.LocalDate;

public class SuchozemskaZelva extends Zelva {

	@Override
	public void vydejZvuk() {
		System.out.println("Eh");
	}

	public SuchozemskaZelva(LocalDate datumNarozeni, String jmeno) {
		super(datumNarozeni, jmeno);
		// TODO Auto-generated constructor stub
	}

}
