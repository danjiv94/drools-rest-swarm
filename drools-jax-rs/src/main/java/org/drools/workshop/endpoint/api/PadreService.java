/*
Daniel Jiménez A01338102
Diego Granados A01337287
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.endpoint.api;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.*;

/**
 *
 * @author salaboy
 */
@Path("path")

public interface PadreService {
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("inserta/alumno")
    public Alumno insertaAlumno(@NotNull Alumno alumno);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("inserta/materia")
    public Materia insertaMateria(@NotNull Materia materia);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("inserta/examen")
    public Examen insertaExamen(@NotNull Examen examen);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("inserta/tarea")
    public Tarea insertaTarea(@NotNull Tarea tarea);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("inserta/ejercicioEnClase")
    public EjercicioEnClase insertaEjercicioEnClase(@NotNull EjercicioEnClase ejercicioEnClase);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("inserta/desempenio")
    public Desempenio insertaDesempenio(@NotNull Desempenio desempenio);

    @GET
    @Produces("application/json")
    @Path("get/ejercicioEnClase")
    public List<EjercicioEnClase> getEjerciciosEnClase();

    @GET
    @Produces("application/json")
    @Path("get/desempenio")
    public List<Desempenio> getDesempenio();

    @GET
    @Produces("application/json")
    @Path("get/materias")
    public List<Tarea> getTareas();

    @GET
    @Produces("application/json")
    @Path("get/materias")
    public List<Materia> getMaterias();

    @GET
    @Produces("application/json")
    @Path("get/examenes")
    public List<Examen> getExamen();

    @GET
    @Produces("application/json")
    @Path("get/alumnos")
    public List<Alumno> getAlumnos();


}
