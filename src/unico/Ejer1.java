package unico;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
		int dia;
		String mensaje;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un dia de la semana[Numericamente]:");
		dia = Integer.parseInt(teclado.nextLine());
		
		
		switch (dia) {
		case 1:
			mensaje = "Toca programacion";	
			break;
		case 2:
			mensaje = "Toca FOL";
			break;
		case 3:
			mensaje = "Toca LM";	
			break;
		case 4:
			mensaje = "Toca programacion";	
			break;
		case 5:
			mensaje = "Toca programacion";		
			break;
		default:
			mensaje = "No hay";
		}
		
		System.out.println(mensaje);

	}

}
