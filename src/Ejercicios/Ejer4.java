package Ejercicios;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        /*
        Un comerciante se dedica a la venta de sillas únicamente. Vende tres tipos de sillas: tipo A, tipo B y Tipo C los precios son 20,
        35 y 50 soles respectivamente cada silla. Por cada cinco sillas compradas del tipo A, del tipo B o del tipo C los clientes reciben un
        descuento de 3%, 5% y 7%, las demás se cobran a precio normal.
        Hacer un programa para ingresar el tipo de Sillas a comprar, el número de sillas y reportar el importe a pagar.
         */


        // Declarar la clase Silla
        record Silla(String tipo, int cantidad) {}


        // Crear un Scanner
        Scanner scanner = new Scanner(System.in);

        // Leer el tipo de silla
        System.out.print("Ingrese el tipo de silla: ");
        String tipo = scanner.nextLine();

        // Leer la cantidad de sillas
        System.out.print("Ingrese la cantidad de sillas: ");
        int cantidad = scanner.nextInt();

        // Crear una silla
        Silla silla = new Silla(tipo, cantidad);

        // Calcular el importe a pagar
        double importe = switch (silla.tipo()) {
            case "A" -> silla.cantidad() * 20 * (silla.cantidad() / 5 >= 1 ? 0.97 : 1);
            case "B" -> silla.cantidad() * 35 * (silla.cantidad() / 5 >= 1 ? 0.95 : 1);
            case "C" -> silla.cantidad() * 50 * (silla.cantidad() / 5 >= 1 ? 0.93 : 1);
            default -> 0;
        };

        // Mostrar el importe a pagar
        System.out.println("El importe a pagar es: " + importe);



    }
}
