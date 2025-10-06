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
        jugadores persona1 = new jugadores("Josue", "medio campo", 20, 23);
        persona1.impresion();
        jugadores persona2 = new jugadores("Alex", "defensa", 24, 11);
        persona2.impresion();
        jugadores persona3 = new jugadores("Daniel", "delantero", 17, 9);
        persona3.impresion();
    }
}
