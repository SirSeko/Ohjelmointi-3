package Tehtava4;

public class SansungMikrofoni implements ITelephoneMic {
	
	private Integer mVolume;
	
	public SansungMikrofoni(){
		
	}

	
	public SansungMikrofoni(Integer mVolume) {
		super();
		this.mVolume = mVolume;
	}

	@Override
	public boolean micOn(boolean on) {
		if (mVolume > 60) {
			micOff(true);
			System.out.println("Samsung mikin volat ei voi olla yli 60!");
			return false;
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
