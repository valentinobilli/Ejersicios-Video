import java.util.HashSet;

public class Profesor {
	String nombre;
	String cod;
	
	public Profesor(String nombre, String cod) {
		this.cod = cod;
		this.nombre = nombre;
	}
	
	Departamento departamento;
	HashSet<Curso> curso = new HashSet<Curso>();
	
	public void ingresarCurso(Curso curso) {
		this.curso.add(curso);}
	
	public String getCod() {return cod;}
	public void setCod(String cod) {this.cod = cod;}
	public Departamento getDepartamento() {return departamento;}
	public void setDepartamento(Departamento departamento) {this.departamento = departamento;}
	public HashSet<Curso> getCurso() {return curso;}
	public void setCurso(HashSet<Curso> curso) {this.curso = curso;}
}
