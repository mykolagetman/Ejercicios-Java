public class ExtraBucles2 {
  
  public static void main (String[] args) {
    System.out.println("Este programa pinta una pirámide.");
    
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el carácter con el que pintar la pirámide: ");
    char c = System.console().readLine().charAt(0);
    
    int linea = 1;
    int espaciosIzquierda = altura;
    String imprimeLinea;
    String espacios = " ";
    String caracteres = c + " ";
    
    while (linea <= altura) {
    
      imprimeLinea = String.format("%%%ds%%s", espaciosIzquierda);
      System.out.printf(imprimeLinea, espacios, caracteres);
      
      System.out.println();
      
      linea++;
      espaciosIzquierda--;
      caracteres += c + " ";
    }
  }
}

