import java.util.HashSet;

public class Departamento {
	private String nombre;
	Universidad universidad;
	HashSet<Profesor> profesor = new HashSet<Profesor>();
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
}
