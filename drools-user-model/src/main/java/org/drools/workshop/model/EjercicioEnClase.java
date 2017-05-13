package org.drools.workshop.model;
public class EjercicioEnClase {
	private int idEjercicio;
	private double calificacion;
	public EjercicioEnClase(){
		
	}
	
	@Override
	public String toString() {
		return "EjercicioEnClase [idEjercicio=" + idEjercicio + ", calificacion=" + calificacion + "]";
	}
	public int getIdEjercicio() {
		return idEjercicio;
	}
	public void setIdEjercicio(int idEjercicio) {
		this.idEjercicio = idEjercicio;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public EjercicioEnClase(int idEjercicio, double calificacion) {
		super();
		this.idEjercicio = idEjercicio;
		this.calificacion = calificacion;
	}
}
