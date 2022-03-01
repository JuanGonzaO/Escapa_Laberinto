package com.mycompany.escapelaberinto;

import java.util.Random;
import java.util.Scanner;

public class laberinto {
	/**
	 * Mapa Preterminado 
	 */

	String[][] mapaPredet = {

			{ "#", "#", "#", "#", "#", "#", "#", "#", "S", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",
					"#", "#", "#", "#", "#", "#", "#", "#", "#", },
			{ "S", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ",
					" ", " ", " ", " ", " ", "#", " ", " ", "S", },
			{ "#", "#", "#", "#", "#", "#", " ", " ", "#", "#", "#", " ", "#", "#", "#", " ", "#", " ", " ", "#", "#",
					"#", "#", "#", "#", " ", " ", "#", " ", "#", },
			{ "#", " ", " ", "G", " ", "#", " ", "#", "G", "G", "#", " ", "#", "G", "#", " ", "#", "G", "#", " ", "#",
					" ", " ", " ", "#", "#", " ", " ", " ", "#", },
			{ "#", " ", "#", "#", " ", "#", " ", " ", " ", " ", "#", "G", "#", " ", "#", " ", "#", "#", " ", " ", "#",
					" ", "#", " ", " ", "#", " ", "#", " ", "#", },
			{ "#", "G", "#", " ", " ", "#", " ", "#", "#", "#", "#", "#", "#", " ", "#", " ", " ", " ", "#", " ", "#",
					" ", "#", "#", "#", "#", " ", "#", " ", "#", },
			{ "#", " ", "#", "#", " ", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ",
					" ", "#", " ", " ", " ", " ", "#", "#", "#", },
			{ "#", "#", " ", " ", " ", "#", " ", "#", " ", "#", " ", " ", "#", "#", " ", "#", "#", " ", "#", "#", "#",
					"#", "#", " ", "#", " ", "#", "#", "G", "#", },
			{ "#", " ", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ",
					" ", " ", " ", "#", " ", " ", "#", "G", "#", },
			{ "#", " ", "#", "#", " ", "#", "#", "#", " ", "#", " ", "#", " ", "#", "#", " ", "#", " ", "#", "#", "#",
					" ", "#", "#", "#", "#", "G", "#", " ", "#", },
			{ "#", " ", " ", " ", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", "#", " ", " ", "G", "#",
					" ", " ", "#", " ", "#", " ", "#", " ", "#", },
			{ "#", "#", "#", "G", "#", " ", " ", " ", " ", "#", " ", "#", " ", "#", "#", " ", "#", "#", "#", "#", "#",
					" ", "#", " ", "#", "#", " ", "#", " ", "#", },
			{ "#", " ", " ", "#", " ", " ", "#", "#", "#", " ", " ", "#", " ", "#", " ", " ", " ", " ", " ", " ", " ",
					" ", " ", " ", " ", "#", " ", "#", " ", "#", },
			{ "#", "#", " ", "#", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", "#", " ", "#",
					" ", " ", "#", " ", "#", " ", "#", " ", "#", },
			{ "#", " ", " ", "#", " ", " ", "#", " ", "#", "#", " ", "#", "G", "#", " ", "#", "#", " ", " ", "#", " ",
					" ", "#", " ", " ", "#", " ", "#", " ", "#", },
			{ "#", "#", " ", "#", "#", " ", " ", " ", "G", "#", " ", "#", "#", "#", " ", "#", " ", " ", " ", " ", " ",
					"#", " ", " ", "#", "#", " ", "#", " ", "#", },
			{ "#", " ", " ", "#", " ", " ", "#", " ", "#", "#", " ", " ", "#", " ", " ", "#", " ", "#", "#", "#", "#",
					"#", " ", "#", " ", "#", "G", "#", " ", "#", },
			{ "#", "#", " ", " ", " ", "#", "#", "#", " ", "#", " ", "#", " ", "#", " ", " ", " ", "#", "G", " ", " ",
					" ", " ", " ", " ", " ", "#", "#", " ", "#", },
			{ "#", "G", "#", " ", "#", " ", " ", " ", " ", "#", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#",
					"#", "#", "#", "#", " ", " ", " ", " ", "#", },
			{ "#", "G", "#", " ", " ", " ", "#", "#", " ", " ", " ", " ", " ", "G", " ", " ", " ", "G", " ", " ", " ",
					"G", " ", " ", "#", "#", " ", "#", " ", "#", },
			{ "#", " ", "#", "#", "#", "#", "#", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",
					"#", "#", " ", " ", "#", " ", "#", "#", "#", },
			{ "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
					" ", " ", "#", " ", "#", " ", " ", " ", "S", },
			{ "#", " ", " ", " ", "#", " ", "#", " ", " ", "#", " ", "#", "#", "#", "#", "#", "#", " ", "#", "#", "#",
					" ", " ", " ", " ", "#", " ", "#", "#", "#", },
			{ "#", " ", "#", "#", "#", " ", "#", " ", "#", " ", " ", "#", "G", " ", " ", " ", "#", " ", " ", " ", "#",
					" ", "#", "#", "#", "#", " ", "#", " ", "#", },
			{ "#", " ", "#", " ", " ", " ", "#", " ", "G", "#", " ", "#", "#", "#", "#", " ", "#", "#", "#", " ", "#",
					" ", " ", " ", " ", "#", " ", " ", " ", "#", },
			{ "#", " ", "#", "#", "#", " ", "#", "#", "#", "#", " ", "#", " ", " ", " ", " ", "#", "G", "#", " ", "#",
					"#", "#", " ", "#", "G", "#", "#", " ", "#", },
			{ "#", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", " ", "#", " ", "#", " ", " ",
					" ", " ", " ", "#", " ", "#", " ", " ", "#", },
			{ "#", " ", "#", "#", "#", " ", "#", "#", "#", "#", "#", "#", " ", "#", " ", "#", "#", " ", "#", "#", " ",
					" ", " ", " ", " ", "#", " ", " ", " ", "#", },
			{ "#", " ", " ", " ", " ", " ", "G", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",
					" ", " ", " ", " ", " ", "#", " ", "G", "#", },
			{ "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "S", "#", "#", "#", "#", "#", "#", "#",
					"#", "#", "#", "#", "#", "#", "#", "#", "#", }

	};
	public static Scanner sn = new Scanner(System.in);
	Random random = new Random();
	String[][] matrizmov;
	String[][] newMapa;
	int movf;
	int movc;
	int finposC;
	int finposF;
	int finposbotC;
	int finposbotF;
	int Arriba;
	int Abajo;
	int Izquierda;
	int Derecha;
	int y;
	int x;
	int posicionJugadorF = 0;
	int posicionJugadorC = 0;
	int posicionBotF = 0;
	int posicionBotC = 0;

