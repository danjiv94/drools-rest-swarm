/*
Daniel Jiménez A01338102
Diego Granados A01337287
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class Alumno {

    private String nombre;
    private String matricula;
    private String carrera;
    private Materia materia;
    private int tiempoEnSistema;
    public Alumno(){
    	
    }
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public int getTiempoEnSistema() {
		return tiempoEnSistema;
	}
	public void setTiempoEnSistema(int tiempoEnSistema) {
		this.tiempoEnSistema = tiempoEnSistema;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", matricula=" + matricula + ", carrera=" + carrera + ", materia=" + materia
				+ ", tiempoEnSistema=" + tiempoEnSistema + "]";
	}
	public Alumno(String nombre, String matricula, String carrera, Materia materia, int tiempoEnSistema) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.carrera = carrera;
		this.materia = materia;
		this.tiempoEnSistema = tiempoEnSistema;
	}
    
}

