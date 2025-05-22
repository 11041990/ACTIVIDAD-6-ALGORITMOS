
package convertirnombres;
import java.util.Scanner;
public class CONVERTIRNOMBRES {

    public static void main(String[] args) {
       // Crear un objeto Scanner para leer la entrada del usuario  
        Scanner scanner = new Scanner(System.in);  

        // Solicitar y almacenar el nombre  
        System.out.print("Por favor, ingresa tu nombre: ");  
        String nombre = scanner.nextLine();  

        // Solicitar y almacenar la edad  
        System.out.print("Ahora, ingresa tu edad: ");  
        int edad = scanner.nextInt();  

        // Mostrar el mensaje personalizado  
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");  

        // Cerrar el objeto Scanner  
        scanner.close();  
    }  
}  
    
    

