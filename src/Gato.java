import One.Felino;

public class Gato extends Felino {
    public Gato(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        super(foto, comida, localizacion, tamanio, edad, peso, raza);
    }

    public void vacunar(){
        System.out.println("Vacunando");
    }
}
