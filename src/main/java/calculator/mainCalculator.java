package calculator;
import java.util.Scanner;

public class mainCalculator {
    public static void main(String[] args) {

        // == OBJETOS ==
        Scanner sc = new Scanner(System.in); // Crea objeto para tomar input
        Calculator cal= new Calculator(); // Crea objeto para la calculadora

        // == INICIO DEL PROGRAMA ==
        int counter = 0; // Contador para contar veces que corre la clase


        // aca un WHILE. ( cuando me corra el prog )

        System.out.print("Entrar primer numero: "); // Input Primer numero
        int a= sc.nextInt();

        System.out.print("operacion (+, -, *, /): "); // Input operacion
        char operacion = sc.next().charAt(0); // variable char para input character. toma el primer caracter del input.

        System.out.print("Entrar segundo numero: "); // Input Segundo numero
        int b= sc.nextInt();

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
            // No es un caracter valido
            default:
                System.out.println("Caracter Invalido.");
        }


        System.out.println("Total = " + result ); // Normal

        // POSIBLES RESULTADOS ::

        if ( result < 0 ) {
            System.out.println("El resultado es negativo, tene cuidado!"); // Numero negativo
        }

        if ( result > 1000) {
            System.out.println("El resultado es un número grande"); // Numero grande



        // Suma al contador de while

        }
        sc.close();
    }




}
