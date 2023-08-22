import java.util.HashSet;

public class Alumno {
	String nombre;
	String cod;
	Universidad universidad;
	HashSet<Curso> cursos = new HashSet<Curso>();
	
	public Alumno(String nombre, String cod) {
		this.cod = cod;
		this.nombre = nombre;
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getCod() {return cod;}
	public void setCod(String cod) {this.cod = cod;}
	public Universidad getUniversidad() {return universidad;}
	public void setUniversidad(Universidad universidad) {this.universidad = universidad;}
	
}
