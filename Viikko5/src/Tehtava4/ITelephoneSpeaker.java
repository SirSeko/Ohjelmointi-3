package Tehtava4;

public interface ITelephoneSpeaker {
	public boolean mute(boolean mute);
	public boolean unMute(boolean unMute);
	
	public void setVolume(Integer Volume);
	public int getVolume();
}
