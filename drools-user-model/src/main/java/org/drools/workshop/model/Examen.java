package org.drools.workshop.model;
public class Examen {
	
	private int id;
	private int calificacion;
	public Examen(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Examen [id=" + id + ", calificacion=" + calificacion + "]";
	}
	public Examen(int id, int calificacion) {
		super();
		this.id = id;
		this.calificacion = calificacion;
	}
	
}
