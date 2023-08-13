package Calculadora;

import java.util.Scanner;

public class MainCalculator3 {
    public static void main(String[] args) {



        System.out.println("\nMejora de codigo");
        System.out.println("*********************************\n");

        // == OBJETOS ==
        Scanner sc = new Scanner(System.in); // Crea objeto para tomar input
//        Calculator cal= new Calculator(); // Crea objeto para la calculadora

        // == INICIO DEL PROGRAMA ==
        boolean b1 = true;

        // WHILE -> FOR.



        for (int i = 1; i < 6; i++) {

            System.out.print("\nEntrar primer numero: "); // Input Primer numero
            int a= sc.nextInt();

            System.out.print("Entrar segundo numero: "); // Input Segundo numero
            int b= sc.nextInt();

            System.out.print("operacion (+, -, *, /): "); // Input operacion
            char operacion = sc.next().charAt(0); // variable char para input character. toma el primer caracter del input.


            int result = 0; // Valor inicial de resultado para modificar luego

            switch (operacion) {
                // Suma
                case '+' -> result = Calculator.suma(a, b);

                // Resta
                case '-' -> result = Calculator.resta(a, b);

                // Multiplicacion
                case '*' -> result = Calculator.multiplicacion(a, b);

                // Division
                case '/' -> result = Calculator.division(a, b);

                // No es un caracter valido para el ejercicio
                default -> {
                    System.out.println(">>>>>\nCaracter ingresado es invalido, saliendo del programa");
                    b1 = false; // b1 deberia detener el loop.
                }
            }


            // :: POSIBLES RESULTADOS ::

            if (b1) { // Esto deberia ejecutarse si b1 aun es true.
                if (result < 0) {
                    System.out.println("\nEl resultado es negativo, tene cuidado!"); // Negative number
                } else if (result > 1000) {
                    System.out.println("\nEl resultado es un número grande"); // Large number
                } else {
                    System.out.println("Total = " + result); // Normal
                }
            }

            System.out.println("Programa corrio: " + i + " veces, quedan " + (5 - i) + " veces");
            System.out.println(); // Linea en blanco entre iteraciones



        }
        System.out.println("\n*********************************");
        System.out.println("Fin de Ejercicio 2");

        sc.close();
    }
}
