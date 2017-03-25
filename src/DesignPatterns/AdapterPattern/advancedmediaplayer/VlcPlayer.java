package DesignPatterns.AdapterPattern.advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName); //$NON-NLS-1$
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}
}