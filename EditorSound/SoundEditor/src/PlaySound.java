import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;

public class PlaySound {

		public static synchronized void play(final String path) {
	    	try{
	           // Open an audio input stream.           
	            File soundFile = new File(path); //you could also get the sound file with an URL
	            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
	           // Get a sound clip resource.
	           Clip clip = AudioSystem.getClip();
	           // Open audio clip and load samples from the audio input stream.
	           clip.open(audioIn);
	           clip.start();
	    	} catch (UnsupportedAudioFileException e) {
	           e.printStackTrace();
	        } catch (IOException e) {
	           e.printStackTrace();
	        } catch (LineUnavailableException e) {
	           e.printStackTrace();
	        }
		}
}