	public static void main(String[] args) {

		laberinto juego = new laberinto();
		juego.princeMen();
	}

	/**
	 * Muestra opciones para iniciar juego
	 */
	public void princeMen() {

		int opcion = 0;

		while (opcion != 5) {

			System.out.println("1.Jugar");
			System.out.println("2.Crear Mapa");
			System.out.println("3.Reportes");
			System.out.println("4.Visualizar Mapa");
			System.out.println("5.Salir");

			System.out.println("Escribe una de las opciones");
			opcion = opcionEscogida(" ");

			if (opcion == 1) {
				jugar();
			} else if (opcion == 2) {
				mapaPer();
			} else if (opcion == 3) {
				infoJuego();
			} else if (opcion == 4) {
				verMapa();
			} else if (opcion == 5) {

				System.out.println(" ");
			}
		}
	}

	/**
	 * da las opciones para el jugador
	 */
	public void jugar() {
		boolean salir = false;
		int opcion;
		while (!salir) {

			System.out.println("1.Mapa Preterminado");
			System.out.println("2.Mapa Creado");
			System.out.println("3.Atras");
			System.out.println("Elija una opcion");
			opcion = sn.nextInt();

			switch (opcion) {

			case 1: {
				crearMapa();
				menuMover();
				break;

			}
			case 2: {

			}
			case 3: {
				salir = true;

				break;

			}
			}
		}

	}

	/**
	 * da las opciones dentro del mapa
	 */
	public void menuMover() {
		// mosMapa(newMapa);
		// seccionMapa();

		int opcion;
		boolean salir = false;

		while (!salir) {
			System.out.println("Que hara?");

			System.out.println("1.Moverse");
			System.out.println("2.Oro");
			System.out.println("3.Levantar Oro");
			System.out.println("4.Mirar");
			System.out.println("5.Atras");
			opcion = sn.nextInt();

			switch (opcion) {
			case 1:
				direccionMovimiento();
				direccionBot();
				direccionBot();
				break;
			case 2: {
				// cantidad de oro del jugador
				break;
			}
			case 3: {
				// donde halla casillas G levantar la cantidad de oro
				break;
			}
			case 4: {
				seccionMapa();
				//mosMapa(newMapa);
				menuMover();
				break;
			}

			case 5:
				salir = true;
				break;

			}

		}
	}

	/**
	 * personaliza el mapa
	 */
	public void mapaPer() {

		System.out.println("Que desea cambiar?");
		System.out.println("1.# de casillas para salir");
		System.out.println("2.# de oro requerido para salir");
		System.out.println("3.# casillas de oro");
	}

