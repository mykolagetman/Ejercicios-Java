package ejercicioT4;

import javax.swing.JOptionPane;

public class Ejercicio21 {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota "
				+ "del primer examen: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota "
				+ "del segundo examen: "));
		float media = (nota1 + nota2) / 2;
		
		System.out.printf("Nota primer examen: %.2f\nNota segundo examen: %.2f"
				+ "\nNota media: %.2f", nota1, nota2, media);
		
		if(media >= 5) {
			
			System.out.printf("\nEnhorabuena, est�s aprobado con un: %.2f", media);
		
		} else {
			
			float notaRecuperacion = Float.parseFloat(JOptionPane.showInputDialog(
					"\nIntroduce la nota del examen de recuperaci�n: "));
			System.out.printf("\nNota recuperaci�n: %.2f", notaRecuperacion);
			
			if(notaRecuperacion >= 5) {
				
				System.out.println("\nEl resultado de la recuperaci�n es APTO");				
			
			} else {
				System.out.println("\nEl resultado de la recuperaci�n es NO APTO");
			}
			
		}
	}
}


