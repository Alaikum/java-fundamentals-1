package org.lesson.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String name;
		String lastName;
		String color;
		char tr = '-';
		int day;
		int month;
		int year;

		Scanner s = new Scanner(System.in);

		// inserire il nome
		System.out.print("Inserisci il tuo nome: ");
		name = s.nextLine();
		// inserire il cognome
		System.out.print("Inserisci il tuo cognome: ");
		lastName = s.nextLine();
		// inserire il colore
		System.out.print("Inserisci il tuo colore preferito: ");
		color = s.nextLine();
		// inserire il giorno di nascita
		System.out.print("Inserisci il tuo giorno di nascita(il numero): ");
		day = s.nextInt();
		// inserire il mese di nascita
		System.out.print("Inserisci il tuo mese di nascita(il numero): ");
		month = s.nextInt();
		// inserire anno di nascita
		System.out.print("Inserisci il tuo anno di nascita(completo es 1993): ");
		year = s.nextInt();
		//stampa pass concatenata
		System.out.print("Ecco la tua password super segreta: "+name+tr+lastName+tr+color+tr+(day+month+year));
		
		//chiusura di s	
		s.close();
	}

}
