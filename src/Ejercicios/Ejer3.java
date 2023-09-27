package Ejercicios;

public class Ejer3 {
    public static void main(String[] args) {

        /*
        Se desea calcular el sueldo de un trabajador, a partir de las horas trabajadas en la semana y la clase a la que pertenece:
        Trabajadores Clase “A”, se les paga 25 soles por hora. Trabajadores clase “B”, se paga 20 soles por hora. Trabajadores clase “C”,
        se les paga 15 soles por hora y los de clase “D”, 10 soles por hora.
         */

        // Declarar variables
        int horasTrabajadas = 0;
        int sueldo = 0;
        String clase = "A";

        // Calcular el sueldo
        switch (clase) {
            case "A" -> sueldo = 25 * horasTrabajadas;
            case "B" -> sueldo = 20 * horasTrabajadas;
            case "C" -> sueldo = 15 * horasTrabajadas;
            case "D" -> sueldo = 10 * horasTrabajadas;
            default -> System.out.println("Clase no válida");
        }


        // Mostrar el sueldo con un ejemplo
        System.out.println("El sueldo es: " + sueldo);

















    }
}
