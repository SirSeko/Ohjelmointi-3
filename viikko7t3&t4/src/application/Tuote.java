package application;

public class Tuote {
	private String Nimi;
	private String Tuotetyyppi;
	private String Kayttoonottopaiva;
	private Double Myyntihinta;
	private String Ostaja;
	public Tuote() {
		
	}
	
	public Tuote(String nimi, String tuotetyyppi, String kayttoonottopaiva, Double myyntihinta, String ostaja) {
		
		Nimi = nimi;
		Tuotetyyppi = tuotetyyppi;
		Kayttoonottopaiva = kayttoonottopaiva;
		Myyntihinta = myyntihinta;
		Ostaja = ostaja;
	}
	public String getNimi() {
		return Nimi;
	}
	public void setNimi(String nimi) {
		Nimi = nimi;
	}
	public String getTuotetyyppi() {
		return Tuotetyyppi;
	}
	public void setTuotetyyppi(String tuotetyyppi) {
		Tuotetyyppi = tuotetyyppi;
	}
	public String getKayttoonottopaiva() {
		return Kayttoonottopaiva;
	}
	public void setKayttoonottopaiva(String kayttoonottopaiva) {
		Kayttoonottopaiva = kayttoonottopaiva;
	}
	public Double getMyyntihinta() {
		return Myyntihinta;
	}
	public void setMyyntihinta(Double myyntihinta) {
		Myyntihinta = myyntihinta;
	}

	public String getOstaja() {
		return Ostaja;
	}

	public void setOstaja(String ostaja) {
		Ostaja = ostaja;
	}
	
}
