package es.studium.spring;

import java.util.ArrayList;
import java.util.List;


public class Centros {
	private int codCentro;
	private String nombreCentro;
	private String direccionCentro;
	private List<Alumnos> alumnoCentro;

	public Centros() {
		codCentro=0;
		nombreCentro="";
		direccionCentro="";
		alumnoCentro=new ArrayList<Alumnos>();
	}

	public Centros(int codCentro, String nombreCentro, String direccionCentro, List<Alumnos> alumnosCentro) {
		this.codCentro=codCentro;
		this.nombreCentro=nombreCentro;
		this.direccionCentro=direccionCentro;
		this.alumnoCentro=alumnosCentro;
	}

	public List<Alumnos> getAlumnoCentro() {
		return alumnoCentro;
	}

	public void setAlumnosCentro(List<Alumnos> alumnoCentro) {
		this.alumnoCentro = alumnoCentro;
	}

	public int getCodCentro() {
		return codCentro;
	}

	public void setCodCentro(int codCentro) {
		this.codCentro = codCentro;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	
	public String getDireccionCentro() {
		return direccionCentro;
	}

	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}
	@Override
	public String toString() {
		return "Nombre del Centro=" + nombreCentro + ", Dirección del Centro="+direccionCentro;
	}
}