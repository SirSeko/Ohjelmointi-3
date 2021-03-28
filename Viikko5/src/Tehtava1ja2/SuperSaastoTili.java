package Tehtava1ja2;

public class SuperSaastoTili extends Saastotili {

	public SuperSaastoTili() {
		// TODO Auto-generated constructor stub
	}
	
	public SuperSaastoTili(String tilinumero, String omistaja, Double saldoEuroina, Double vuosikorko) {
		super(tilinumero, omistaja, saldoEuroina, vuosikorko);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double laskeVuosiKorkotuotto (Double vuosikorko) {
		 if (this.getSaldoEuroina() <= 10000) {
	         return super.laskeVuosiKorkotuotto(vuosikorko);
	        }
		 else if (this.getSaldoEuroina() >= 10001) {
			  return (vuosikorko +3) /100 * (this.getSaldoEuroina() -10000);
		 } 
		 else {
			 return 0;
		 }
		
	}
	@Override
	public void tulostaTilinTiedot() {
		if (this.getSaldoEuroina() >= 10001) {
	        laskeVuosiKorkotuotto(this.getVuosikorko());
			System.out.println("Omistaja: " + this.getOmistaja() + " Tilinro :" + this.getTilinumero() + "Super Saastotilin saldo on :" +this.getSaldoEuroina() +"€ " +
					" Vuosikorko on : " + laskeVuosiKorkotuotto(this.getVuosikorko()) +"€");
	    }
		else {
			super.tulostaTilinTiedot();
			
		}
		
	}

}
