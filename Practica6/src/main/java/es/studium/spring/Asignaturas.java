package es.studium.spring;


public class Asignaturas {
	private int codAsignatura;
	private String asignatura;

	public Asignaturas() {
		codAsignatura=0;
		asignatura="";
	}

	public Asignaturas(int codAsignatura, String asignatura) {
		this.codAsignatura=codAsignatura;
		this.asignatura=asignatura;
	}

	public int getCodAsignatura() {
		return codAsignatura;
	}

	public void setCodAsignatura(int codAsignatura) {
		this.codAsignatura = codAsignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}
	
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}