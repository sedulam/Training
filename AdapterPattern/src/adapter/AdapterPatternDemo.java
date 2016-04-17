package adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3"); //$NON-NLS-1$ //$NON-NLS-2$
		audioPlayer.play("mp4", "alone.mp4"); //$NON-NLS-1$ //$NON-NLS-2$
		audioPlayer.play("vlc", "far far away.vlc"); //$NON-NLS-1$ //$NON-NLS-2$
		audioPlayer.play("avi", "mind me.avi"); //$NON-NLS-1$ //$NON-NLS-2$
	}
}