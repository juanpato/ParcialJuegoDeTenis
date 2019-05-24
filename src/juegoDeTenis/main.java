package juegoDeTenis;

import java.io.FileNotFoundException;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		Lector nuevo = new Lector();
		Juego Prueba = nuevo.Leer("test.in");
		Prueba.ganador();
		
	}

}
