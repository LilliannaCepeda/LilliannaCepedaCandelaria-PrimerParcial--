
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Huesped> huespedes = new ArrayList();

    public static void main(String[]args){

        int opcion;

        do{

            System.out.println("===============MENU===============");
            System.out.println("\n1. Registrar usuario");
            System.out.println("2. Listado de huspedes");
            System.out.println("3. Buscar husped por numero de identificacion");
            System.out.println("4. Registrar habitaciones disponibles");
            System.out.println("5. Reservacion para husped");
            System.out.println("6. Mostrar historial de reservas");
            System.out.println("7. Calcular y mostrar el monto total acumulado de las reservas");
            System.out.println("8. Guardar informacion en archivo");
            System.out.println("9. Cargar informacion desde un archivo");
            System.out.println("10. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){

                case 1:
                    OpcionesMenu.registrarHuesoed(scanner, huespedes);
                    break;

                case 2: 
                    OpcionesMenu.mostrarListado(huespedes);

                case 8: 
                    OpcionesMenu.guardarEnArchivo(huespedes);
                
            }

        }while(opcion != 10);

        

    }
}