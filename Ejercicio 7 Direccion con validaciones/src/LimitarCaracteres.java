import java.io.IOException;

public class LimitarCaracteres {
    public static void main(String[] args) {
        try {
            System.out.print("Ingresa un carácter: ");
            char caracter = (char) System.in.read();

            System.out.println("El carácter ingresado es: " + caracter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
