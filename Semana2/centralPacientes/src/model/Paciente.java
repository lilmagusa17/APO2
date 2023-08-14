package model;

import java.util.Date;

/**
 * Clase que representa un paciente, ejemplo simplificado del caso de estudio del texto
 * @author Mariana Agudelo Salazar
 * @version 1.0
 * @since August 2023
 */

public class Paciente implements Cloneable{

	public Paciente(int codigo){
		this.codigo = codigo;
		this.siguiente = null;
		this. fechaNacimiento=null;
	}

	public Paciente(int codigo, String name, Date fechaNacimiento){
		this.codigo = codigo;
		this.name = name;
		this.fechaNacimiento = fechaNacimiento;
		this.siguiente = null;
	}
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

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String toString() {
		return "Paciente [codigo=" + codigo + ", fechaNacimiento=" + fechaNacimiento + ", name=" + name + ", siguiente="
				+ siguiente + "]";
	}

	public Paciente clone() throws CloneNotSupportedException {
		Paciente cloneP= new Paciente(this.codigo);
		//FIXME: cloneP.setSiguiente(this.siguiente.clone()); posible error con la fecha
		cloneP.setFechaNacimiento((Date) this.fechaNacimiento.clone());

		return cloneP;

	}


}
