package C6_Herencias_Vehiculo;


public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAnio() {
        return this.anio;
    }

    public void acelerar() {
        System.out.println("El Vehiculo acelera\n");
    }
    public void frenar() {
        System.out.println("El Vehiculo frena\n");
    }
}


