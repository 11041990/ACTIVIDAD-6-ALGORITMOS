
package comparaciondecadenas;
import java.util.Scanner;
public class COMPARACIONDECADENAS {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dos cadenas de texto
        System.out.println("Introduce la primera cadena de texto:");
        String cadena1 = scanner.nextLine();

        System.out.println("Introduce la segunda cadena de texto:");
        String cadena2 = scanner.nextLine();

        // Comparar la longitud de las cadenas
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Ambas cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen longitudes diferentes.");
        }

        // Comparar el contenido de las cadenas
        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de ambas cadenas es igual.");
        } else {
            System.out.println("El contenido de las cadenas es diferente.");
        }

        scanner.close();
    }
}
    
    

