import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
		
      System.out.println("Este programa comprueba si el numero es capicua");
      
      int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un " 
	+ "n�mero con cinco cifras como m�ximo:"));
      
      System.out.println("El n�mero introducido es " + num + ".");
		
      boolean capicua = false;

      //N�meros de 5 cifras		5abc5
      if(num < 100000 && num > 9999) {
			
      if(((num / 10000) == (num % 10)) && 
	(((num / 1000) % 10) == ((num / 100) % 10) &&
	((num / 100) % 10) == ((num /10) % 10))) {
	capicua = true;
      }
		
      //N�meros de 4 cifras	4ab4
      } else if(num < 10000 && num > 999) {
			
      if(((num / 1000) == (num % 10)) && 
	(((num / 100) % 10) == ((num / 10) % 10))) {
	capicua = true;
      } 
		
      //N�meros de 3 cifras
      } else if(num < 1000 && num > 99) {
      
      if((num / 100) == (num % 10)) {
	capicua = true;
      }
			
      //N�meros de 2 cifras	
      } else if (num < 100 && num >= 10) {
			
      if((num / 10) == (num % 10)) {
	capicua=true;
      }
			
      } else {
	System.out.println("El n�mero introducido es err�neo.");
	System.exit(0);
      }
		
      if(capicua) {
	System.out.println("El n�mero es CAPIC�A.");
      } else {
	System.out.println("El n�mero NO es CAPIC�A.");
	}
    }

}
