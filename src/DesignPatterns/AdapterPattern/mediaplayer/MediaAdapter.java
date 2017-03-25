package DesignPatterns.AdapterPattern.mediaplayer;

import DesignPatterns.AdapterPattern.advancedmediaplayer.AdvancedMediaPlayer;
import DesignPatterns.AdapterPattern.advancedmediaplayer.Mp4Player;
import DesignPatterns.AdapterPattern.advancedmediaplayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {

		if (audioType.equalsIgnoreCase("vlc")) { //$NON-NLS-1$
			this.advancedMusicPlayer = new VlcPlayer();

		} else if (audioType.equalsIgnoreCase("mp4")) { //$NON-NLS-1$
			this.advancedMusicPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("vlc")) { //$NON-NLS-1$
			this.advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) { //$NON-NLS-1$
			this.advancedMusicPlayer.playMp4(fileName);
		}
	}
}