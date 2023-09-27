import One.Felino;

public class Leon extends Felino {
    public Leon(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        super(foto, comida, localizacion, tamanio, edad, peso, raza);
    }

    @Override
    public void comer() {
        super.comer();
            System.out.println("Comiendo Leon");

    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Haciendo ruido Leon");
    }
}
