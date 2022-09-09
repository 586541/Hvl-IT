package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	public static void main(String[] args) {

		int n = Integer.parseInt(showInputDialog("Skriv tallet n her: "));
		int temp = 1;

		while (n > 1) {
			temp *= n;
			n--;

		}
		System.out.println(temp + "!");
	}
}
