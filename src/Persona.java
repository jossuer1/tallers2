
public class Persona {
    int cedula;
    String nombre;
    int edad;
    String correo;

    public Persona(int cedula, String nombre, int edad, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    void impresion(){
        System.out.println("Bienvenido "+nombre+" con cedula "+cedula+" edad "+edad+" correo "+correo);
    }
    public static void main(String[] args) {
        Persona objeto1 = new Persona(1204693806, "Pedro", 20, "Pedro@gmail.com");
        objeto1.impresion();
        Persona objeto2 = new Persona(1234567891,"josue",20,"rojasjosue55a@gmail.com");
        objeto2.impresion();

    }
}
