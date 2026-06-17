public class Validar{

    public static void validarNombre(String nombre)throws CampoVacioException{

        if(nombre.isEmpty()){
            throw new CampoVacioException("Error: Este campo esta vacio");
        }
    }

    public static void validarNumId( String numId)throws CampoVacioException{

         if(numId.isEmpty()){
            throw new CampoVacioException("Error: Este campo esta vacio");
        }

    }

    public static void validarCedula(String cedula)throws CampoVacioException{

        if(cedula.isEmpty()){
            throw new CampoVacioException("Error: Este campo esta vacio");
        }
    }

}