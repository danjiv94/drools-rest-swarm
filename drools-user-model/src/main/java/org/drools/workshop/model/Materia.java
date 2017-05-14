package org.drools.workshop.model;
import java.util.Arrays;

public class Materia {

	private String nombre;
	private Desempenio desempenio;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Desempenio getDesempenio() {
		return desempenio;
	}
	public void setDesempenio(Desempenio desempenio) {
		this.desempenio = desempenio;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + "desempenio=" + desempenio +  "]";
	}
	public Materia(String nombre, Desempenio desempenio) {
		super();
		this.nombre = nombre;
		this.desempenio = desempenio;
	}
	public Materia(){

	}

}
