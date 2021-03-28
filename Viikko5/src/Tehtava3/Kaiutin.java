package Tehtava3;

public class Kaiutin implements ITelephoneSpeaker {

	private Integer Volume;
	
	public Kaiutin() {
		
	}
		
	public Kaiutin(Integer Volume) {
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
			return false;
		}
		else
			mute(false);
			System.out.println("OK!");
			return true;
	}

	@Override
	public void setVolume (Integer Volume) {
		this.Volume = Volume;
		
	}

	@Override
	public int getVolume() {
		return Volume;
	}

}
