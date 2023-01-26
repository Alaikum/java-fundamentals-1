package org.lesson.java.train;

import java.util.Scanner;

public class TrainTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float distance;
		int age;
		double discount = 0;
		double priceKm = 0.21;
		double totalPrice;
		Scanner s = new Scanner(System.in);

		// distanza in km come float
		System.out.print("Quanta distanza devi percorrere?\nEsprimi il valore in Km: ");
		distance = s.nextFloat();

		// età int
		System.out.print("Quanti anni hai? ");
		age = s.nextInt();

		// chiudo scanner
		s.close();

		// controllo l'età per lo sconto
		if (age < 18) {
			discount = 0.2;
		} else if (age > 65) {
			discount = 0.4;
		}

		// calcolo il prezzo
		totalPrice = distance * priceKm * (1 - discount);

		// stampa a video il risultato
		System.out.printf("Saluti,un biglietto per %.2f km, data la sua età di: %d anni le costerà %.2f €.", distance,
				age, totalPrice);
		if (discount != 0) {
			System.out.printf("\nHai diritto ad uno sconto del %.0f%%.", discount * 100);
		} else {
			System.out.println("\nNon hai diritto a nessuno sconto!");
		}

	}

}
