package com.animales.examen3;

public class MainExamen3 {

	public static void main(String[] args) {
		Animales Colibri= new Animales(2);
		Animales Delfin= new Animales(0);
		Animales Leopardo= new Animales(4);
		
		System.out.println(Colibri.getpatas());
		Delfin.setpatas(0);
		System.out.println(Delfin.getpatas());
		Leopardo.setpatas(4);
		System.out.println(Leopardo.getpatas());
		
	}

}
