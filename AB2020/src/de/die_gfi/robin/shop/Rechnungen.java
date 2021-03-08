package de.die_gfi.robin.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rechnungen {
	
	
	
	
	public static void rechnungHinzufuegen(Purchase rechnung , Customer kunde) {
		
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	        
			
			String path = "C:\\Users\\Nutzer\\git\\ab2020\\ab2020\\AB2020\\bin\\de\\die_gfi\\robin\\shop\\" + kunde.nachname + "_" + dtf.format(LocalDateTime.now()) + ".txt";
			
			
			FileWriter writer = new FileWriter(path);
			
			writer.write(rechnung.toString() + "\n\n");
			
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}