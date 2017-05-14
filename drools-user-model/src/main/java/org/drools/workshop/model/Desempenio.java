package org.drools.workshop.model;
import java.util.Arrays;

public class Desempenio {

	private String tema;
	private EjercicioEnClase ejercicioEnClase;
	private Tarea tareas;
	private Examen examen;
	public Desempenio(){

	}

	public Desempenio(String tema, EjercicioEnClase ejercicioEnClase, Tarea tareas, Examen examen) {
		super();
		this.tema = tema;
		this.ejercicioEnClase = ejercicioEnClase;
		this.tareas = tareas;
		this.examen = examen;
	}
	@Override
	public String toString() {
		return "Desempenio [tema=" + tema + ", ejercicios=" + ejercicioEnClase + ", tareas="
				+ tareas + ", examenes=" + examen + "]";
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public EjercicioEnClase getEjercicioEnClase() {
		return ejercicioEnClase;
	}
	public void setEjercicioEnClase(EjercicioEnClase ejercicioEnClase) {
		this.ejercicioEnClase = ejercicioEnClase;
	}
	public Tarea getTareas() {
		return tareas;
	}
	public void setTareas(Tarea tareas) {
		this.tareas = tareas;
	}
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
}
