package adapter;

import mediaplayer.MediaAdapter;
import mediaplayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

		// inbuilt support to play mp3 music files
		if (audioType.equalsIgnoreCase("mp3")) { //$NON-NLS-1$
			System.out.println("Playing mp3 file. Name: " + fileName); //$NON-NLS-1$
		}

		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) { //$NON-NLS-1$ //$NON-NLS-2$
			this.mediaAdapter = new MediaAdapter(audioType);
			this.mediaAdapter.play(audioType, fileName);
		}

		else {
			System.out.println("Invalid media. " + audioType + " format not supported"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
}