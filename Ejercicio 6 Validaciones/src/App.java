import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 6 Validaciones");
        String nombre, paterno, materno;
        String mnac, dnac, anac;
        do {
            System.out.print("Nombre: ");
            nombre = lector.nextLine();
        } while (valida.strvacio(nombre));

        do {
            System.out.print("Paterno: ");
            paterno = lector.nextLine();
        } while (valida.strvacio(paterno) != false);

        do {
            System.out.print("Materno: ");
            materno = lector.nextLine();
        } while (valida.strvacio(materno) != false);

        // validar dia
        do {
            System.out.print("Dia de nacimiento: ");
            dnac = lector.nextLine();
        } while (valida.numPosit(dnac) == false
                || valida.rango(Integer.parseInt(dnac), 1, 30) == false);

        // validar mes
        do {
            System.out.print("Mes de nacimiento: ");
            mnac = lector.nextLine();
        } while (valida.numPosit(mnac) == false
                || valida.rango(Integer.parseInt(mnac), 1, 12) == false);

        do {
            System.out.print("Año de nacimiento: ");
            anac = lector.nextLine();
        } while (valida.numPosit(anac) == false
                || valida.rango(Integer.parseInt(mnac), 0, 2024) == false);

        System.out.println("El nombre es " + nombre + " " + paterno + " " + materno);
        System.out.println(
                "La fecha de nacinmiento es: " + dnac + "/" + ((mnac.length() == 1) ? "0" + mnac : mnac) + "/" + anac);

    }
}
