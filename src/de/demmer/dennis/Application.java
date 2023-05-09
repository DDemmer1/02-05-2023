package de.demmer.dennis;


import java.util.ArrayList;
import java.util.Iterator;
//denkt an den import
import java.util.Random;

public class Application {
	
	public static void main(String[] args) {
	
//			int zufallsZahl = new Random().nextInt(101);

		
		Postfach postfach = new Postfach(100);
		
		Iterator<Mail> it = postfach.iterator();
		
	
		for (Mail mail : postfach) {
//			System.out.println("Mail");
		}
		
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();

		
		intList.add(new Random().nextInt(101));
		intList.get(0);
		
		
		intList.size();
		intList.remove(0);
		
		
		Iterator<Integer> iterator = intList.iterator();
		
		iterator.next();
		iterator.hasNext();
		iterator.remove();
		
		
		
		
	}

}
