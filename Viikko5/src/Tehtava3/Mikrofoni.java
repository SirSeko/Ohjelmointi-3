package Tehtava3;

public class Mikrofoni implements ITelephoneMic {

	public class Puhelin {

	}

	private Integer mVolume;
	
	public Mikrofoni() {
		
	}
		
	public Mikrofoni(Integer mVolume) {
		this.mVolume = mVolume;
	}

	@Override
	public boolean micOn(boolean on) {
		if (mVolume > 100) {
			micOff(true);
			return true;
		}
		else
			micOff(false);
			System.out.println("OK!");
			return true;
	}

	@Override
	public boolean micOff(boolean off) {
		
		return off;
	}

	@Override
	public void setVolume(Integer mVolume) {
		this.mVolume = mVolume;
		
	}

	@Override
	public int getVolume() {
		return mVolume;
	}

}
