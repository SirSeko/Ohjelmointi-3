package Tehtava3;

public interface ITelephoneMic {

	public boolean micOn(boolean on);
	public boolean micOff(boolean off);
	
	public void setVolume(Integer mVolume);
	public int getVolume();
}
