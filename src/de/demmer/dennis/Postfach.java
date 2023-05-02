package de.demmer.dennis;

import java.util.Iterator;

public class Postfach implements Iterable<Mail>{
	
	
	private Mail[] mail;
	
	
	public Postfach(int mailBoxSize) {
		
		mail = new Mail[mailBoxSize];
		
	}


	@Override
	public Iterator<Mail> iterator() {
		
		return new Iterator<Mail>() {
			
			int pos = 0;

			@Override
			public boolean hasNext() {
				return pos < mail.length;
			}

			@Override
			public Mail next() {
				Mail returnMail = mail[pos];
				pos++;
				return returnMail;
			}
			
			
			
		};
	}


	
	
	
	
	

}
