package org.drools.workshop.model;
import java.util.Arrays;

public class Desempenio {

	private String tema;
	private EjercicioEnClase[] ejercicios;
	private Tarea[] tareas;
	private Examen[] examenes;
	public Desempenio(){

	}

	public Desempenio(String tema, EjercicioEnClase[] ejercicios, Tarea[] tareas, Examen[] examenes) {
		super();
		this.tema = tema;
		this.ejercicios = ejercicios;
		this.tareas = tareas;
		this.examenes = examenes;
	}
	@Override
	public String toString() {
		return "Desempenio [tema=" + tema + ", ejercicios=" + Arrays.toString(ejercicios) + ", tareas="
				+ Arrays.toString(tareas)+ ", examenes=" + Arrays.toString(examenes) + "]";
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public EjercicioEnClase[] getEjercicios() {
		return ejercicios;
	}
	public void setEjercicios(EjercicioEnClase[] ejercicios) {
		this.ejercicios = ejercicios;
	}
	public Tarea[] getTareas() {
		return tareas;
	}
	public void setTareas(Tarea[] tareas) {
		this.tareas = tareas;
	}
	public Examen[] getExamenes() {
		return examenes;
	}
	public void setExamenes(Examen[] examenes) {
		this.examenes = examenes;
	}
}
