package org.drools.workshop.model;

public class Examen {

	private int id;
	private int calificacion;
	private int parcial;

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
		public int getParcial() {
		return parcial;
	}
	public void setParcial(int parcial) {
		this.parcial = parcial;
	}
	@Override
	public String toString() {
		return "Examen [id=" + id + ", calificacion=" + calificacion + "parcial=" + parcial + "]";
	}
	public Examen(int id, int calificacion, int parcial) {
		super();
		this.id = id;
		this.calificacion = calificacion;
		this.parcial = parcial;
	}

}
