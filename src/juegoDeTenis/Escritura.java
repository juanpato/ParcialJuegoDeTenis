package juegoDeTenis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Escritura {
	
	int jugadorA;
	int jugadorB;
	
	public Escritura(int jugadorA,int jugadorB,String path) throws IOException {		
		PrintWriter salida = new PrintWriter(new FileWriter(path));	
		this.jugadorA=jugadorA;
		this.jugadorB=jugadorB;
		salida.print(jugadorA + " " + jugadorB);
	
		salida.close();
	}
}
