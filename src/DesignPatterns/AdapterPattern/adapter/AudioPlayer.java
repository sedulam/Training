package DesignPatterns.AdapterPattern.adapter;

import DesignPatterns.AdapterPattern.mediaplayer.MediaAdapter;
import DesignPatterns.AdapterPattern.mediaplayer.MediaPlayer;

class AudioPlayer implements MediaPlayer {

    void play(String audioType, String fileName) {

		// inbuilt support to play mp3 music files
		if (audioType.equalsIgnoreCase("mp3")) { //$NON-NLS-1$
			System.out.println("Playing mp3 file. Name: " + fileName); //$NON-NLS-1$
		}

		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) { //$NON-NLS-1$ //$NON-NLS-2$
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}

		else {
			System.out.println("Invalid media. " + audioType + " format not supported"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
}