import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class valida {

    public static void saludo() {
        System.out.println("hola mundo");
    }

    public static boolean strvacio(String dato) {
        if (dato == "")
            return true;
        else
            return false;
    }

    public static String leeString() {
        Scanner lector = new Scanner(System.in);
        String dato;
        do {
            dato = lector.nextLine();
        } while (valida.strvacio(dato) == true);
        return dato;
    }

    // validar los numeros
    public static boolean num(String dato) { // valida que sea entero
        int num = 0;
        try {

            num = Integer.parseInt(dato);
            return true;

        } catch (Exception error) {
            // System.out.println(error.getMessage());
            return false;
        }

    }

    // valida numeros positivos
    public static boolean numPosit(String dato) { // valida que sea entero
        int num = 0;
        try {

            num = Integer.parseInt(dato);
            if (num > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception error) {
            // System.out.println(error.getMessage());
            return false;
        }

    }

    // valida numero negativo
    public static boolean numNeg(String dato) { // valida que sea entero
        int num = 0;
        try {

            num = Integer.parseInt(dato);
            if (num < 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception error) {
            // System.out.println(error.getMessage());
            return false;
        }

    }

}