
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OpcionesMenu{

//metodos de menu de opciones

    public static void registrarHuesoed(Scanner scanner, ArrayList<Huesped> huespedes){

        System.out.println("\n=========Registrar huesped=========");

        System.out.print("\nDigite el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Digite el numero de identificacion: ");
        String numId = scanner.nextLine();

        System.out.print("Digite el numero de cedula");
        String cedula = scanner.nextLine(); 

        try{

            Validar.validarNombre(nombre);
            Validar.validarNumId(numId);
            Validar.validarCedula(cedula);

            Huesped huesped = new Huesped(nombre, numId, cedula);

            huespedes.add(huesped);

            System.out.println("El huesped se ha registrado con exito!");


        }catch(CampoVacioException e){
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarListado(ArrayList<Huesped> huespedes){

        System.out.println("\n=========Listado De Huespedes=========");

        for(Huesped huesped: huespedes){

            System.out.println("Nombre: " + huesped.getNombre());
            System.out.println("Numero de identificacion: " + huesped.getNumId());
            System.out.println("Cedula: " + huesped.getCedula());
            System.out.println();
        }
    }

      //public static void buscarPorNumId(Scanner scanner, ArrayList<Huesped> huespedes){

        //System.out.print("Digite el numero de identificacion: ");
        //String numIdBuscado = scanner.nextLine();

        //boolean encontrado = false;

       
            //while(numIdBuscado.equalsIgnoreCase(huesped.getNumId() && !econtrado)){

                //System.out.println("Nombre: " + huesped.getNombre());
                //SYstem
            //}

    //

    public static void guardarEnArchivo(ArrayList<Huesped> huespedes){

        try{
             FileWriter fileWriter = new FileWriter("Huesped.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

             for(Huesped huesped : huespedes){

                bufferedWriter.write("Nombre: " + huesped.getNombre());
                bufferedWriter.write("Cedula: " + huesped.getCedula());
                bufferedWriter.write("Numero de identificacion: " +huesped.getNumId());
             }

             bufferedWriter.newLine();


        }catch(IOException e){

        }

        
    }
}