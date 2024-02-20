
import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

    public static String homoclave(int dia, int mes) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String homo = "";
        homo += (caracteres.substring(mes * 2, (mes * 2) + 1)) + (caracteres.substring(dia, dia + 1))
                + (caracteres.substring((dia + mes) / 2, ((dia + mes) / 2) + 1));

        return homo;
    }

    public static String validar(int num, Scanner lector, String mess) {
        DecimalFormat formato = new DecimalFormat("00");
        switch (num) {
            case 1:
                int año = lector.nextInt();
                if (año <= 0 || año > 2024) {
                    System.out.println("Ingresar nuevamente el año...");
                    validar(1, lector, "0");
                } else {
                    return "" + (formato.format(año % 100));
                }
                break;
            case 2:
                int mes = lector.nextInt();
                if (mes <= 0 || mes > 12) {
                    System.out.println("Ingresar nuevamente el mes...");
                    validar(2, lector, "0");
                } else {
                    return "" + (formato.format(mes));
                }
                break;
            // meses con 31 dias
            // ENERO MARZO MAYO JULIO AGOSTO OCTUBRE DICIEMBRE
            // meses con 30 dias
            // ABRIL JUNIO SEPTIEMBRE NOVIEMBRE
            // febrero con 28 dias fijo
            case 3:
                int dia = lector.nextInt();
                int meses = Integer.parseInt(mess);
                if (dia <= 0 || dia > 31) {
                    System.out.println("Ingresar nuevamente el dia...");
                    validar(3, lector, mess);
                } else if (meses == 1 || meses == 3 || meses == 5 || meses == 7
                        || meses == 8 || meses == 10 || meses == 12) {
                    return "" + (formato.format(dia));
                } else if ((meses == 4 || meses == 5 || meses == 9 || meses == 11) && dia <= 30) {
                    return "" + (formato.format(dia));
                } else if ((meses == 2) && dia <= 29) {
                    return "" + (formato.format(dia));
                } else {
                    System.out.print("Ingresa nuevamente el dia: ");
                    validar(3, lector, mess);
                }
                break;
            default:
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        String año, mes, dia;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingesa el año de tu nacimiento: ");
        año = validar(1, lector, "0");
        System.out.print("Ingesa el mes de tu nacimiento: ");
        mes = validar(2, lector, "0");
        System.out.print("Ingesa el dia de tu nacimiento: ");
        dia = validar(3, lector, mes);
        lector.nextLine();
        System.out.print("Ingresa tu nombre: ");
        String nombre = (lector.nextLine()).toUpperCase();
        System.out.print("Ingresa tu apellido paterno: ");
        String paterno = (lector.nextLine()).toUpperCase();
        System.out.print("Ingresa tu apellido materno: ");
        String materno = (lector.nextLine()).toUpperCase();
        String iniciales = (paterno.substring(0, 2)) + (materno.substring(0, 1))
                + (nombre.substring(0, 1));
        String rfc = iniciales + año + mes + dia
                + homoclave(Integer.parseInt(dia), Integer.parseInt(mes));
        System.out.println("Tu rfc es: " + rfc);
    }
}
