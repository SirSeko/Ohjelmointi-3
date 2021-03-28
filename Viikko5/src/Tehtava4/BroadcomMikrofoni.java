package Tehtava4;

public class BroadcomMikrofoni implements ITelephoneMic {
	
	private Integer mVolume;
	
	public BroadcomMikrofoni() {
		
	}
	
	public BroadcomMikrofoni(Integer mVolume) {
		super();
		this.mVolume = mVolume;
	}
	
	@Override
	public boolean micOn(boolean on) {
		if  (mVolume > 100) {
			micOff(false);
			System.out.println("Broadcom mikin volat ei voi olla yli 100!");
			return false;	
		}
		else
			micOff(true);
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
