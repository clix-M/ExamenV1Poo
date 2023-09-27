import One.Canino;

public class Perro extends Canino {
    public Perro(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        super(foto, comida, localizacion, tamanio, edad, peso, raza);
    }

    public void vacunar(){
        System.out.println("Vacunando");
    }

    public void hacerPaseo(){
        System.out.println("Paseando");
    }
}
