package es.studium.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		/*Abrimos el contenedor de IoC indicando la ruta exacta de donde se encuentra el fichero 
		 * beans.xml*/
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		List<Centros> centros = new ArrayList<Centros>();
		System.out.println("Direcciones de todos los centros");
		Centros centro1=(Centros) appContext.getBean("centro");
		centro1.setDireccionCentro("Reyes Católicos, 14");
		centro1.setNombreCentro("Escuela de inglés");
		centros.add(centro1);
		System.out.println(centro1.getNombreCentro()+", Direccion: "+ centro1.getDireccionCentro());
		Centros centro2=(Centros) appContext.getBean("centro");
		centro2.setDireccionCentro("Cristóbal Colón, 92");
		centro2.setNombreCentro("Escuela de francés");
		centros.add(centro2);
		System.out.println(centro2.getNombreCentro()+", Direccion: "+ centro2.getDireccionCentro());
		System.out.println(centros.toString());
		
		System.out.println("");
		Alumnos a1=(Alumnos)  appContext.getBean("alumno");
		a1.setCentroAlumno(new Centros(1,"Escuela de inglés", "Reyes Católicos, 14", new ArrayList<Alumnos>()));
		System.out.println("Direccion del centro donde está matriculada Carmen");
		System.out.println(a1.getDireccionCentro());
		
		System.out.println("");
		Alumnos a2=(Alumnos)  appContext.getBean("alumno");
		a2.setNombreAlumno("Benito Bueno");
		a2.setNotaAsignatura(6.0);
		System.out.println("Nota que Benito ha sacado en el B2");
		System.out.println(a2.getNotaAsignatura());
	}
}
