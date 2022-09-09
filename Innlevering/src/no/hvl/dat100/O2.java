package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int poengsum = Integer.parseInt(showInputDialog("Hva er din poengsum?"));
			String resultat = "Ugyldig poengsum";

			if (poengsum <= 100 && poengsum >= 90)
				resultat = "A";
			if (poengsum <= 89 && poengsum >= 80)
				resultat = "B";
			if (poengsum <= 79 && poengsum >= 60)
				resultat = "C";
			if (poengsum <= 59 && poengsum >= 50)
				resultat = "D";
			if (poengsum <= 49 && poengsum >= 40)
				resultat = "E";
			if (poengsum <= 39 && poengsum >= 0)
				resultat = "F";
			if ((resultat).equals("Ugyldig poengsum"))
				i = i - 1;
			showMessageDialog(null, "Karakteren din ble " + resultat);
		}
	}
}
