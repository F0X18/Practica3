package com.animales.examen3;

public class Animales implements SeresVivos {

	//atributos
	protected int patas;
	
	//contructor
	public Animales(int patas) {
		this.patas=2;	
		};

	// metodos
	public void comer() {}


	public int getpatas() {
		return patas;
}
	public void setpatas(int patas) {
		this.patas = patas;
	};
}
