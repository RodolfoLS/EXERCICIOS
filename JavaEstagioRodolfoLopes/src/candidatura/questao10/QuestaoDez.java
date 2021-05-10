package candidatura.questao10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class QuestaoDez {

	public static void main(String[] args) {
		
		Integer numeroBin;
		
		numeroBin = new Integer( 1 + (int) (Math.random()*2147483647));
		String printNumero = numeroBin.toBinaryString(numeroBin);
		
		System.out.println(numeroBin);
		System.out.println(printNumero);
		
		
		
		
	}
		
}
