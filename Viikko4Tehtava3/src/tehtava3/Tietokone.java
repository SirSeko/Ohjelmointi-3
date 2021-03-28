package tehtava3;

public class Tietokone extends Tuote  {

	private String Merkki;
	private String Malli;
	
	
	public Tietokone() {
		
		
	}
	public Tietokone(final String merkki, final String malli) {
		
		Merkki = merkki;
		Malli = malli;
	}
	public Tietokone(final String merkki, final String malli, final String tuotenumero) {
	
		Merkki = merkki;
		Malli = malli;
		setTuotenumero(tuotenumero);
	}
	public Tietokone(final String merkki, final String malli, final String tuotenumero, final Integer tuotepaikka,
			final Integer maara) {
		
		Merkki = merkki;
		Malli = malli;
		setTuotenumero(tuotenumero);
		setMaara(maara);
		setTuotepaikka(tuotepaikka);
	}
	public String getMerkki() {
		return Merkki;
	}
	public void setMerkki(String merkki) {
		Merkki = merkki;
	}
	public String getMalli() {
		return Malli;
	}
	public void setMalli(String malli) {
		Malli = malli;
	}
	
	public Integer getTuotepaikka() {
		Integer uusiTuotepaikka = super.getTuotepaikka();
		if (uusiTuotepaikka < 10) {
			uusiTuotepaikka = uusiTuotepaikka + 10;
			
		}
		else if (uusiTuotepaikka > 10 && uusiTuotepaikka <100 ) {
			uusiTuotepaikka = uusiTuotepaikka + 30;
			
		}
		else {
			uusiTuotepaikka = uusiTuotepaikka + 500;
			
		}
		return uusiTuotepaikka;
	}
	
	
	public void tulostaTietokone() {
		
        System.out.println("Merkki: " + this.Merkki + " Malli " + this.Malli );

        
    }        
	
	
	
	
	
}
