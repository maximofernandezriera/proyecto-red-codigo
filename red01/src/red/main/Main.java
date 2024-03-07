package red.main;

import red.dominio.Aparato;

public class Main {

	public static void main(String[] args) {
		
		Aparato tele = new Aparato();

		tele.apagar();

		System.out.println("¿la televisión está encendida?  " + tele.getEncendido());
	}

}
