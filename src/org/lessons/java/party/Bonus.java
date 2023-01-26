package org.lessons.java.party;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] invited = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };

		Scanner s = new Scanner(System.in);

		System.out.print("Ciclo While\nMi dica il suo nome e cognome e vediamo se è in lista\nLei è : ");

		String guest = s.nextLine().toLowerCase().trim(); // evito errori di battitura tipo spazi o maiuscole

		s.close();

		int i = 0;
		while (i < invited.length) {

			if (guest.equals(invited[i].toLowerCase().trim())) {
				System.out.printf("Lei è in lista: %s, prego può entrare.", invited[i]);
				break;
			}
			
			if (i == invited.length - 1)
				System.out.printf("%s non sei stato invitato, torna a casa tua!", guest.toUpperCase());

			i++;
		}
//		
	}

}
