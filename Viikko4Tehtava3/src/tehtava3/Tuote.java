package tehtava3;

public class Tuote {

	private String Tuotenumero;
	private Integer Tuotepaikka;
	private Integer Maara;
	
	public Tuote() {
		
	}
	
	public Tuote(String tuotenumero, Integer tuotepaikka, Integer maara) {
		
		Tuotenumero = tuotenumero;
		Tuotepaikka = tuotepaikka;
		Maara = maara;
	}
	public Tuote(String tuotenumero) {
		
		Tuotenumero = tuotenumero;
		
	}
	
	public String getTuotenumero() {
		return Tuotenumero;
	}
	public void setTuotenumero(String tuotenumero) {
		Tuotenumero = tuotenumero;
	}
	public Integer getTuotepaikka() {
		return Tuotepaikka;
	}
	public void setTuotepaikka(Integer tuotepaikka) {
		Tuotepaikka = tuotepaikka;
	}
	public Integer getMaara() {
		return Maara;
	}
	public void setMaara(Integer maara) {
		Maara = maara;
	}
	public void tulostaTuote() {
		
        System.out.println("Tuotenumero: " + this.Tuotenumero + " M‰‰r‰ " + this.Maara + " Paikka " + this.Tuotepaikka + System.lineSeparator());

        
    }        
	
}
