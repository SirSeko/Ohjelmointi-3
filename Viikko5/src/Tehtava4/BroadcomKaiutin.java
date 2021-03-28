package Tehtava4;

public class BroadcomKaiutin implements ITelephoneSpeaker {
	
	private Integer Volume;
	
	public BroadcomKaiutin() {
		
	}
	
	public BroadcomKaiutin(Integer Volume) {
		super();
		this.Volume = Volume;
	}

	@Override
	public boolean mute(boolean mute) {
		
		return mute;
	}

	@Override
	public boolean unMute(boolean unmute) {
		if (Volume > 100) {
			mute(true);
			System.out.println("Broadcom kajarin volat ei voi olla yli 100!");
			return false;
		}
		else
			mute(false);
			System.out.println("OK!");
			return true;
	}

	@Override
	public void setVolume(Integer Volume) {
		this.Volume = Volume;
		
	}

	@Override
	public int getVolume() {
		
		return Volume;
	}

}
