import java.util.Arrays;

public class Desempenio {
	
	private String tema;
	private EjercicioEnClase[] ejercicios;
	private Tarea[] tareas;
	public Desempenio(){
		
	}
	
	public Desempenio(String tema, EjercicioEnClase[] ejercicios, Tarea[] tareas) {
		super();
		this.tema = tema;
		this.ejercicios = ejercicios;
		this.tareas = tareas;
	}
	@Override
	public String toString() {
		return "Desempenio [tema=" + tema + ", ejercicios=" + Arrays.toString(ejercicios) + ", tareas="
				+ Arrays.toString(tareas) + "]";
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
}
