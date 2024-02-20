import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Set<String> conjunto = new HashSet<>();
        // conjunto.add('a');

        System.out.println("Ejercicio 2: ");
        Scanner lector = new Scanner(System.in);
        String Palabra;
        System.out.println("Ingresa una palabra: ");
        Palabra = lector.next();
        String palabramin = Palabra.toLowerCase();
        char[] chars = palabramin.toCharArray();
        int cant = chars.length;
        int cont = 0;
        for (int i = 0; i < cant; i++) {
            if (chars[i] == 'a' || chars[i] == 'A' ||
                    chars[i] == 'e' || chars[i] == 'E' ||
                    chars[i] == 'i' || chars[i] == 'I' ||
                    chars[i] == 'o' || chars[i] == 'O' ||
                    chars[i] == 'u' || chars[i] == 'U') {

                cont++;
            }
        }
        System.out.println("La cantidad de vocales dentro de la palabra " + Palabra + " es: " + cont);
    }
}
