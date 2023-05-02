package de.demmer.dennis;

import java.util.Iterator;
//denkt an den import
import java.util.Random;

public class Application {
	
	public static void main(String[] args) {
	
//			int zufallsZahl = new Random().nextInt(101);

		
		Postfach postfach = new Postfach(100);
		
		Iterator<Mail> it = postfach.iterator();
		
	
		for (Mail mail : postfach) {
			System.out.println("Mail");
		}
		
			
		
	}

}
