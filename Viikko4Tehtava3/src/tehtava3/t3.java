package tehtava3;

import java.util.ArrayList;



public class t3 {

	public static void main(String[] args) {
		
		ArrayList<Tuote> lista = new ArrayList<>();
		Tuote tu = new Tuote();
		Tietokone ti = new Tietokone("Asus", "ER443", "212232",12,3);
		Tietokone ti2 = new Tietokone("Lenovo", "HH544", "3233",15,21);
		Tietokone ti3 = new Tietokone("Fujitsu", "3323F", "9888",2,5);
		Tietokone ti4 = new Tietokone("IBM", "IBM3444", "343",150,2);
		lista.add(ti);
		lista.add(ti2);
		lista.add(ti3);
		lista.add(ti4);
		
		 for (Object t : lista) {                                                        
	           if (t instanceof Tietokone) {
	              Tietokone tietokoneet = (Tietokone) t;
	              tietokoneet.tulostaTietokone();
	            }
	           	if (t instanceof Tuote) {
	              Tuote tuotteet = (Tuote) t;
	              tuotteet.tulostaTuote();
	            }
	        }
		
	}

}
