package ui;

import model.InfrastructureDepartment;

import java.io.IOException;


public class Main {

	// Scanner object to read from the console
	private static java.util.Scanner sc;
	private static InfrastructureDepartment con;

	public Main() {
		sc = new java.util.Scanner(System.in);
		//controller (so far no hay)
		con = new InfrastructureDepartment();
	}

	public static void main(String[] args) {
		// Creating an object of the class
		Main obPpal = new Main();
		// Variable to store the option chosen by the user
		int option= 0;
		loadDataCon();
		loadData();
		//Loop to show the menu until the user
		// Exit option is 0
		do {
			option =obPpal.menu();
			obPpal.answerOption(option);
		}while (option !=0);
		saveData();


	}

	public int menu(){
		int input;
		System.out.println("(1) Add a billboard\n(2) Show billboards\n(3) Export danger report\n\n(0) To exit");
		input = sc.nextInt();
		if(input<0 || input>3){
			System.out.println("Please enter a valid option");
			input=sc.nextInt();
		}

		sc.nextLine();
		return input;

	}

	public void answerOption(int op){
		switch (op) {
			case 1: addBillboard();
				break;

			case 2: showBillboards();
				break;

			case 3: exportDangerReport();
				break;

			case 0: System.out.println("Wait! we are saving the billboard's data first :)\n");
				//con.saveBillboards();
				break;
		}

	}




	/*public static void ejemploCrear() {
		File archivo = new File("data/ejemplo.txt"); // Crea una instancia para el archivo "ejemplo.txt"
		System.out.println(archivo.exists());
		
		// Crea una instancia para el directorio "directorioEjemplo"
		File directorio = new File("directorioEjemplo"); 
		// Verifica si el archivo existe
		boolean existe = archivo.exists(); 
		// Verifica si es un directorio
		boolean esDirectorio = directorio.isDirectory(); 
		System.out.println(esDirectorio);
		// Verifica si es un archivo
		boolean esArchivo = archivo.isFile(); 
		// Obtiene el nombre del archivo o directorio
		String nombre = archivo.getName(); 
		// Obtiene la ruta absoluta del archivo o directorio
		String rutaAbsoluta = archivo.getAbsolutePath(); 
	}
	
	public static void ejemploLeer() {
		
		File archivo = new File("data/ejemplo.txt");
		
		
		try {
			BufferedReader lector = new BufferedReader(
					new FileReader(archivo)) ;

			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: "+ e.getMessage());
		}
	}
	
	public static void ejemploCadenas() {
		//Con split
		String[] result = "this is a test".split("\\s");
	     for (int x=0; x<result.length; x++)
	         System.out.println(result[x]);
	   
	     //Con stringtokenizer
	     StringTokenizer st = new StringTokenizer("this is a test");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	}
	
	public static void ejemploEscribir() {
		File salidaFile= new File("data/salida.txt");
		
		try {
			//Creando el nuevo archivo
			salidaFile.createNewFile();
			//Creando el objeto escritor
			BufferedWriter escritor = new BufferedWriter(
					new FileWriter(salidaFile));
            String texto = "Este es un ejemplo de escritura en un archivo.";
            escritor.write(texto);
            escritor.flush();
            escritor.close();
            System.out.println("Texto escrito con éxito en el archivo.");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
		
		
	}*/

	public void addBillboard() {

		try{
			System.out.println("Please enter the billboard data like this: width++height++inUse++brand");
			String data = sc.nextLine();
			con.addBillboard(data);
		}catch (IOException e) {
			System.out.println("Error adding a new billboard: " + e.getMessage());
		}
	}

	public void showBillboards(){
		System.out.println(con.allBillboardsReport());

	}

	public void exportDangerReport(){
		con.exportDangerousBillboardReport();


	}

	public static void loadDataCon(){
		try{
			con.loadBillboards();
		}catch (IOException e) {
			System.out.println("Error loading the data: " + e.getMessage());
	    }catch (ClassNotFoundException e) {
			System.out.println("There's no data: " + e.getMessage());
		}
	}

	public static void loadData(){
		try{
			con.loadBillboards();
		}catch (IOException e) {
			System.out.println("Error loading the data: " + e.getMessage());
	    }catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static void saveData(){
		try{
			con.saveBillboards();
		}catch (IOException e) {
			System.out.println("Error saving the data: " + e.getMessage());
		}
	}


}
