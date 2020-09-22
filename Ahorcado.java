package ar.edu.unlam.pb2.disco;

import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
	Integer a;
	Integer b;
	Integer opcion;
	Integer resultado;
	
	Scanner teclado;
	
	teclado = new Scanner(System.in);
	
	do{
		System.out.println("Ingrese su operación 1 para sumar 2 para restar 3 para multiplicar 4 para dividir");
		opcion = teclado.nextInt();
	}while(opcion < 1 && opcion > 4);
	
	System.out.println("Ingrese el primer numero");
	a = teclado.nextInt();
	System.out.println("Ingrese el segundo numero");
	b = teclado.nextInt();
	
	switch (opcion) {
	
	case 1:
		resultado = a + b;
		break;
	case 2:
		resultado = a - b;
		break;
	case 3:
		resultado = a * b;
	}
	System.out.println("El resultado es " + resultado.toString());
	}
}