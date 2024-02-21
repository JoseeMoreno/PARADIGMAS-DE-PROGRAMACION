import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
        LocalDate fechaNac = LocalDate.of(año, mes, dia);
        System.out.println("Dias vividos: " + (ChronoUnit.DAYS.between(fechaNac, fechaActual)));

    }
}