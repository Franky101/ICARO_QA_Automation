package Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehiculo toyo = new Vehiculo("Toyota", "Corolla", 2020);
        Coche ford = new Coche("Ford","Mustang",2021,5000);

        // Toyota
        System.out.println("Marca: " + toyo.getMarca());
        System.out.println("Modelo: " + toyo.getModelo());
        System.out.println("Anio: " + toyo.getAnio());

        toyo.acelerar();

        // Ford
        System.out.println("Marca: " + ford.getMarca());
        System.out.println("Modelo: " + ford.getModelo());
        System.out.println("Anio: " + ford.getAnio());
        System.out.println("Marca: " + ford.getCilindrada());

        ford.acelerar();

    }
}
