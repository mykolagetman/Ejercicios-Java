package ejercicioT4;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero "
				+ "entero:"));
		
		System.out.println("El n�mero introducido es " + num + ".");
		
		num = num%10;
		
		System.out.println("La �ltima cifra del n�mero introducido es " + num);
	}

}
