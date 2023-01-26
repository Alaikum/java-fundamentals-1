package org.lessons.java.food;

public class FavoriteFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//dichiaro 7 elementi
		String[] favoriteFood= {"Tagliata","Lasagna","Cacio e Pepe","Sushi","Pizza","Formaggi","Dolci"};
		System.out.printf("Ne ho %d di cibi preferiti.",favoriteFood.length);
		System.out.println("\nIl mio cibo preferito è: "+favoriteFood[0]);
		System.out.println("Il cibo intemedio è: "+favoriteFood[favoriteFood.length/2]);
		System.out.println("Invece quello meno apprezato è: "+favoriteFood[favoriteFood.length-1]);
	
		
	}

}
