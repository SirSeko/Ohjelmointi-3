package viikko6T3;

import java.io.IOException;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		String tnimi;
		String syote;
		String luettuTeksti;
		Scanner input = new Scanner (System.in);
		FileUtils fu = new FileUtils();
		
		System.out.println("Anna tiedoston nimi: ");
		tnimi = input.nextLine();
		System.out.println("Mitäs kirjotetaan?: ");
		syote = input.nextLine();
		fu.WriteToFile(tnimi, syote);
		
		
		Thread odotus = new Thread(){
			 @Override
	     	public void run(){
			
		try {
			System.out.println(fu.ReadFromFile(tnimi));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			 }
		};
		System.out.println("Odotetaan 4 sekuntia");
		odotus.sleep(4000);
		
		odotus.start();
		
	
		
		

	}

}
