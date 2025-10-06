import java.util.Scanner;
public class Empleados {
    String nombre;
    String cargo;
    int salario;
    int dia;
    int mes;
    int anio;

    public Empleados(String nombre, String cargo, int salario, int dia, int mes,int anio) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public void impresion() {
        System.out.printf("Nombre: "+nombre+" Cargo: "+cargo+" Salario $: "+salario+"\nFECHA DE INGRESO\n"+"Dia: "+dia+" Mes: "+mes+" Anio: "+anio+"\n");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("?Cuantos empleados quieres agregar?: ");
        int cantidad = input.nextInt();


        for (int i = 0; i < cantidad; i++) {
            input.nextLine();
            System.out.print("Ingrese el Nombre del Empleado "+(i+1)+" : ");
            String nombre = input.nextLine();
            System.out.print("Ingrese el Cargo: ");
            String cargo = input.nextLine();
            System.out.print("Ingrese el Salario $: ");
            int salario = input.nextInt();
            System.out.printf("INGRESO FECHA DE INGRESO (EN NUMEROS)\n");
            System.out.print("Ingrese el Dia: ");
            int dia = input.nextInt();
            System.out.print("Ingrese el Mes: ");
            int mes = input.nextInt();
            System.out.print("Ingrese el Anio: ");
            int anio = input.nextInt();

            Empleados empleado = new Empleados(nombre, cargo, salario, dia, mes, anio);
            empleado.impresion();
        }
    }
}
