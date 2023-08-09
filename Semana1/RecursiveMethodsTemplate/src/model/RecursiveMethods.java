package model;
public class RecursiveMethods {

	//Recursiva de sumatoria
	public int sumaR(int n) {
		int count=0;
		if(n==1) {
			count=1;
		}else {
			count=n+sumaR(n-1);
		}
		return count;
	}

	//Recursiva de factorial

	public int factorialR(int n) {
		int count=0;
		if(n==0) {
			count=1;
		}else {
			count=factorialR(n-1)*n;
		}
		return count;
	}

	//Recursiva de fibonacci
	public int fibonacciR(int n) {
		int count=0;
		if(n==1 || n==2) {
			count=1;
		}else {
			count=fibonacciR(n-1)+fibonacciR(n-2);
		}

		return count;
	}

	//SEGUIMIENTO 1

	//Punto 1
	//Sumar array de forma recursiva
	public int sumarArrayR(int[] array, int n) {
		int count=0;
		if(n==0) {
			count=array[0];
		}else {
			count=array[n]+sumarArrayR(array,n-1);
		}
		return count;
	}

	//Punto 2
	//Revertir un String de forma recursiva
	public String revertirStringR(String s, int n) {
		String count="";
		if(n==0) {
			count+=s.charAt(0);
		}else {
			count+=s.charAt(n)+revertirStringR(s,n-1);
		}
		return count;
	}

	//Punto 3
	//Promedio de un array de forma recursiva
	public double promedioArrayR(int[] array, int n) {
		double count=0;
		if(n==0) {
			count=array[0];
		}else {
			count=array[n]+promedioArrayR(array,n-1);
		}
		return count/array.length;
	}

	//Punto 4
	//Posicion de un elemento en un array de forma recursiva
	public int posicionArrayR(int[] array, int n, int index) {
		int position=-1;
		if(array[index]==n){
			position=index;
		}else{
			position= posicionArrayR(array, n-1, index+1);
		}
		return position;
	}

	//Punto 5
	//Division por restas sucesivas de forma recursiva
	public int divisionR(int a, int b) {
		int count=0;
		if(a<b) {
			count=0;
		}else {
			count=1+divisionR(a-b,b);
		}
		return count;
	}

	//Punto 6
	//Maximo comun divisor de forma recursiva
	public int mcdR(int a, int b) {
		int count=0;
		if(a==b) {
			count=a;
		}else {
			if(a>b) {
				count=mcdR(a-b,b);
			}else {
				count=mcdR(a,b-a);
			}
		}
		return count;
	}


}
