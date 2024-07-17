package de.it.ahmad.fragen_antworten;

public class FrageUndAntworten
{
	private String[][] frageAntworten;
	private final int anzahlFragen;

	public FrageUndAntworten()
	{
		anzahlFragen = 100;
		frageAntworten = new String[anzahlFragen][6];

		// Erstelle Fragen und Antworten
		frageAntworten[0] = new String[]
		{ "Was ist das Ergebnis von 7 * 8?", "54", "56", "58", "60", "56" };
		frageAntworten[1] = new String[]
		{ "Wie lautet die Lösung der Gleichung 2x + 3 = 11?", "2", "3", "4", "5", "4" };
		frageAntworten[2] = new String[]
		{ "Welches der folgenden ist eine Primzahl?", "9", "15", "17", "21", "17" };
		frageAntworten[3] = new String[]
		{ "Gegeben sei 5x + 3 = 12. Welchen Wert hat x?", "x = 3", "x = 15", "x = 5", "x = 1", "x = 1" };
		frageAntworten[4] = new String[]
		{ "Was ist das Ergebnis von 9 + 10?", "17", "18", "19", "20", "19" };
		frageAntworten[5] = new String[]
		{ "Was ist das Quadrat von 5?", "20", "25", "30", "35", "25" };
		frageAntworten[6] = new String[]
		{ "Wie lautet die Fläche eines Rechtecks mit Seitenlängen 4 und 5?", "10", "15", "20", "25", "20" };
		frageAntworten[7] = new String[]
		{ "Was ist der Umfang eines Kreises mit Radius 3? (π ≈ 3,14)", "6π", "9π", "12π", "15π", "6π" };
		frageAntworten[8] = new String[]
		{ "Was ist die Wurzel aus 64?", "6", "7", "8", "9", "8" };
		frageAntworten[9] = new String[]
		{ "Wie viele Sekunden hat eine Stunde?", "3600", "2400", "1800", "7200", "3600" };

		frageAntworten[10] = new String[]
		{ "Was ist das Volumen eines Würfels mit Seitenlänge 3?", "27", "18", "36", "9", "27" };
		frageAntworten[11] = new String[]
		{ "Was ist die Ableitung von x^2?", "x", "2x", "3x", "4x", "2x" };
		frageAntworten[12] = new String[]
		{ "Was ist der Tangens von 45 Grad?", "0", "1", "√2", "√3", "1" };
		frageAntworten[13] = new String[]
		{ "Was ist der Sinus von 30 Grad?", "0,5", "√3/2", "1", "√2/2", "0,5" };
		frageAntworten[14] = new String[]
		{ "Was ist der Kosinus von 60 Grad?", "0,5", "√3/2", "1", "√2/2", "0,5" };
		frageAntworten[15] = new String[]
		{ "Was ist die Wahrscheinlichkeit, bei einem Münzwurf Kopf zu bekommen?", "1/4", "1/3", "1/2", "1", "1/2" };
		frageAntworten[16] = new String[]
		{ "Was ist die Summe der Winkel in einem Dreieck?", "180 Grad", "360 Grad", "90 Grad", "270 Grad", "180 Grad" };
		frageAntworten[17] = new String[]
		{ "Was ist der größte gemeinsame Teiler von 24 und 36?", "6", "8", "12", "18", "12" };
		frageAntworten[18] = new String[]
		{ "Was ist die kleinste positive Primzahl?", "1", "2", "3", "5", "2" };
		frageAntworten[19] = new String[]
		{ "Was ist die Summe der ersten 10 natürlichen Zahlen?", "45", "50", "55", "60", "55" };

		frageAntworten[20] = new String[]
		{ "Was ist die Basis des natürlichen Logarithmus?", "2", "10", "e", "π", "e" };
		frageAntworten[21] = new String[]
		{ "Was ist die Wahrscheinlichkeit, eine 6 bei einem Würfelwurf zu bekommen?", "1/3", "1/4", "1/5", "1/6",
				"1/6" };
		frageAntworten[22] = new String[]
		{ "Was ist die Hälfte von 0,8?", "0,2", "0,3", "0,4", "0,5", "0,4" };
		frageAntworten[23] = new String[]
		{ "Was ist der Wert von π auf zwei Dezimalstellen genau?", "3,12", "3,13", "3,14", "3,15", "3,14" };
		frageAntworten[24] = new String[]
		{ "Was ist der natürliche Logarithmus von 1?", "0", "1", "e", "π", "0" };
		frageAntworten[25] = new String[]
		{ "Was ist der Tangens von 0 Grad?", "0", "1", "-1", "∞", "0" };
		frageAntworten[26] = new String[]
		{ "Was ist das Inverse von 3?", "1/2", "1/3", "1/4", "1/5", "1/3" };
		frageAntworten[27] = new String[]
		{ "Was ist das Ergebnis von 15 mod 4?", "1", "2", "3", "4", "3" };
		frageAntworten[28] = new String[]
		{ "Was ist die Summe der Innenwinkel eines Vierecks?", "180 Grad", "270 Grad", "360 Grad", "450 Grad",
				"360 Grad" };
		frageAntworten[29] = new String[]
		{ "Was ist das Ergebnis von 2^3?", "4", "6", "8", "10", "8" };

		frageAntworten[30] = new String[]
		{ "Was ist die Fläche eines Kreises mit Radius 2? (π ≈ 3,14)", "4π", "6π", "8π", "10π", "4π" };
		frageAntworten[31] = new String[]
		{ "Was ist der Unterschied zwischen 100 und 47?", "43", "52", "53", "57", "53" };
		frageAntworten[32] = new String[]
		{ "Wie viele Ecken hat ein Würfel?", "4", "6", "8", "12", "8" };
		frageAntworten[33] = new String[]
		{ "Was ist die Primfaktorzerlegung von 28?", "2^2 * 7", "2^3 * 3", "3 * 7", "2 * 14", "2^2 * 7" };
		frageAntworten[34] = new String[]
		{ "Was ist das Ergebnis von 11 * 11?", "111", "120", "121", "130", "121" };
		frageAntworten[35] = new String[]
		{ "Was ist der Sinus von 90 Grad?", "0", "0,5", "1", "√2/2", "1" };
		frageAntworten[36] = new String[]
		{ "Was ist das arithmetische Mittel von 3, 5 und 7?", "4", "5", "6", "7", "5" };
		frageAntworten[37] = new String[]
		{ "Wie viele Millimeter sind ein Meter?", "10", "100", "1000", "10000", "1000" };
		frageAntworten[38] = new String[]
		{ "Was ist die Binärdarstellung von 5?", "100", "101", "110", "111", "101" };
		frageAntworten[39] = new String[]
		{ "Was ist die Wahrscheinlichkeit, bei einem Kartenspiel ein Ass zu ziehen?", "1/13", "1/26", "1/52", "1/4",
				"1/13" };

		frageAntworten[40] = new String[]
		{ "Was ist das Ergebnis von 5!", "24", "60", "120", "240", "120" };
		frageAntworten[41] = new String[]
		{ "Was ist der Wert von √49?", "6", "7", "8", "9", "7" };
		frageAntworten[42] = new String[]
		{ "Was ist die Ableitung von e^x?", "e", "e^x", "x", "1", "e^x" };
		frageAntworten[43] = new String[]
		{ "Was ist die dritte Wurzel von 27?", "2", "3", "4", "5", "3" };
		frageAntworten[44] = new String[]
		{ "Was ist der Logarithmus von 100 zur Basis 10?", "1", "2", "3", "4", "2" };
		frageAntworten[45] = new String[]
		{ "Was ist der Betrag von -5?", "5", "-5", "0", "1", "5" };
		frageAntworten[46] = new String[]
		{ "Was ist das Ergebnis von 0,1 + 0,2?", "0,2", "0,3", "0,4", "0,5", "0,3" };
		frageAntworten[47] = new String[]
		{ "Was ist das Ergebnis von 12 / 4?", "2", "3", "4", "5", "3" };
		frageAntworten[48] = new String[]
		{ "Was ist der Mittelwert von 2, 4 und 8?", "4", "5", "6", "7", "4" };
		frageAntworten[49] = new String[]
		{ "Wie viele Kanten hat ein Tetraeder?", "4", "6", "8", "12", "6" };

		frageAntworten[50] = new String[]
		{ "Was ist das Volumen eines Zylinders mit Radius 3 und Höhe 5? (π ≈ 3,14)", "45π", "60π", "90π", "120π",
				"45π" };
		frageAntworten[51] = new String[]
		{ "Was ist die Fläche eines Dreiecks mit Basis 6 und Höhe 4?", "6", "8", "12", "24", "12" };
		frageAntworten[52] = new String[]
		{ "Was ist die Summe der ersten 5 ungeraden Zahlen?", "15", "20", "25", "30", "25" };
		frageAntworten[53] = new String[]
		{ "Was ist der Wert von log_2(8)?", "1", "2", "3", "4", "3" };
		frageAntworten[54] = new String[]
		{ "Was ist der Tangens von 30 Grad?", "1/2", "√3/3", "√3", "1", "√3/3" };
		frageAntworten[55] = new String[]
		{ "Was ist die Summe der Winkel in einem Fünfeck?", "180 Grad", "360 Grad", "540 Grad", "720 Grad",
				"540 Grad" };
		frageAntworten[56] = new String[]
		{ "Was ist der Wert von 2^10?", "512", "1024", "2048", "4096", "1024" };
		frageAntworten[57] = new String[]
		{ "Was ist das Produkt von 7 und 6?", "40", "42", "44", "46", "42" };
		frageAntworten[58] = new String[]
		{ "Was ist der Kehrwert von 4?", "1/2", "1/3", "1/4", "1/5", "1/4" };
		frageAntworten[59] = new String[]
		{ "Was ist das Ergebnis von 18 - 9?", "7", "8", "9", "10", "9" };

		frageAntworten[60] = new String[]
		{ "Was ist der Flächeninhalt eines Quadrats mit Seitenlänge 4?", "8", "12", "16", "20", "16" };
		frageAntworten[61] = new String[]
		{ "Was ist der Unterschied zwischen 56 und 28?", "26", "28", "30", "32", "28" };
		frageAntworten[62] = new String[]
		{ "Was ist die Primfaktorzerlegung von 45?", "3^2 * 5", "3 * 5^2", "5 * 9", "15 * 3", "3^2 * 5" };
		frageAntworten[63] = new String[]
		{ "Was ist das Ergebnis von 12 * 12?", "120", "124", "144", "148", "144" };
		frageAntworten[64] = new String[]
		{ "Was ist der Sinus von 0 Grad?", "0", "0,5", "1", "√2/2", "0" };
		frageAntworten[65] = new String[]
		{ "Was ist das arithmetische Mittel von 4, 6 und 8?", "4", "6", "8", "10", "6" };
		frageAntworten[66] = new String[]
		{ "Wie viele Zentimeter sind ein Meter?", "10", "100", "1000", "10000", "100" };
		frageAntworten[67] = new String[]
		{ "Was ist die Binärdarstellung von 10?", "1000", "1001", "1010", "1011", "1010" };
		frageAntworten[68] = new String[]
		{ "Was ist die Wahrscheinlichkeit, bei einem Kartenspiel ein Herz zu ziehen?", "1/2", "1/4", "1/3", "1/52",
				"1/4" };
		frageAntworten[69] = new String[]
		{ "Was ist das Ergebnis von 6!", "120", "480", "720", "840", "720" };

		frageAntworten[70] = new String[]
		{ "Was ist der Wert von √81?", "7", "8", "9", "10", "9" };
		frageAntworten[71] = new String[]
		{ "Was ist die Ableitung von x^3?", "2x", "3x", "3x^2", "4x", "3x^2" };
		frageAntworten[72] = new String[]
		{ "Was ist die dritte Wurzel von 64?", "2", "3", "4", "5", "4" };
		frageAntworten[73] = new String[]
		{ "Was ist der Logarithmus von 1000 zur Basis 10?", "1", "2", "3", "4", "3" };
		frageAntworten[74] = new String[]
		{ "Was ist der Betrag von -10?", "5", "10", "-10", "0", "10" };
		frageAntworten[75] = new String[]
		{ "Was ist das Ergebnis von 0,5 + 0,25?", "0,6", "0,65", "0,75", "0,8", "0,75" };
		frageAntworten[76] = new String[]
		{ "Was ist das Ergebnis von 20 / 4?", "4", "5", "6", "7", "5" };
		frageAntworten[77] = new String[]
		{ "Was ist der Mittelwert von 3, 6 und 9?", "4", "5", "6", "7", "6" };
		frageAntworten[78] = new String[]
		{ "Wie viele Flächen hat ein Würfel?", "4", "5", "6", "7", "6" };
		frageAntworten[79] = new String[]
		{ "Was ist die Wahrscheinlichkeit, bei einem Kartenspiel einen König zu ziehen?", "1/13", "1/26", "1/52", "1/4",
				"1/13" };

		frageAntworten[80] = new String[]
		{ "Was ist das Volumen eines Würfels mit Seitenlänge 4?", "16", "32", "64", "128", "64" };
		frageAntworten[81] = new String[]
		{ "Was ist die Fläche eines Kreises mit Radius 5? (π ≈ 3,14)", "25π", "50π", "75π", "100π", "25π" };
		frageAntworten[82] = new String[]
		{ "Was ist die Summe der ersten 4 geraden Zahlen?", "10", "14", "18", "20", "20" };
		frageAntworten[83] = new String[]
		{ "Was ist der Wert von log_2(16)?", "2", "3", "4", "5", "4" };
		frageAntworten[84] = new String[]
		{ "Was ist der Tangens von 60 Grad?", "1/2", "√3", "1", "2", "√3" };
		frageAntworten[85] = new String[]
		{ "Was ist die Summe der Winkel in einem Sechseck?", "180 Grad", "360 Grad", "540 Grad", "720 Grad",
				"720 Grad" };
		frageAntworten[86] = new String[]
		{ "Was ist der Wert von 2^8?", "128", "256", "512", "1024", "256" };
		frageAntworten[87] = new String[]
		{ "Was ist das Produkt von 8 und 7?", "50", "54", "56", "60", "56" };
		frageAntworten[88] = new String[]
		{ "Was ist der Kehrwert von 5?", "1/4", "1/5", "1/6", "1/7", "1/5" };
		frageAntworten[89] = new String[]
		{ "Was ist das Ergebnis von 20 - 7?", "12", "13", "14", "15", "13" };

		frageAntworten[90] = new String[]
		{ "Was ist der Flächeninhalt eines Quadrats mit Seitenlänge 5?", "20", "25", "30", "35", "25" };
		frageAntworten[91] = new String[]
		{ "Was ist der Unterschied zwischen 63 und 27?", "35", "36", "37", "38", "36" };
		frageAntworten[92] = new String[]
		{ "Was ist die Primfaktorzerlegung von 60?", "2^2 * 3 * 5", "2 * 3 * 5^2", "2^3 * 3", "3 * 5 * 4",
				"2^2 * 3 * 5" };
		frageAntworten[93] = new String[]
		{ "Was ist das Ergebnis von 14 * 14?", "180", "194", "196", "200", "196" };
		frageAntworten[94] = new String[]
		{ "Was ist der Sinus von 45 Grad?", "0,5", "√2/2", "1", "√3/2", "√2/2" };
		frageAntworten[95] = new String[]
		{ "Was ist das arithmetische Mittel von 5, 10 und 15?", "8", "10", "12", "15", "10" };
		frageAntworten[96] = new String[]
		{ "Wie viele Dezimeter sind ein Meter?", "1", "10", "100", "1000", "10" };
		frageAntworten[97] = new String[]
		{ "Was ist die Binärdarstellung von 20?", "10010", "10011", "10100", "10101", "10100" };
		frageAntworten[98] = new String[]
		{ "Was ist die Wahrscheinlichkeit, bei einem Kartenspiel ein Pik zu ziehen?", "1/2", "1/4", "1/3", "1/52",
				"1/4" };
		frageAntworten[99] = new String[]
		{ "Was ist das Ergebnis von 7!", "2400", "3600", "5040", "7200", "5040" };
	}

	/**
	 * Liefert die Frage an dem entsprechenden index.
	 * 
	 * @param index
	 * @return
	 */
	public String[] getFrageUndAntworten(int index)
	{
		return frageAntworten[index];
	}

	public int getAnzahlFragen()
	{
		return anzahlFragen;
	}
}