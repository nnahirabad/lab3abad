import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese nombre de la primera persona: ");
        String nombre1 = sc.nextLine();
        System.out.print("Ingrese la altura de la primera persona: ");
        double altura1 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Ingrese nombre de la segunda persona: ");
        String nombre2 = sc.nextLine();
        System.out.print("Ingrese la altura de la segunda persona: ");
        double altura2 = sc.nextDouble();

        String personaMasAlta;
        if (altura1 > altura2) {
            personaMasAlta = nombre1;
        } else if (altura1 < altura2) {
            personaMasAlta = nombre2;
        } else {
            personaMasAlta = "Ambas personas tienen las misma altura";
        }


        System.out.println("La persona con mas altura es:" + personaMasAlta);
        sc.close();
    }
}
