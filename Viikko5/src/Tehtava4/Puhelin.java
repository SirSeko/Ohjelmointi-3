package Tehtava4;

public class Puhelin {
	
	private ITelephoneMic mikki; // new ITelephoneMic();
	private ITelephoneSpeaker kaiutin; // new ITelephoneSpeaker();
	
	public Puhelin() {
		
	}
	public Puhelin(ITelephoneMic mikki, ITelephoneSpeaker kaiutin) {
		super();
		this.mikki = mikki;
		this.kaiutin = kaiutin;
		//this.setMikki(mikki);
		//this.setKaiutin(kaiutin);
	}

	public ITelephoneMic getMikki() {
		return mikki;
	}

	public void setMikki(ITelephoneMic mikki) {
		this.mikki = mikki;
	}

	public ITelephoneSpeaker getKaiutin() {
		return kaiutin;
	}

	public void setKaiutin(ITelephoneSpeaker kaiutin) {
		this.kaiutin = kaiutin;
	}
	
	
}
