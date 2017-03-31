package interfejs;

import java.util.GregorianCalendar;

import menjacnica.valuta;

public interface interfejs {
	public void dodavanjeKursa(valuta v);
	public void brisanjeKursa(GregorianCalendar datum, String valuta);
	public valuta pronalazenjeKursa(GregorianCalendar datum, String valuta);
}
