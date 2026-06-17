public class Huesped{

    private String nombre;
    private String numId;
    private String cedula;
    
    
    public Huesped(){

    }

    public Huesped(String nombre, String numId, String cedula){

    }

    public String getNombre(){
        return nombre;
    }

    public String getNumId(){
        return numId;
    }

    public String getCedula(){
        return cedula;
    }

    public void getNombre(String nombre){
        this.nombre = nombre;
    }

    public void getNumId(String numId){
        this.numId = numId;
    }

    public void getCedula(String cedula){
        this.cedula = cedula;
    }
   

}