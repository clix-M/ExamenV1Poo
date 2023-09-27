package One;

import One.Animal;

public class Canino extends Animal {
    public Canino(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        super(foto, comida, localizacion, tamanio, edad, peso, raza);
    }

    public void grunir(){
        System.out.println("Grunido");
    }
}
