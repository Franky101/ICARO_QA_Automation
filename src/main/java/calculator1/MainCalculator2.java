package calculator1;

import java.util.Scanner;

/*
* EJERCICIO 2 de ICARO:
* Al calculadora va a seguir corriendo hasta que un operador invalido sea ingresado.
*
* Notas:
* Ingresar letras/caracteres o otros valores en los numeros va a romper le programa.
* */

public class MainCalculator2 {
    public static void main(String[] args) {



        System.out.println("\nInicio de Ejercicio 2");
        System.out.println("*********************************\n");

        // == OBJETOS ==
        Scanner sc = new Scanner(System.in); // Crea objeto para tomar input
        Calculator cal= new Calculator(); // Crea objeto para la calculadora

        // == INICIO DEL PROGRAMA ==
        boolean contin = true;

        while (contin) {

            System.out.print("\nEntrar primer numero: "); // Input Primer numero
            int a= sc.nextInt();

            System.out.print("Entrar segundo numero: "); // Input Segundo numero
            int b= sc.nextInt();

            System.out.print("operacion (+, -, *, /): "); // Input operacion
            char operacion = sc.next().charAt(0); // variable char para input character. toma el primer caracter del input.


            int result = 0; // Valor inicial de resultado para modificar luego

            switch (operacion) {
                // Suma
                case '+':
                    result = cal.suma(a, b);
                    break;
                // Resta
                case '-':
                    result = cal.resta(a, b);
                    break;
                // Multiplicacion
                case '*':
                    result = cal.multiplicacion(a, b);
                    break;
                // Division
                case '/':
                    result = cal.division(a, b);
                    break;
                // No es un caracter valido para el ejercicio
                default:
                    System.out.println(">>>>>\nCaracter ingresado es invalido, saliendo del programa");
                    contin = false; // contin deberia detener el loop.
            }
            if (contin == false) {
                break;
            }

            // :: POSIBLES RESULTADOS ::

            if (contin) { // Esto deberia ejecutarse si contin aun es true.
                if (result < 0) {
                    System.out.println("\nEl resultado es negativo, tene cuidado!"); // Negative number
                } else if (result > 1000) {
                    System.out.println("\nEl resultado es un número grande"); // Large number
                } else {
                    System.out.println("Total = " + result); // Normal
                }
            }

        }
        System.out.println("\n*********************************");
        System.out.println("Fin de Ejercicio 2");

        sc.close();
    }
}
