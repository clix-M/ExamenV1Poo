package One;

import One.Animal;

public class Felino extends Animal {
    public Felino(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        super(foto, comida, localizacion, tamanio, edad, peso, raza);
    }

    public void rugir(){
        System.out.println("Rugido");
    }
}
