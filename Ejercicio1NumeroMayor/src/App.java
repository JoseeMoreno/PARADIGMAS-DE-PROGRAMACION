//EJERCICIO 1 NUMERO MAYOR

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int num1, num2, num3;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        num1 = lector.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        num2 = lector.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        num3 = lector.nextInt();
        if (num1 == num2 || num2 == num3 || num2 == num3) {
            System.out.println("Existen numeros iguales, favor de ingresar nuevamente...");
        } else {
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("El mayor es " + num1);
                } else {
                    System.out.println("El mayor es " + num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.println("El mayor es " + num2);
                } else {
                    System.out.println("El mayor es " + num3);
                }
            }
        }
    }
}
