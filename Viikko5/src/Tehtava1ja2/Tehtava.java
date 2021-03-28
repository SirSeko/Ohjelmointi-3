package Tehtava1ja2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava {

	public static void main(String[] args) {


		SuperSaastoTili sst;
		Scanner input = new Scanner(System.in);
		ArrayList<Tili> lista = new ArrayList<>();
		String jatkuu;
		System.out.println("EKA TEHTAVA");
		do {
			System.out.println("Haluatko lisätä tilin? k/e ");
			jatkuu = input.nextLine();
			if (jatkuu.equalsIgnoreCase("k")) {
				sst = new SuperSaastoTili();
				System.out.println("Anna nimi:");
				sst.setOmistaja(input.nextLine());			
				System.out.println("Anna tilinro: ");
				sst.setTilinumero(input.nextLine());			
				System.out.println("Anna tilin saldo: ");
				double d = Double.parseDouble(input.nextLine());
				sst.setSaldoEuroina(d);
				System.out.println("Anna korkoprosentti: ");
				d = Double.parseDouble(input.nextLine());
				sst.setVuosikorko(d);

				lista.add(sst);
			}
		} while (jatkuu.equalsIgnoreCase("k"));


		for (Object tilit : lista) {                                                        
			if (tilit instanceof Saastotili) {
				Saastotili stili = (Saastotili) tilit;
				stili.tulostaTilinTiedot();
			}
			else if (tilit instanceof SuperSaastoTili) {
				SuperSaastoTili sstili = (SuperSaastoTili) tilit;
				sstili.tulostaTilinTiedot();
			}
		}

		// ----------------------------------------------------------//
		// TOKA TEHTAVA //
		OmaJaYhteisetTilit Ot = new OmaJaYhteisetTilit();
		ArrayList <OmaJaYhteisetTilit> lista2 = new ArrayList<>();
		System.out.println("TOKA TEHTAVA");
		do {
			System.out.println("Haluatko lisätä tilin? k/e ");
			jatkuu = input.nextLine();
			if (jatkuu.equalsIgnoreCase("k")) {
				
				System.out.println("Anna nimi:");
				Ot.omaTili.setOmistaja(input.nextLine());			
				System.out.println("Anna tilinro: ");
				Ot.omaTili.setTilinumero(input.nextLine());			
				System.out.println("Anna tilin saldo: ");
				double d = Double.parseDouble(input.nextLine());
				Ot.omaTili.setSaldoEuroina(d);
				do {
					System.out.println("Anna korkoprosentti: ");
					d = Double.parseDouble(input.nextLine());
					try {
						if (d < 0) {
							throw new ArithmeticException("Luku ei saa olla negatiivinen");
						}
					} catch (ArithmeticException e) {
						System.out.println(e);

					} finally {
						Ot.omaTili.setVuosikorko(d);
					}
						
				} while (d < 0);


				
				
				lista2.add(Ot);
			}
		} while (jatkuu.equalsIgnoreCase("k"));
                                                
		Ot.omaTili.tulostaTilinTiedot();
			 
			
		


		if (input != null) {
			input.close();
		}
	}

}
