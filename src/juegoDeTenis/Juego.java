package juegoDeTenis;

import java.io.IOException;

public class Juego {
	String juegos;
	int n;
	int s;
	int j;
	int d;
	
	public Juego(String juegos,int n,int s,int j,int d) {
		this.juegos=juegos;
		this.n=n;
		this.s=s;
		this.j=j;
		this.d=d;
	}
	public Escritura ganador() throws IOException {
		int contA=0;
		int contB=0;
		int setA=0;
		int setB=0;
		for(int i=0;i<this.n;i++) {
			
			if(juegos.charAt(i)=='A')
				contA++;
			else contB++;
			
			if(Math.abs(contA-contB)>=this.d ) {
				if(contA>=this.j || contB>=this.j) {
					if(contA>contB)	
						setA++;
					else setB++;
					contA=contB=0;	
					
				}
				
			}
		
		}
		Escritura escritura = new Escritura(setA,setB,"test.out");
		
		return escritura;
	}
}
