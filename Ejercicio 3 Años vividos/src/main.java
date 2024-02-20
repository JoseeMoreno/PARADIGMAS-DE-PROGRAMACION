import java.util.Scanner;
import java.time.LocalDate;

class main {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        int añoActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();

        int año, mes, dia;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingesa el año de tu nacimiento: ");
        año = lector.nextInt();
        System.out.print("Ingesa el mes de tu nacimiento: ");
        mes = lector.nextInt();
        System.out.print("Ingesa el dia de tu nacimiento: ");
        dia = lector.nextInt();

        int yeardiff = añoActual - año;
        if (mesActual > mes) {
            System.out.println("La diferencia de años es (su edad) es: " + yeardiff);
        } else if (mesActual == mes) {
            if (dia >= diaActual) {
                System.out.println("La diferencia de años es (su edad) es: " + yeardiff);
            } else {
                System.out.println("La diferencia de años (su edad) es: " + (yeardiff - 1));
            }
        } else {
            System.out.println("La diferencia de años (su edad) es: " + (yeardiff - 1));
        }
    }
}