	/**
	 * da las estadisticas globales del jugador
	 */
	public static void infoJuego() {

		System.out.println("Estadisticas");
		System.out.println("Has sido atrapado " + " Veces atrapado por el bot");
		System.out.println("Has ganado" + " Partidas");
		System.out.println("Has encontrado" + "Oro");
		System.out.println("Movientos dados");
		System.out.println("El mapa mas jugado es: ");
		System.out.println("Mapa en donde has perdido mas es: ");
		System.out.println("Numero de mapas creados: ");
	}

	/**
	 * da la opcion de ver el mapa 5*5
	 */
	public void verMapa() {

		int opcion = 0;
		System.out.println("1.Mapa predeterminado");
		System.out.println("2.Mapa creado");
		System.out.println("Que mapa quiere ver?");
		opcion = sn.nextInt();

		if (opcion == 1) {

			mosMapa(mapaPredet);

		}else {
			
		}

	}

	/**
	 * 
	 * @param mapa
	 * 
	 */
	public void mosMapa(String[][] mapa) {
		for (int f = 0; f < 30; f++) {
			for (int c = 0; c < 30; c++) {
				System.out.print(mapa[f][c]);
				System.out.print(" ");

			}

			System.out.println();
		}

	}

	/**
	 * opcion para cuando se pone un numero erroneo
	 * @param mensaje = menciona error por caracter malo
	 * @return numero
	 */
	public static int opcionEscogida(String mensaje) {
		int numero = 0;
		boolean Error = false;
		do {
			System.out.println(mensaje);
			numero = sn.nextInt();
			if (numero < 1 && numero > 5) {
				Error = true;
				System.out.println("ingrese un numero mayor de cero");
			} else {
				Error = false;
			}
		} while (Error);
		return numero;

	}

	/**
	 * 
	 * @param mapa  = imprime en el mapa
	 * @param isBot = da una posicion aleatoria al bot
	 */
	public void ingresarJugador(String[][] mapa, boolean isBot) {
		int posf = random.nextInt(mapa.length);
		int posc = random.nextInt(mapa[0].length);

		while (mapa[posf][posc].equals("#")) {
			posf = random.nextInt(mapa.length);
			posc = random.nextInt(mapa[0].length);
		}

		if (isBot) {
			posicionBotF = posf;
			posicionBotC = posc;
			mapa[posf][posc] = "B";
		} else {
			posicionJugadorF = posf;
			posicionJugadorC = posc;
			mapa[posf][posc] = "J";

		}

	}

	/**
	 * 
	 */
	public void crearMapa() {
		newMapa = new String[30][30];

		for (int i = 0; i < newMapa.length; i++) {
			for (int j = 0; j < newMapa[0].length; j++) {
				newMapa[i][j] = mapaPredet[i][j];
			}
		}

		ingresarJugador(newMapa, true);
		ingresarJugador(newMapa, false);
	}

	/**
	 * 
	 * @param posF    = posicion inicial jugador fila
	 * @param posC    = posicion inicial jugador columna
	 * @param posfinf = posicion final jugador fila
	 * @param posfinc = posicion final jugador columna
	 */
	public void mover(int posF, int posC, int posfinf, int posfinc) {
		String posFin = (newMapa[posfinf][posfinc]);

		if (posFin.equals("#")) {
			System.out.println("No es posible el moviento" + "\n Escoja otra direccion");

		} else {
			String J = newMapa[posF][posC];
			newMapa[posfinf][posfinc] = J;
			newMapa[posF][posC] = " ";
			posicionJugadorC = posfinc;
			posicionJugadorF = posfinf;
			// System.out.println("d: " + posF + " " + posC + "a: " + posicionJugadorF + " "
			// + posicionJugadorC);
		}
		// seccionMapa();
	}

	/***************** Inicio Jugador ****************/
	/**
	 * da las opciones para el movimiento del jugador
	 */
	public void direccionMovimiento() {
		char opcion;
		System.out.println("A donde desea moverse");
		System.out.println("N = arriba");
		System.out.println("O = izquierda");
		System.out.println("S = abajo");
		System.out.println("E = derecha");
		opcion = sn.next().toUpperCase().charAt(0);

		switch (opcion) {

		case 'N':
			Arriba();
			break;

		case 'O':
			Izquierda();
			break;

		case 'S':
			Abajo();
			break;
		case 'E':
			Derecha();
			break;

		}
	}

	/**
	 * 
	 */
	public void Arriba() {
		mover(posicionJugadorF, posicionJugadorC, posicionJugadorF - 1, posicionJugadorC);

	}

	/**
	 * 
	 */
	public void Abajo() {
		mover(posicionJugadorF, posicionJugadorC, posicionJugadorF + 1, posicionJugadorC);

	}

	/**
	 * 
	 */
	public void Izquierda() {
		mover(posicionJugadorF, posicionJugadorC, posicionJugadorF, posicionJugadorC - 1);

	}

	/**
	 * 
	 */
	public void Derecha() {
		mover(posicionJugadorF, posicionJugadorC, posicionJugadorF, posicionJugadorC + 1);

	}

