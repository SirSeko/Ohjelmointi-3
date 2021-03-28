package Tehtava3;

public class ohjelma {

	public static void main(String[] args) {
		
		
		Kaiutin k = new Kaiutin();
		Mikrofoni m = new Mikrofoni();
		k.setVolume(5);
		m.setVolume(8);
		k.unMute(true);
		
		System.out.println("Mikrofonin voimmakkuus:" + m.getVolume());
		System.out.println("Kaiuttimen voimakkuus:" + k.getVolume());
		System.out.println("Onko Kaiutin p‰‰ll‰:" + k.unMute(true));
		System.out.println("Onko Mikrofoni p‰‰ll‰:" + m.micOn(true));
	}

}
