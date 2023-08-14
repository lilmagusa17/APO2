package model;
import java.util.Date;
import util.ListaEnlazada;
/**
 * Clase controladora del caso de estudio del texto
 * @author Mariana Agudelo Salazar
 * @version 1.0
 * @since August 2023
 */
public class CentralPacientes {
	ListaEnlazada pacientes;


	public CentralPacientes() {
		pacientes = new ListaEnlazada();
	}


	/**
	 * Informa si un paciente está registrado en la central de pacientes
	 * @param code, código del paciente
	 * @return String con el mensaje
	 */
	public String buscarPaciente(int code) {
		String out= "El paciente con codigo " + code+ " no está registrado";
		Paciente p = (Paciente)pacientes.buscar(code+"");

		if (p!=null)
			out= "El paciente con cOdigo " + code + " está registrado" ;

		return out;
	}

	//FIXME completar con los otros parAmetros del paciente
	public String agregarPaciente(int code) {
		String out= "";

		Paciente p = (Paciente)pacientes.buscar(code);
		if (p==null) {
			pacientes.agregarUltimo(new Paciente(code));
			out= "El paciente con cOdigo " + code + " fue correctamente agregado";
		}else {
			out= "Error: el paciente con cOdigo " + code + " ya está registrado";
		}

		return out;
	}

	public String eliminarPaciente(int code) {
		String out= "";
		Paciente p = (Paciente)pacientes.buscar(code);

		if (p!=null) {
			pacientes.eliminar(p);
			out= "El paciente con cOdigo " + code + " fue correctamente eliminado";
		}else {
			out= "Error: el paciente con cOdigo " + code + " no está registrado";
		}
		return out;

	}



	/*
	//CREAR INSTANCIA DE LA LISTA ENLAZADA
	
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
/*
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
/*
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
			numPacientes++;
		}

		return out.toString();
	}
	*/
/*
	public String agregarPaciente(int code, String name) {
		StringBuilder out = new StringBuilder();
		Paciente nuevo = new Paciente(code, name);
		Paciente current = primero;
		while (current.getSiguiente() != null) {
			current = current.getSiguiente();
		}
		current.setSiguiente(nuevo);
		return out.toString();
	}

	public String agregarPacientePrimero(int code, String name){
		String out="";
		Paciente nuevo = new Paciente(code, name);

		if(primero==null) {
			primero = nuevo; //asignacion de la referencia del nuevo nodo al primero
			out="Se agrego el paciente al principio de la lista";
		}else {
			nuevo.setSiguiente(primero);
			primero = nuevo;
			out="Se agrego el paciente al principio de la lista";
		}
		return out;
	}

	public Paciente clonar(int code) throws CloneNotSupportedException {
		Paciente current = primero;
		while (current != null) {
			if (code == current.getCodigo()) {
				return current.clone();
			}
			current = current.getSiguiente();
		}
		return null;
	}
	*/

}
