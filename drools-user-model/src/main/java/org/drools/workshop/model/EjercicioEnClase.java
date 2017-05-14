package org.drools.workshop.model;
public class EjercicioEnClase {
	private int idEjercicio;
	private double calificacion;
	private int parcial;
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
		public int getParcial() {
		return parcial;
	}
	public void setParcial(int parcial) {
		this.parcial = parcial;
	}
	public EjercicioEnClase(int idEjercicio, double calificacion, int parcial) {
		super();
		this.idEjercicio = idEjercicio;
		this.calificacion = calificacion;
		this.parcial = parcial;
	}
}
