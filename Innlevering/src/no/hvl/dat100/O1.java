package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {
	public static void main(String[] args) {

		final double trinn1 = 164101;
		final double trinn2 = 230951;
		final double trinn3 = 580651;
		final double trinn4 = 934051;

		final double skatt0 = 0;
		final double skatt1 = 0.93 / 100;
		final double skatt2 = 2.41 / 100;
		final double skatt3 = 11.52 / 100;
		final double skatt4 = 14.52 / 100;

		double sum = 0;

		for (int i = 0; i == 0; i++) {
			int inntekt = Integer.parseInt(showInputDialog("Skriv inn bruttoinntekten din"));

			if (inntekt < trinn1)
				sum = inntekt * skatt0;
			else if (inntekt >= trinn1 && inntekt < trinn2)
				sum = inntekt * skatt1;
			else if (inntekt >= trinn2 && inntekt < trinn3)
				sum = inntekt * skatt2;
			else if (inntekt >= trinn3 && inntekt < trinn4)
				sum = inntekt * skatt3;
			else if (inntekt >= trinn4)
				sum = inntekt * skatt4;
			showMessageDialog(null, "Din trinnskatt er: " + sum);
		}
	}
}