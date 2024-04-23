import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalFactura = 0.0;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Ingrese el precio unitario del art N" + i + ": ");
            double preUnitario = sc.nextDouble();
            System.out.print("Ingrese la cantidad comprada :");
            int cantidad = sc.nextInt();

            double subtotal = preUnitario * cantidad;
            totalFactura += subtotal;



        }

        System.out.println("La factura total es: " + totalFactura);
        sc.close();
    }
}
