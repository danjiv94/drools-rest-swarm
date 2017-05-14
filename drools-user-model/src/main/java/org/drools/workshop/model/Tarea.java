package org.drools.workshop.model;
public class Tarea {
	private int id;
	private double calificacion;
	private int parcial;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public int getParcial() {
		return parcial;
	}
	public void setParcial(int parcial) {
		this.parcial = parcial;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", calificacion=" + calificacion + "parcial=" + parcial + "]";
	}
	public Tarea(int id, double calificacion, int parcial) {
		super();
		this.id = id;
		this.calificacion = calificacion;
		this.parcial = parcial;
	}
	public Tarea(){
		
	}
}
