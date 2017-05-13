
public class Tarea {
	private int id;
	private double calificacion;
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
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", calificacion=" + calificacion + "]";
	}
	public Tarea(int id, double calificacion) {
		super();
		this.id = id;
		this.calificacion = calificacion;
	}
	public Tarea(){
		
	}
}
