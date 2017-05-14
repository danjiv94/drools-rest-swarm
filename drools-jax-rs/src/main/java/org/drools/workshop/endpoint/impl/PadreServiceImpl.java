/*
Daniel Jiménez A01338102
Diego Granados A01337287
*/
package org.drools.workshop.endpoint.impl;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.drools.workshop.model.*;

import org.drools.workshop.endpoint.api.*;
import org.kie.api.cdi.KReleaseId;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;

/**
 *
 * @author salaboy
 */
@ApplicationScoped
public class PadreServiceImpl implements PadreService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public PadreServiceImpl() {
    }

    /* @Override
    public User categorizeUser(User user) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> User: " + user);
        kSession.insert(user);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return user;

	}*/

    @Override
    public Alumno insertaAlumno(Alumno alumno) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Alumno: " + alumno);
        kSession.insert(alumno);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return alumno;
    }

    @Override
    public Materia insertaMateria(Materia materia) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Materia: " + materia);
        kSession.insert(materia);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return materia;
    }

        @Override
    public Examen insertaExamen(Examen examen) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Examen: " + examen);
        kSession.insert(examen);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return examen;
    }


    public Tarea insertaTarea(Tarea tarea) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Tarea: " + tarea);
        kSession.insert(tarea);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return tarea;
    }

    public Desempenio insertaDesempenio(Desempenio desempenio) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Desempenio: " + desempenio);
        kSession.insert(desempenio);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return desempenio;
    }

    public EjercicioEnClase insertaEjercicioEnClase(EjercicioEnClase ejercicioEnClase) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Ejercicio En Clase: " + ejercicioEnClase);
        kSession.insert(ejercicioEnClase);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return ejercicioEnClase;
    }


    @Override
    public List<Tarea> getTareas() {
        List<Tarea> tareas = new ArrayList<Tarea>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Tarea) {
                tareas.add((Tarea) o);
            }
        }
        return tareas;
    }


    @Override
    public List<Examen> getExamen() {
        List<Examen> examenes = new ArrayList<Examen>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Examen) {
                examenes.add((Examen) o);
            }
        }
        return examenes;
    }


    @Override
    public List<Alumno> getAlumnos() {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Alumno) {
                alumnos.add((Alumno) o);
            }
        }
        return alumnos;
    }

    @Override
    public List<Materia> getMaterias() {
        List<Materia> materias = new ArrayList<Materia>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Materia) {
                materias.add((Materia) o);
            }
        }
        return materias;
    }

    @Override
    public List<Desempenio> getDesempenio() {
        List<Desempenio> desempenios = new ArrayList<Desempenio>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Desempenio) {
                desempenios.add((Desempenio) o);
            }
        }
        return desempenios;
    }

    @Override
    public List<EjercicioEnClase> getEjerciciosEnClase() {
        List<EjercicioEnClase> ejerciciosEnClase = new ArrayList<EjercicioEnClase>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof EjercicioEnClase) {
                ejerciciosEnClase.add((EjercicioEnClase) o);
            }
        }
        return ejerciciosEnClase;
    }


    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
