package C6_Herencias_Vehiculo;

public class Coche extends Vehiculo {

    private int cilindrada;
    public Coche(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("El coche esta acelerando\n");
    }
    /*public void frenar() {
        System.out.println("El coche esta frenando");
    }
     */

}
