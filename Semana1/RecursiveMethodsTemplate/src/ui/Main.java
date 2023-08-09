package ui;

//Semana 1

import model.RecursiveMethods;
import java.util.Scanner;
public class Main {
	private Scanner imput;
	private RecursiveMethods recursiveMethods;

	public Main() {
		imput = new Scanner(System.in);
		recursiveMethods = new RecursiveMethods();
	}
	public int menu() {
		int option;
		do{
			System.out.println("Hi there! Select an option:\n"+"1. Sumatoria");
			System.out.println("2. Factorial");
			System.out.println("3. Fibonacci");
			System.out.println("4. Sumar array");
			System.out.println("5. Revertir un String");
			System.out.println("6. Promedio de un array");
			System.out.println("7. Division por restas sucesivas");
			System.out.println("8. Maximo comun divisor");

			System.out.println("0. Salir");
			option = imput.nextInt();
			imput.nextLine();

		}while(option > 0);

		return option;
	}
	
	public void answerOption(int option) {
        switch (option) {
            case 1 -> {
                System.out.println("Ingrese el número para calcular la sumatoria:");
                int n = imput.nextInt();
                imput.nextLine();
                System.out.println("La sumatoria es: " + recursiveMethods.sumaR(n));
            }
			case 2 -> {
				System.out.println("Ingrese el numero para calcular el factorial:");
				int n = imput.nextInt();
				imput.nextLine();
				System.out.println("El factorial es: " + recursiveMethods.factorialR(n));
			}
			case 3 -> {
				System.out.println("FIBONACCI\nIngrese el valor del término:");
				int n = imput.nextInt();
				imput.nextLine();
				System.out.println("El valor del término es: " + recursiveMethods.fibonacciR(n));
			}
			case 4 -> {
				System.out.println("Ingrese el numero para calcular la sumatoria del array");
				int n = imput.nextInt();
				imput.nextLine();
				int[] array = new int[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Ingrese el numero " + (i + 1) + " del array");
					array[i] = imput.nextInt();
					imput.nextLine();
				}
				System.out.println("La sumatoria del array es: " + recursiveMethods.posicionArrayR(array, n - 1, 0));
			}
			case 5 -> {
				System.out.println("Ingrese el String para revertirlo");
				String s = imput.nextLine();
				System.out.println("El String revertido es: " + recursiveMethods.revertirStringR(s, s.length() - 1));
			}
			case 6 -> {
				System.out.println("Ingrese el numero para calcular el promedio del array");
				int n = imput.nextInt();
				imput.nextLine();
				int[] array = new int[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Ingrese el numero " + (i + 1) + " del array");
					array[i] = imput.nextInt();
					imput.nextLine();
				}
				System.out.println("El promedio del array es: " + recursiveMethods.promedioArrayR(array, n - 1));
			}
			case 7 -> {
				System.out.println("Ingrese el dividendo");
				int dividendo = imput.nextInt();
				imput.nextLine();
				System.out.println("Ingrese el divisor");
				int divisor = imput.nextInt();
				imput.nextLine();
				System.out.println("La division es: " + recursiveMethods.divisionR(dividendo, divisor));
			}
			case 8 -> {
				System.out.println("Ingrese el primer numero");
				int a = imput.nextInt();
				imput.nextLine();
				System.out.println("Ingrese el segundo numero");
				int b = imput.nextInt();
				imput.nextLine();
				System.out.println("El maximo comun divisor es: " + recursiveMethods.mcdR(a, b));
			}
			default -> System.out.println("Opcion invalida");
        }
	}

	public static void main(String[] args){
		Main main = new Main();

		int option;

		do{
			option = main.menu();
			main.answerOption(option);
		}while( option != 0 );
	}
	
	
}
