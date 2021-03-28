package Tehtava4;

public class QualcommKaiutin implements ITelephoneSpeaker {
	private Integer Volume;
	
	
	public QualcommKaiutin() {
		
	}
	
	public QualcommKaiutin(Integer Volume) {
		super();
		this.Volume = Volume;
	}

	@Override
	public boolean mute(boolean mute) {
		
		return mute;
	}

	@Override
	public boolean unMute(boolean unmute) {
		if (Volume > 80) {
			mute(true);
			System.out.println("Qualcomm kajarin volat ei voi olla yli 80!");
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
