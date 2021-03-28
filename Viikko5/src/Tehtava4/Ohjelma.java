package Tehtava4;

import java.util.Scanner;


public class Ohjelma {

	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		BroadcomKaiutin Bkaiutin = new BroadcomKaiutin();
		BroadcomMikrofoni Bmikki =  new BroadcomMikrofoni();
		
		SansungMikrofoni Smikki = new SansungMikrofoni();
		QualcommKaiutin Qkaiutin = new QualcommKaiutin();
		Puhelin puh = new Puhelin();
		
		
		System.out.println("Minkälaista mikrofonia haluat käyttää: ");
		System.out.println("*********************");
		System.out.println("1. Broadcom Mikrofoni");
		System.out.println("2. Samsung Mikrofoni ");
		System.out.println("*********************");
		int mikit = input.nextInt();
		input.nextLine();
		System.out.println("Minkälaista kaiutinta haluat käyttää: ");
		System.out.println("*********************");
		System.out.println("1. Broadcom Kaiutin  ");
		System.out.println("2. Qualcomm Kaiutin  ");
		System.out.println("*********************");
		int kaiut = input.nextInt();
		
		switch (mikit) {
		case 1:
			puh.setMikki(Bmikki);
			break;
		case 2:
			puh.setMikki(Smikki);
		default:
			break;
		}
		switch (kaiut) {
		case 1:
			puh.setKaiutin(Bkaiutin);
			break;
		case 2:
			puh.setKaiutin(Qkaiutin);
		default:
			break;
		}
		System.out.println("Anna kaiuttimen äänenvoimakkuus: ");
		int volat = input.nextInt();
		input.nextLine();
		puh.getKaiutin().setVolume(volat);
		System.out.println("Anna mikin äänenvoimakkuus: ");
		int mvolat = input.nextInt();
		input.nextLine();
		puh.getMikki().setVolume(mvolat);
		if (volat == 0 || mvolat == 0) {
			System.out.println("Äänenvoimakkuus oli : 0");
			System.out.println("HEIPPA!!!!!");
			System.exit(0);
			
		}
		try
		{
			System.out.print("Käynnistetään kajari:");
		    Thread.sleep(2000);
		    puh.getKaiutin().unMute(true);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		try
		{
			System.out.print("Käynnistetään mikki:");
		    Thread.sleep(2000);
		    puh.getMikki().micOn(true);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	
		
	}

}
