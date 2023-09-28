package Ejercicios;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        /*
        Un comerciante se dedica a la venta de sillas únicamente. Vende tres tipos de sillas: tipo A, tipo B y Tipo C los precios son 20,
        35 y 50 soles respectivamente cada silla. Por cada cinco sillas compradas del tipo A, del tipo B o del tipo C los clientes reciben un
        descuento de 3%, 5% y 7%, las demás se cobran a precio normal.
        Hacer un programa para ingresar el tipo de Sillas a comprar, el número de sillas y reportar el importe a pagar.   --> usar Scanner para la entrada de datos
         */

        // Declarar variables
        int tipoSilla = 0;
        int cantidadSillas = 0;
        double precioSilla = 0;
        double descuento = 0;
        double importe = 0;

        // capturar los datos con Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de silla: A = 1, B = 2, C = 3");
        tipoSilla = sc.nextInt();
        System.out.println("Ingrese la cantidad de sillas: ");
        cantidadSillas = sc.nextInt();


        // Calcular el importe
        switch (tipoSilla) {
            case 1 -> {
                precioSilla = 20;
                importe = precioSilla * cantidadSillas;
                if (cantidadSillas >= 5) {
                    descuento = importe * 0.03;
                    importe -= descuento;
                }
            }
            case 2 -> {
                precioSilla = 35;
                importe = precioSilla * cantidadSillas;
                if (cantidadSillas >= 5) {
                    descuento = importe * 0.05;
                    importe -= descuento;
                }
            }
            case 3 -> {
                precioSilla = 50;
                importe = precioSilla * cantidadSillas;
                if (cantidadSillas >= 5) {
                    descuento = importe * 0.07;
                    importe -= descuento;
                }
            }
            default -> System.out.println("Tipo de silla no válido");
        }

        // Mostrar el importe 

        System.out.println("El importe es: " + importe);

        // Mostrar el descuento
        System.out.println("El descuento es: " + descuento);

        // Mostrar el precio de la silla
        System.out.println("El precio de la silla es: " + precioSilla);

        // Mostrar la cantidad de sillas
        System.out.println("La cantidad de sillas es: " + cantidadSillas);

        // Mostrar el tipo de silla -
        System.out.println("El tipo de silla es: " + tipoSilla);



    }
}
