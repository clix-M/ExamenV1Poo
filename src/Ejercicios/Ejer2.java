package Ejercicios;

public class Ejer2 {
    public static void main(String[] args) {
        /*
        * Una empresa paga a sus vendedores un sueldo bruto que es igual a la suma de un sueldo básico de S/. 1250 más
        * una comisión que es igual a un porcentaje del monto total vendido. El porcentaje por comisión depende de la categoría del vendedor de acuerdo a la siguiente tabla:
        *
            Tabla de Categorías
        ------------x--------------------------
        Categoría	x	Porcentaje de Comisión
        ------------x--------------------------
         1          x   4.25%
         2          x   13%
         3          x   11.75%
        ------------x--------------------------


        Por otro lado, si el sueldo bruto del vendedor es mayor a S/. 3500, se efectúa un descuento igual al 15% del sueldo bruto; en caso contrario,
        *  se efectúa un descuento igual al 10% del sueldo bruto.Hacer un programa que determine el sueldo básico, la comisión,
        * el sueldo bruto, el descuento y el sueldo neto de un vendedor de la empresa.
        * */

        // Declarar la clase Vendedor
        record Vendedor(String nombre, int categoria, double montoVendido) {}

        // Crear un vendedor
        Vendedor vendedor = new Vendedor("Juan", 1, 1000);

        // Calcular el sueldo bruto
        double sueldoBruto = switch (vendedor.categoria()) {
            case 1 -> 1250 + vendedor.montoVendido() * 0.0425;
            case 2 -> 1250 + vendedor.montoVendido() * 0.13;
            case 3 -> 1250 + vendedor.montoVendido() * 0.1175;
            default -> 0;
        };

        // Calcular el descuento
        double descuento = sueldoBruto > 3500 ? sueldoBruto * 0.15 : sueldoBruto * 0.1;

        // Calcular el sueldo neto
        double sueldoNeto = sueldoBruto - descuento;


        System.out.println(
                "El sueldo neto es: " + sueldoNeto +
                        "\nEl sueldo bruto es: " + sueldoBruto +
                        "\nEl descuento es: " + descuento +
                        "\nLa comisión es: " + (sueldoBruto - 1250) +
                "\nEl sueldo básico es: " + 1250
        );


    }
}
