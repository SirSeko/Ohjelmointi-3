package Tehtava1ja2;

public class Saastotili extends Tili {

	public Saastotili() {
		
	}
	
	public Saastotili(String tilinumero, String omistaja, Double saldoEuroina, Double vuosikorko) {
		super(tilinumero, omistaja, saldoEuroina, vuosikorko);
		
	}
		

	@Override
	public double laskeVuosiKorkotuotto (Double vuosikorko) {
		 if (vuosikorko != null) {
	         return vuosikorko /100 * this.getSaldoEuroina();
	        }
		 else
		 	return 0; 
	}
	


	@Override
	public void tulostaTilinTiedot () {
		laskeVuosiKorkotuotto(this.getVuosikorko());
		System.out.println("Omistaja: " + this.getOmistaja() + " Tilinro: " + this.getTilinumero() + " Saastotilin saldo on: " +this.getSaldoEuroina() +"€" +
				" Vuosikorko on: " + laskeVuosiKorkotuotto(this.getVuosikorko()) +"€");
		
		
		
	}
	 
	
	
	

}
