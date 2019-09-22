
/**
 * Constructor.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Perros
{
    private String perro;
    private String raza;
    private String localidad;
    private String cedula;
    private String nombre;
    private String telefono;
    private String dia;
        
    public Perros (String perroc, String razac, String localidac, String cedulac, 
                      String nombrec, String telefonoc, String diac )
    {
       this.perro=perroc; 
       this.raza=razac;
       this.localidad=localidac;
       this.cedula=cedulac;
       this.nombre=nombrec;
       this.telefono=telefonoc;
       this.dia=diac;
    }
    
    public String InfPerro ()
    {
        return this.perro;
    }
    
    public String InfRaza()
    {
        return this.raza;
    }
    
    public String InfLocalidad ()
    {
        return this.localidad;
    }
    
    public String InfCedula ()
    {
        return this.cedula;
    }
     public String InfNombre ()
    {
        return this.nombre;
    }
     public String InfTelefono ()
    {
        return this.telefono;
    }
     public String InfDia ()
    {
        return this.dia;
    }
}
