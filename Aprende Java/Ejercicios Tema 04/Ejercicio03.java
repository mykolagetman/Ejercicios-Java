import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el número del día de la semana:");
		int dia = s.nextInt();
		
		//Cambia el número del día por el nombre
		switch(dia) {
		
		case 1:
			
			System.out.println("Lunes");
			break;
		
		case 2:
			
			System.out.println("Martes");
			break;
			
		case 3:
			
			System.out.println("Miércoles");
			break;
			
		case 4:
			
			System.out.println("Jueves");
			break;
		
		case 5:
			
			System.out.println("Viernes");
			break;
		
		case 6:
			
			System.out.println("Sabado");
			break;
			
		case 7:
			
			System.out.println("Domingo, el día del señoh");
			break;
		
		default:
			
			System.out.println("Ese día no existe subnormaaaa");
		}
	}

}
