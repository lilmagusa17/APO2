package model;
/**
 * Clase controladora del caso de estudio del texto
 * @author Mariana Agudelo Salazar
 * @version 1.0
 * @since August 2023
 */
public class CentralPacientes {
	
	private int numPacientes;
	
	private Paciente primero; //Primer nodo de la linkedlist

	public CentralPacientes() {
		this.numPacientes = 0;
		primero = null;
	}

	public int getNumPacientes() {
		return numPacientes;
	}

	public void setNumPacientes(int numPacientes) {
		this.numPacientes = numPacientes;
	}

	/*
	public String eliminarPaciente(int code) {
		String out= "";
		while(primero!=null) {
			if (code == primero.getCodigo()) {
				out = primero.getName();
				primero = primero.getSiguiente();
			}
			out = primero.getSiguiente().getName();
			primero = primero.getSiguiente();
		}

		return out;
	}
	 */

	public String eliminarPaciente(int code) {
		String out = "";

		if (primero == null) {
			return out; // Return an empty string if the list is empty
		}

		if (code == primero.getCodigo()) {
			out = primero.getName();
			primero = primero.getSiguiente();
			return out;
		}

		Paciente current = primero;
		while (current.getSiguiente() != null) {
			if (code == current.getSiguiente().getCodigo()) {
				out = current.getSiguiente().getName();
				current.setSiguiente(current.getSiguiente().getSiguiente());
				break; // Exit the loop after removing the patient
			}
			current = current.getSiguiente();
		}

		return out;
	}

	/*
	public Paciente localizar( int codigo ){
       `Paciente actual = primero;
 		while( actual != null && actual.darCodigo( ) != codigo ){
 				actual = actual.darSiguiente( );
 		}
 		return actual;
 		}
	 */

	public String buscarPaciente(int code) {
		StringBuilder out = new StringBuilder();

		Paciente current = primero;
		while (current != null) {
			if (code == current.getCodigo()) {
				out.append(current.getName()).append("\n");
			}
			current = current.getSiguiente();
		}

		return out.toString();
	}

	/*
	public String agregarPaciente(int code) {
		StringBuilder out= new StringBuilder();
		while(primero != null) {
			primero = primero.getSiguiente();
			out.append(primero.getSiguiente().getName()).append("AGREGADO\n");
		}

		return out.toString();
	}
	*/

	public String agregarPaciente(int code) {
		StringBuilder out = new StringBuilder();

		Paciente current = primero;
		while (current != null) {
			out.append(current.getName()).append(" AGREGADO\n");
			current = current.getSiguiente();
		}

		return out.toString();
	}

}
