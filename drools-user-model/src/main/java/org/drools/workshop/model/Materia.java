package org.drools.workshop.model;
import java.util.Arrays;

public class Materia {
	
	private String nombre;
	private Desempenio[] desempenios;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	public Desempenio[] getDesempenios() {
		return desempenios;
	}
	public void setDesempenios(Desempenio[] desempenios) {
		this.desempenios = desempenios;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + "desempenios=" + Arrays.toString(desempenios) +  "]";
	}
	public Materia(String nombre) {
		super();
		this.nombre = nombre;
		this.desempenios = desempenios;
	}
	public Materia(){
		
	}
	
}
