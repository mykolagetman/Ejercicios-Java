public class ExtraBucles2 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una pirámide.");
    
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el carácter con el que pintar la pirámide: ");
    char c = System.console().readLine().charAt(0);
    
    int linea = 1;
    int espaciosIzq = altura;
    int i;
    String imprimeEspacios;
    String espacios = " ";
    
    while (linea <= altura) {
      
      imprimeEspacios = String.format("%%%ds", espaciosIzq);
      System.out.printf(imprimeEspacios, espacios);
      
      for (i = 0; i < linea; i++) {
	System.out.print(c + " ");
      }
      System.out.println();
      
      linea++;
      espaciosIzq--;
    }
  }
}

