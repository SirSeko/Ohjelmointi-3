package Tehtava1ja2;

public abstract class Tili {

	private String Tilinumero;
	private String Omistaja;
	private Double SaldoEuroina;
	private Double Vuosikorko;
	
	public Tili() {
		
	}
	
	public Tili(String tilinumero, String omistaja, Double saldoEuroina, Double vuosikorko) {
		super();
		Tilinumero = tilinumero;
		Omistaja = omistaja;
		SaldoEuroina = saldoEuroina;
		Vuosikorko = vuosikorko;
	}

	
	public String getTilinumero() {
		return Tilinumero;
	}
	public void setTilinumero(String tilinumero) {
		
		Tilinumero = tilinumero;
	}
	public String getOmistaja() {
		return Omistaja;
	}
	public void setOmistaja(String omistaja) {
		Omistaja = omistaja;
	}
	public Double getSaldoEuroina() {
		return SaldoEuroina;
	}
	public void setSaldoEuroina(Double saldoEuroina) {
		SaldoEuroina = saldoEuroina;
	}
	public Double getVuosikorko() {
		return Vuosikorko;
	}
	public void setVuosikorko(Double vuosikorko) {
		
		Vuosikorko = vuosikorko;
		/*try {
			if (vuosikorko < 0) {
				throw new ArithmeticException("Luku ei saa olla negatiivinen");
			}
			else {
				Vuosikorko = vuosikorko;
			}
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		}*/
	}	
	public abstract double laskeVuosiKorkotuotto (Double vuosikorko);
	
	public abstract void tulostaTilinTiedot();
		
		
	

	
	
}
