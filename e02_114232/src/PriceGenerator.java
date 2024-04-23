import java.util.Scanner;
public class PriceGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el precio de su articulo");
        double precioSinIva =sc.nextDouble();

        double iva = 0.21;

        double precioConIva = precioSinIva * (1+iva);
        System.out.println("El precio del articulo con Iva es: "+precioConIva);

        sc.close();

    }
}
