public class Itool{

    //atributos
    private String nombre;
    private double porcentaje;

    //constructor
    public Itool(String nombre, double porcentaje){
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getName(){
        return nombre;
    }
    public double getporcentaje(){
        return porcentaje;
    }
    
    @Override
    public String toString(){
        return""+nombre+""+porcentaje+"%";
    }
}