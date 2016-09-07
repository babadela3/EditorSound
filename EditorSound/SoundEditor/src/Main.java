
import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

    
	public class Main {
		   private static String path;
		   public static void main(String[] args) throws IOException {
			   	SelectFile selectFile = new SelectFile() ;
			   	path = selectFile.getFilePath();
			   	PlaySound.play(path); // works
		    }
		    
	}

