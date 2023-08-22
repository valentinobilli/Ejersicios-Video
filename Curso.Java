import java.util.HashSet;

public class Curso {
	String nombre;
	String cod;
	Profesor profesor;
	HashSet<Alumno> alumno = new HashSet<Alumno>();
	
	public void ingresarAlumno(Alumno alumno) {
		this.alumno.add(alumno);}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getCod() {return cod;}
	public void setCod(String cod) {this.cod = cod;}
	public Profesor getProfesor() {return profesor;}
	public void setProfesor(Profesor profesor) {this.profesor = profesor;}
	
}
