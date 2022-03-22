package zoo;

import java.time.LocalDate;

public class Hlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pes pes = new Pes(LocalDate.of(2018, 10, 15),"Rudolf");
			Had had = new Had(LocalDate.of(2014, 10, 15),"Adolf");
			SuchozemskaZelva zelvas = new SuchozemskaZelva(LocalDate.of(2001, 01, 15),"Alfons");
			VodniZelva zelvav = new VodniZelva(LocalDate.of(2011, 12, 30),"Lisohlav");
			pes.vydejZvuk();
			pes.vypisJmenoADatum();
			had.vydejZvuk();
			had.vypisJmenoADatum();
			zelvav.vydejZvuk();
			zelvav.vypisJmenoADatum();
			zelvas.vydejZvuk();
			zelvas.vypisJmenoADatum();
	}

}
