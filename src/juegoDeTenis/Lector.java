package juegoDeTenis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Lector {
	String juegos;
	int n;
	int s;
	int j;
	int d;
	
	public Juego Leer(String path) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner es = new Scanner(new File("test.in"));
		es.useLocale(Locale.ENGLISH);
		n = es.nextInt();
		s = es.nextInt();
		j = es.nextInt();
		d = es.nextInt();
		juegos = es.next();		
		Juego nuevo = new Juego(juegos,n,s,j,d);
		es.close();
		return nuevo;
	}

}
