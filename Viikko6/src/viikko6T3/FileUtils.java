package viikko6T3;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;





public class FileUtils {
	
	
	public static void WriteToFile (String tiedostonimi, String syote) {
		String filepath = "C:\\temp\\" +tiedostonimi+ ".txt";
		 Thread uusin = new Thread(){
			 @Override
	     	public void run(){
				 FileWriter write = null;
				 BufferedWriter bw = null;
				 
				 try {
					write = new FileWriter(filepath, false);
					bw = new BufferedWriter(write);
					bw.write(syote);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						bw.close();
						write.close();
						
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					
				}
	     	}
	     };
		uusin.start();
		
		
	}
	
	public static String ReadFromFile (String tiedostonimi) throws IOException {
		String filepath = "C:\\temp\\" +tiedostonimi+ ".txt";
		Path path = Paths.get(filepath);
		String luettuTeksti = new String(Files.readAllBytes(path));
		return luettuTeksti; 
	}
}
