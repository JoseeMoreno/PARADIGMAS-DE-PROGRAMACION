import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // NOMBRE
        // PATERNO
        // MATERNO
        // CALLE CON NUMERO
        // COLONIA
        // CODIGO POSTAL
        // CIUDAD
        // EMAIL
        // TELEFONO

        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 6 Validaciones");
        String nombre, paterno, materno, calle, colonia, ciudad, email, telefono;
        String mnac, dnac, cp;

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

        do {
            System.out.print("Calle: ");
            calle = lector.nextLine();
        } while (valida.strvacio(calle) != false);

        do {
            System.out.print("Codigo postal: ");
            cp = lector.nextLine();
        } while (valida.CP(cp) != true);

        do {
            System.out.print("Colonia: ");
            colonia = lector.nextLine();
        } while (valida.colonia(colonia) != true);

        do {
            System.out.print("Ciudad: ");
            ciudad = lector.nextLine();
        } while (valida.strvacio(ciudad) != false);

        do {
            System.out.print("Telefono: ");
            telefono = lector.nextLine();
        } while (valida.telefono(telefono) != false);

    }
}
