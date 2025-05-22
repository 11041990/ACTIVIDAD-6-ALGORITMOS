
package conversiondefechas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CONVERSIONDEFECHAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        System.out.println("Por favor, ingresa una fecha en el formato yyyy mm dd:");
        String fechaIngresada = scanner.nextLine();

        try {
            // Convertir la entrada del usuario a un objeto LocalDate
            LocalDate fecha = LocalDate.parse(fechaIngresada, formatter);

            // Calcular la fecha una semana después
            LocalDate unaSemanaDespues = fecha.plusWeeks(1);

            // Calcular la fecha un mes antes
            LocalDate unMesAntes = fecha.minusMonths(1);

            // Mostrar los resultados
            System.out.println("Fecha ingresada: " + fecha);
            System.out.println("Una semana después: " + unaSemanaDespues);
            System.out.println("Un mes antes: " + unMesAntes);
        } catch (Exception e) {
            System.out.println("Formato de fecha inválido. Por favor, usa el formato yyyy mm dd.");
        }

        scanner.close();
    }
}
    
    

