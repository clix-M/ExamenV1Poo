package Ejercicios;

public class Ejer3 {
    public static void main(String[] args) {

        /*
        Se desea calcular el sueldo de un trabajador, a partir de las horas trabajadas en la semana y la clase a la que pertenece:
        Trabajadores Clase “A”, se les paga 25 soles por hora. Trabajadores clase “B”, se paga 20 soles por hora. Trabajadores clase “C”,
        se les paga 15 soles por hora y los de clase “D”, 10 soles por hora.
         */

        // Declarar la clase Trabajador
        record Trabajador(String nombre, int horasTrabajadas, char clase) {}



        // Crear un trabajador
        Trabajador trabajador = new Trabajador("Juan", 40, 'A');


        // Calcular el sueldo
        double sueldo = switch (trabajador.clase()) {
            case 'A' -> trabajador.horasTrabajadas() * 25;
            case 'B' -> trabajador.horasTrabajadas() * 20;
            case 'C' -> trabajador.horasTrabajadas() * 15;
            case 'D' -> trabajador.horasTrabajadas() * 10;
            default -> 0;
        };


        // Mostrar el sueldo
        System.out.println("El sueldo es: " + sueldo);

















    }
}
