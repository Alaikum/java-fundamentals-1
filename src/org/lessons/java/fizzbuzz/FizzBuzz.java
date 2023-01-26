package org.lessons.java.fizzbuzz;

import java.util.Iterator;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// per comodità faccio partire i da 1
		for (int i = 1; i <= 100; i++) {
			//lo spazio in print è solo estetico
			String print = String.valueOf(i)+" ";
			
			//controllo i multipli
			if (i % 3 == 0 && i % 5 == 0) {
				print = "FizzBuzz\n";
			}else if(i%3==0) {
				print = "Fizz ";
			}else if(i%5==0) {
				print = "Buzz ";
			}
		
			System.out.print(print);
		}
	}

}
