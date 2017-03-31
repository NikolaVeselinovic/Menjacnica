package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.interfejs;

public class menjacnica implements interfejs {
	LinkedList<valuta> kursnaLista= new LinkedList<valuta>();
	
	public void dodavanjeKursa(valuta v) {
		kursnaLista.add(v);

	}

	
	public void brisanjeKursa(GregorianCalendar datum, String valuta) {
		

	}

	
	public valuta pronalazenjeKursa(GregorianCalendar datum, String valuta) {
		
		return null;
	}

}
