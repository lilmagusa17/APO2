package model;

import java.util.Date;

/**
 * Clase que representa un paciente, ejemplo simplificado del caso de estudio del texto
 * @author Mariana Agudelo Salazar
 * @version 1.0
 * @since August 2023
 */

public class Paciente {
	/**
	 * identificador del paciente
	 */
	private int codigo;
	/**
	 * fecha de nacimiento, para calcular la edad
	 */
	private Date fechaNacimiento;
	/**
	 * nombre del paciente
	 */
	private String name;
	
	private Paciente siguiente;


	public int getCodigo() {
		return codigo;
	}

	public String getName(){
		return name;
	}

	public Paciente getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Paciente siguiente){
		this.siguiente=siguiente;
	}

}
