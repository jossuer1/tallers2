import java.util.Scanner;
public class jugadores {
    String nombre;
    String posicion;
    int edad;
    int numero;

    public jugadores(String nombre, String posicion, int edad, int numero) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numero = numero;
    }
    void impresion() {
        System.out.println("Nombre: " + nombre+ " Posicion: " + posicion+ " Edad: " + edad+ " Numero de camisa: " + numero);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        jugadores persona1 = new jugadores("Josue", "medio campo", 20, 23);
        persona1.impresion();
        jugadores persona2 = new jugadores("Alex", "defensa", 24, 11);
        persona2.impresion();

        System.out.print("Ingrese el Nombre del Jugador: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese la posicion del Jugador: ");
        String posicion = input.nextLine();
        System.out.print("Ingrese el Edad del Jugador: ");
        int edad = input.nextInt();
        System.out.print("Ingrese el Numero de camisa: ");
        int numero = input.nextInt();
        jugadores persona3 = new jugadores(nombre, posicion, edad, numero);
        persona3.impresion();
    }
}
