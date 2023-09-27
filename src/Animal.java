package One;

import java.util.Date;

public class Animal {
    private  String foto;
    private  String comida;
    private String localizacion;
    private String tamanio;
    private int edad;
    private double peso;
    private String raza;

    public Animal(String foto, String comida, String localizacion, String tamanio, int edad, double peso, String raza) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamanio = tamanio;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public void hacerRuido(){
        System.out.println("Haciendo ruido");
    }

    public void comer(){
        System.out.println("Comiendo");
    }

    public void dormir(){
        System.out.println("Durmiendo");
    }

    public void caminar(){
        System.out.println("Caminando");
    }
}
