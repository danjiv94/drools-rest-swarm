package org.drools.workshop.model;
import java.util.Arrays;

public class Materia {
	
	private String nombre;
	private Desempenio[] desempenios;
	private Examen[] examenes;
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
	public Examen[] getExamenes() {
		return examenes;
	}
	public void setExamenes(Examen[] examenes) {
		this.examenes = examenes;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", desempenios=" + Arrays.toString(desempenios) + ", examenes="
				+ Arrays.toString(examenes) + "]";
	}
	public Materia(String nombre, Desempenio[] desempenios, Examen[] examenes) {
		super();
		this.nombre = nombre;
		this.desempenios = desempenios;
		this.examenes = examenes;
	}
	public Materia(){
		
	}
	
}
