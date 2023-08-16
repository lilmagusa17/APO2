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
	ListaEnlazada turnos;


	public CentralPacientes() {
		pacientes = new ListaEnlazada();
		turnos = new ListaEnlazada();
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
	public String agregarPaciente(int code, String nombre, Date fechaNacimiento){
		String out= "";

		Paciente p = (Paciente)pacientes.buscar(code);
		if (p==null) {
			pacientes.agregarUltimo(new Paciente(code, nombre, fechaNacimiento));
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

	public String consultarTurno(int code){
		String out= "";

		Paciente p = (Paciente)turnos.buscar(code);
		while (p!=null) {
			out+= p.toString() + "\n";
			p = (Paciente)turnos.buscar(code);
		}
		return out;
	}


	//FIXME i have an idea but idk
	public String atenderPaciente(int code, int pos) {
		String out= "";
		Paciente p = (Paciente)turnos.buscar(code);
		switch (pos) {
			case 1:
				if (p==null){
					turnos.agregarPrimero(new Paciente(code));
					out= "El paciente con cOdigo " + code + " fue correctamente agregado";
				}
				break;


			case 2:
				break;


		}

		return out;

	}

}
