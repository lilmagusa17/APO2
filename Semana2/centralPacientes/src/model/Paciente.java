package model;

import java.util.Date;

/**
 * Clase que representa un paciente, ejemplo simplificado del caso de estudio del texto
 * @author Mariana Agudelo Salazar
 * @version 1.0
 * @since August 2023
 */

public class Paciente implements Cloneable{

	public Paciente(int codigo) {
		this.codigo = codigo;
		this.name = "dummy name";
		fechaNacimiento= new Date();

	}

	public Paciente(int codigo, String name, Date fechaNacimiento){
		this.codigo = codigo;
		this.name = name;
		this.fechaNacimiento = fechaNacimiento;
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


	public int getCodigo() {
		return codigo;
	}

	public String getName(){
		return name;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", fechaNacimiento=" + fechaNacimiento + ", name=" + name + ", siguiente="
			 + "]";
	}

	@Override
	public boolean equals(Object obj){
		boolean out =false;
		out = (int)obj==this.codigo;
		return out;
	}



}
