package com.animales.examen3;
import java.util.Scanner;

public class Gestores {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
				+ "1. Añadir gestor\r\n"
				+ "2. Modificar gestor\r\n"
				+ "3. Eliminar gestor\r\n"
				+ "4. Ver gestor\r\n"
				+ "5. Ver gestores\r\n"
				+ "6. Salir\r\n");
		while (numero !=6) {
			System.out.println("Introduzca un n�mero: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				System.out.println("1--> Añadir gestor");
				Gestores.añadirGestores1();
			} else if (numero == 2) {
				System.out.println("2--> Modificar gestor");
				Gestores.modificargestor2();
			} else if (numero == 3) {
				System.out.println("3--> Eliminar gestor");
				Gestores.eliminargestor3();
			} else if (numero == 4) {
				System.out.println("4--> Ver gestor");
				Gestores.vergestor4();
			} else if (numero == 5) {
				System.out.println("5--> Ver gestores");
				Gestores.vergetores5();
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();
	}
	public static void añadirGestores1() {
		System.out.println("1--> Añadir gestor\n");
	}
	private static void modificargestor2() {
		System.out.println("2--> Modificar gestor");
	}
	private static void eliminargestor3() {
		System.out.println("3--> Eliminar gestor");
	}
	private static void vergestor4() {
		System.out.println("4--> Ver gestor");
	}
	private static void vergetores5() {
		Object gestores[] = {"pepa,pepe,dario"};
		for(int i=0; i<gestores.length; i++) {
			System.out.println(gestores[i]);
		}
		System.out.println("5--> Ver gestores");
}
}