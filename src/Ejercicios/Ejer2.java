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

        // Declarar variables
        int categoria = 1;
        double sueldoBasico = 1250;
        double comision = 0;
        double sueldoBruto = 0;
        double descuento = 0;
        double sueldoNeto = 0;
        double montoTotalVendido = 0;

        // Calcular la comisión
        switch (categoria) {
            case 1 -> comision = montoTotalVendido * 0.0425;
            case 2 -> comision = montoTotalVendido * 0.13;
            case 3 -> comision = montoTotalVendido * 0.1175;
            default -> System.out.println("Categoría no válida");
        }

        // Calcular el sueldo bruto

        sueldoBruto = sueldoBasico + comision;

        // Calcular el descuento
        if (sueldoBruto > 3500) {
            descuento = sueldoBruto * 0.15;
        } else {
            descuento = sueldoBruto * 0.1;
        }

        // Calcular el sueldo neto
        sueldoNeto = sueldoBruto - descuento;

        // Mostrar el sueldo , mostrar categoría con un ejemplo

        System.out.println("El sueldo neto es: " + sueldoNeto);


    }
}
