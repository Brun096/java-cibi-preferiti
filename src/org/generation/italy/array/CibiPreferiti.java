package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[]args) {
		

		String[] cibi= {"Lasagna", "Salmone","Mela","Tirami�","Hamburger","Risotto allo Zafferano","Filetto di Tonno"};
		int cibiElementi=cibi.length;
		
		//int ciboMezzaClass=cibiElementi/2;
		System.out.println("Ci sono "+cibiElementi+" alimenti nella lista");
		System.out.println("Il mio cibo preferito �: "+cibi[0]);
		System.out.println("Il cibo che non mi piace �: "+cibi[cibiElementi - 1]);
		
		int ciboMed;
		
		if(cibiElementi % 2 == 0) {
			
			ciboMed=cibiElementi/2;
		}else {
			ciboMed=(cibiElementi+1)/2;
		}
		System.out.println("il cibo in mezzo agli elementi �: "+cibi[ciboMed - 1]);
		}
}
