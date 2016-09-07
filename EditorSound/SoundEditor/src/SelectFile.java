import java.awt.FileDialog;
import java.io.File;

import javax.swing.JFrame;

public class SelectFile {

	public String getFilePath()
	{
		 FileDialog fd = new FileDialog(new JFrame());
		   fd.setVisible(true);
		   File[] f = fd.getFiles();
		   if(f.length > 0){
		       return (fd.getFiles()[0].getAbsolutePath());
		   }
		   else
			   return "Error. Please try again";
	}
}
