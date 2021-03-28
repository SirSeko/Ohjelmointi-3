package Tehtava3;

public interface ITelephoneSpeaker {
	
	public boolean mute(boolean mute);
	public boolean unMute(boolean unmute);
	
	public void setVolume(Integer Volume);
	public int getVolume();
	
}
