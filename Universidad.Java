import java.util.HashSet;

public class Universidad {
	public String nombre;
	
	public Universidad(String nombre) {
		this.nombre = nombre;}
	
	HashSet<Departamento> departamentos = new HashSet<Departamento>();
	public void setDepartamentos(Departamento depar) {
		this.departamentos.add(depar);}
	HashSet<Alumno> alumno = new HashSet<Alumno>();
	public void ingresarAlumno(Alumno alumno) {
		this.alumno.add(alumno);}
	
}
