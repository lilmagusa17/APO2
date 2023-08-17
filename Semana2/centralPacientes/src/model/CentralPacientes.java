package model;
import util.SingleLinkedList;
/**
 * Clase controladora del caso de estudio del texto
 * @author Mariana Agudelo Salazar
 * @version 1.0
 * @since August 2023
 */
public class CentralPacientes {
	SingleLinkedList pacientes;
	SingleLinkedList turnos;


	public CentralPacientes() {
		pacientes = new SingleLinkedList();
		turnos = new SingleLinkedList();
	}


	/**
	 * Informa si un paciente está registrado en la central de pacientes
	 * @param code, código del paciente
	 * @return String con el mensaje
	 */
	public String buscarPaciente(int code) {
		String out= "El paciente con codigo " + code+ " no está registrado";
		Paciente p = (Paciente)pacientes.search(code);

		if (p!=null)
			out= "El paciente con cOdigo " + code + " está registrado" ;

		return out;
	}

	public String agregarPaciente(int code){
		String out= "";

		Paciente p = (Paciente)pacientes.search(code);
		if (p==null) {
			pacientes.addLast(new Paciente(code));
			out= "El paciente con cOdigo " + code + " fue correctamente agregado";
		}else {
			out= "Error: el paciente con cOdigo " + code + " ya está registrado";
		}
		return out;
	}

	public String eliminarPaciente(int code) {
		String out= "";
		Paciente p = (Paciente)pacientes.search(code);

		if (p!=null) {
			pacientes.delete(p);
			out= "El paciente con cOdigo " + code + " fue correctamente eliminado";
		}else {
			out= "Error: el paciente con cOdigo " + code + " no está registrado";
		}
		return out;

	}

	public String consultarTurno(int code){
		String out= "";

		Paciente p = (Paciente)turnos.search(code);
		while (p!=null) {
			out+= p.toString() + "\n";
			p = (Paciente)turnos.search(code);
		}
		return out;
	}


	//FIXME i have an idea but idk
	public String atenderPaciente(int code, int pos) {
		String out= "";
		Paciente p = (Paciente)turnos.search(code);
		if (p==null){
			turnos.addFirst(new Paciente(code));
			out= "El paciente con cOdigo " + code + " será atendido en la posición " + pos;
		}

		return out;
	}

}