	/**
	 * seccion mapa= muestra 5*5 del mapa original
	 */
	public void seccionMapa() {

		System.out.println("Tu posicion actual es: ");

		System.out.print("|");
		System.out.print(newMapa[posicionJugadorF - 2][posicionJugadorC - 2] + "  ");
		System.out.print(newMapa[posicionJugadorF - 2][posicionJugadorC - 1] + "  ");
		System.out.print(newMapa[posicionJugadorF - 2][posicionJugadorC] + "  ");
		System.out.print(newMapa[posicionJugadorF - 2][posicionJugadorC + 1]);
		System.out.print(newMapa[posicionJugadorF - 2][posicionJugadorC + 2] + "  ");
		System.out.print("|\n");
		System.out.print("|");
		System.out.print(newMapa[posicionJugadorF - 1][posicionJugadorC - 2] + "  ");
		System.out.print(newMapa[posicionJugadorF - 1][posicionJugadorC - 1] + "  ");
		System.out.print(newMapa[posicionJugadorF - 1][posicionJugadorC] + "  ");
		System.out.print(newMapa[posicionJugadorF - 1][posicionJugadorC + 1] + "  ");
		System.out.print(newMapa[posicionJugadorF - 1][posicionJugadorC + 2]);
		System.out.print("|\n");
		System.out.print("|");
		System.out.print(newMapa[posicionJugadorF][posicionJugadorC - 2] + "  ");
		System.out.print(newMapa[posicionJugadorF][posicionJugadorC - 1] + "  ");
		System.out.print(newMapa[posicionJugadorF][posicionJugadorC] + "  ");
		System.out.print(newMapa[posicionJugadorF][posicionJugadorC + 1]);
		System.out.print(newMapa[posicionJugadorF][posicionJugadorC + 2] + "  ");
		System.out.print("|\n");
		System.out.print("|");
		System.out.print(newMapa[posicionJugadorF + 1][posicionJugadorC - 2] + "  ");
		System.out.print(newMapa[posicionJugadorF + 1][posicionJugadorC - 1] + "  ");
		System.out.print(newMapa[posicionJugadorF + 1][posicionJugadorC] + "  ");
		System.out.print(newMapa[posicionJugadorF + 1][posicionJugadorC + 1] + "  ");
		System.out.print(newMapa[posicionJugadorF + 1][posicionJugadorC + 2]);
		System.out.print("|\n");
		System.out.print("|");
		System.out.print(newMapa[posicionJugadorF + 2][posicionJugadorC - 2] + "  ");
		System.out.print(newMapa[posicionJugadorF + 2][posicionJugadorC - 1] + "  ");
		System.out.print(newMapa[posicionJugadorF + 2][posicionJugadorC] + "  ");
		System.out.print(newMapa[posicionJugadorF - 1][posicionJugadorC + 2] + "  ");
		System.out.print(newMapa[posicionJugadorF - 2][posicionJugadorC + 2]);
		System.out.print("|\n");

	}

	/***************** Fin Jugador ****************/

	/***************** Inicio Bot ****************/
	/**
	 * 
	 * @param posbotF    = posicion inicial del bot fila
	 * @param posbotC    = posicion inicial del bot columna
	 * @param posfinbotf = posicion final del bot fila
	 * @param posfinbotc = posicion final del bot columna
	 */
	public void movimientoBot(int posbotF, int posbotC, int posfinbotf, int posfinbotc) {
		String posbotFin = (newMapa[posfinbotf][posfinbotc]);

		if (posbotFin.equals("#")) {

		} else {
			String B = newMapa[posbotF][posbotC];
			newMapa[posfinbotf][posfinbotc] = B;
			newMapa[posbotF][posbotC] = " ";
			posicionBotC = posfinbotc;
			posicionBotF = posfinbotf;
		}

	}

	/**
	 * condiciones de direccion para el movimiento del bot
	 */
	public void direccionBot() {
		int opcion = 0;

		opcion = random.nextInt(4);

		switch (opcion) {

		case 0:
			arriba();
			break;

		case 1:
			izquierda();
			break;

		case 2:
			abajo();
			break;
		case 3:
			derecha();
			break;

		}
	}

	public void arriba() {
		movimientoBot(posicionBotF, posicionBotC, posicionBotF - 1, posicionBotC);
	}

	public void abajo() {
		movimientoBot(posicionBotF, posicionBotC, posicionBotF + 1, posicionBotC);
	}

	public void izquierda() {
		movimientoBot(posicionBotF, posicionBotC, posicionBotF, posicionBotC - 1);
	}

	public void derecha() {
		movimientoBot(posicionBotF, posicionBotC, posicionBotF, posicionBotC + 1);
	}
	/***************** Fin Bot ****************/

}
