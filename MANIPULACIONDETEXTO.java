
package manipulaciondetexto;
import java.util.Scanner;
public class MANIPULACIONDETEXTO {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un texto largo
        System.out.println("Por favor, ingresa un texto largo:");
        String texto = scanner.nextLine();

        // Convertir el texto a minúsculas para evitar problemas de mayúsculas/minúsculas
        texto = texto.toLowerCase();

        // Palabra a buscar
        String palabra = "ingeniería";

        // Dividir el texto en palabras y contar las coincidencias
        String[] palabras = texto.split("\\s+"); // Divide por espacios en blanco
        int contador = 0;

        for (String p : palabras) {
            if (p.equals(palabra)) {
                contador++;
            }
        }
    }
    
}
