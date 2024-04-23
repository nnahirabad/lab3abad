import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Ingrese el primer numero");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero");
        numero2 = scanner.nextInt();

        var suma = numero1 + numero2;
        var resta = numero1 - numero2;
        var multiplicacion = numero1 * numero2;
        var division = numero1 / numero2;

        System.out.println("La suma de los numeros ingresados es: " + suma);
        System.out.println("La resta de los numeros ingresados es: " + resta);
        System.out.println("La multiplic entre los numeros ingresados es: " + multiplicacion);
        System.out.println("La division de los numeros ingresados es: " + division);

        scanner.close();






    }
}

