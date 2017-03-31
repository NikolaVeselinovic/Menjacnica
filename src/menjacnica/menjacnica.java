package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import interfejs.interfejs;

public class menjacnica implements interfejs {
	LinkedList<valuta> kursnaLista= new LinkedList<valuta>();
	
	public void dodavanjeKursa(valuta v) {
		if(v!=null){
			kursnaLista.add(v);}
		else{
			throw new RuntimeException();
		}
	}

	
	public void brisanjeKursa(GregorianCalendar datum, String valuta) {
		if(valuta!=null && datum!=null){
		for(int i=0;i<kursnaLista.size();i++){
			if(kursnaLista.get(i).getDatum().equals(datum) && kursnaLista.get(i).getNaziv().equals(valuta)){
				kursnaLista.remove(i);
			}
		}
		}
		else{
			throw new RuntimeException("uneti su pogresni parametri");
		}

	}

	
	public valuta pronalazenjeKursa(GregorianCalendar datum, String valuta) {
		if(valuta!=null && datum!=null){
			for(int i=0;i<kursnaLista.size();i++){
				if(kursnaLista.get(i).getDatum().equals(datum) && kursnaLista.get(i).getNaziv().equals(valuta)){
					return kursnaLista.get(i);
				}
			}
			}
			else{
				throw new RuntimeException("uneti su pogresni parametri");
			}
		return null;
	}

}
