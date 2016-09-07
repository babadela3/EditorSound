
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

	public class Main {
		   public static void main(String[] args) throws IOException {
		        Desktop desktop = Desktop.getDesktop();
		        File dirToOpen = null;
		        try {
		            dirToOpen = new File("c:\\");
		            desktop.open(dirToOpen);
		        } catch (IllegalArgumentException iae) {
		            System.out.println("File Not Found");
		        }
		    }
		}

