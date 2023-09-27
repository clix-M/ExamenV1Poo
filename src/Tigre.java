import One.Felino;

import java.util.function.Function;

public class Tigre extends Felino {
    public Tigre(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        super(foto, comida, localizacion, tamanio, edad, peso, raza);
    }

    @Override
    public void comer() {
        super.comer();
            System.out.println("Comiendo Tigre");
    }


    @Override
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Haciendo ruido Tigre");
    }

   // crear una funcion anonima
    Function<String, String> funcion = (String nombre) -> { return "Hola " + nombre; };



}
