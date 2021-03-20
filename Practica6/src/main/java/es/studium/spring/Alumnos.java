package es.studium.spring;

public class Alumnos {
	private String nombreAlumno;
	private String direccionAlumno;
	private int numeroMatricula;
	private double notaAsignatura;
	private int horasAsignatura;
	private Centros centroAlumno;
	private Asignaturas asignatura;
	
	public Alumnos() {
		nombreAlumno="";
		direccionAlumno="";
		numeroMatricula=0;
		notaAsignatura=0.0;
		horasAsignatura=0;
		setCentroAlumno(new Centros());
		setAsignatura(new Asignaturas());
	}
	
	public Alumnos(String nombreAlumno, String direccionAlumno, double notaAsignatura,int horasAsignatura, int numeroMatricula, Centros nombreCentro, Asignaturas asignatura) {
		this.nombreAlumno=nombreAlumno;
		this.direccionAlumno=direccionAlumno;
		this.notaAsignatura=notaAsignatura;
		this.horasAsignatura=horasAsignatura;
		this.numeroMatricula=numeroMatricula;
		this.setCentroAlumno(nombreCentro);
		this.setAsignatura(asignatura);
	}
	
	public double getNotaAsignatura() {
		return notaAsignatura;
	}
	
	public void setNotaAsignatura(double notaAsignatura) {
		this.notaAsignatura = notaAsignatura;
	}

	public int getHorasAsignatura() {
		return horasAsignatura;
	}

	public void setHorasAsignatura(int horasAsignatura) {
		this.horasAsignatura = horasAsignatura;
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
	public String getDireccionAlumno() {
		return direccionAlumno;
	}

	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public Centros getCentroAlumno() {
		return centroAlumno;
	}
	
	public void setCentroAlumno(Centros centroAlumno) {
		this.centroAlumno = centroAlumno;
	}
	
	public Asignaturas getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignaturas asignatura) {
		this.asignatura = asignatura;
	}
	@Override
	public String toString() {
		return "Nombre Alumno=" + nombreAlumno + " Asignatura=" + asignatura;
	}
	
	public String getDireccionCentro() {
		return centroAlumno.getDireccionCentro();
	}
}
