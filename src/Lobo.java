import One.Canino;

public class Lobo extends Canino {
    public Lobo(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        super(foto, comida, localizacion, tamanio, edad, peso, raza);
    }

    @Override
    public void comer(){
        super.comer();
        System.out.println("Comiendo Lobo");
    }


    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Haciendo ruido Lobo");
    }
}
