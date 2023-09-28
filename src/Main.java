

public class Main {
    public static void main(String[] args) {

        // mostrar el uso de la herencia

        // Crear un objeto de la clase Perro
        Perro perro = new Perro("foto", "comida", "localizacion", "tamanio", 1, 1.0, "raza");

        // Crear un objeto de la clase Gato
        Gato gato = new Gato("foto", "comida", "localizacion", "tamanio", 1, 1.0, "raza");

        // Invocar los métodos de la clase Perro
        System.out.println("clase Perro");
        perro.hacerPaseo();
        perro.vacunar();
        System.out.printf("\n");

        // Invocar los métodos de la clase Gato
        gato.vacunar();

        // mostrar el uso de la polimorfismo (override)
        // Crear un objeto de la clase Leon
        Leon leon = new Leon("foto", "comida", "localizacion", "tamanio", 1, 1.0, "raza");

        // Crear un objeto de la clase Tigre
        Tigre tigre = new Tigre("foto", "comida", "localizacion", "tamanio", 1, 1.0, "raza");

        // Crear un objeto de la clase Lobo
        Lobo lobo = new Lobo("foto", "comida", "localizacion", "tamanio", 1, 1.0, "raza");

        // Invocar los métodos de la clase Leon
        leon.comer();
        leon.hacerRuido();

        // Invocar los métodos de la clase Tigre
        tigre.comer();
        tigre.hacerRuido();

        // Invocar los métodos de la clase Lobo
        lobo.comer();
        lobo.hacerRuido();







    }
}