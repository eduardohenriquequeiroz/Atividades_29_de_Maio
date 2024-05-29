package vetoresEarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Soma_ArrayList {

	public static void main(String[] args) {
		int soma = 0;
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(10);
		numeros.add(10);
		numeros.add(10);
		numeros.add(10);

		for (int i  : numeros) {
			soma += i;
		}
	
		
			System.out.println("A soma é: " + soma);
		
	}
}