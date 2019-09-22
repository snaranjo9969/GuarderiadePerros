

/**
 * Core del Programa
 *
 * @author (Snaranjo)
 * @version (2_20190908)
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Core
{
    private static List<Perros> basedatos = new ArrayList <>();
    private static Scanner entrada=new Scanner (System.in);
    private static int contador;
    public static void Todos ()
    {
        System.out.print("\n");
        for (contador=0;contador<basedatos.size();contador++)
        {
            Perros mascota=basedatos.get(contador);
            System.out.println("__________________________________________________________________");
            System.out.println("ID");
            System.out.println("Nombre del Perro: "+mascota.InfPerro());
            System.out.println("Raza del Perro: "+mascota.InfRaza());
            System.out.println("Localidad: "+mascota.InfLocalidad());
            System.out.println("Cedula del dueño: "+mascota.InfCedula());
            System.out.println("Nombre del dueño: "+mascota.InfNombre());
            System.out.println("Telefono: "+mascota.InfTelefono());
            System.out.println("dia para recogerlo: "+mascota.InfDia());
            
            
        }
         System.out.println("__________________________________________________________________");
    }
    
    public static void Unperro ()
    {
        System.out.print("\n");
        String buscar;
        System.out.print("Digite el Nombre del Perro: ");
        buscar=entrada.next();
        
        for (Perros mascota:basedatos)
        {
            if (mascota.InfPerro().equalsIgnoreCase(buscar))
            {
            System.out.println("__________________________________________________________________");
            System.out.println("ID");
            System.out.println("Nombre del Perro: "+mascota.InfPerro());
            System.out.println("Raza del Perro: "+mascota.InfRaza());
            System.out.println("Localidad: "+mascota.InfLocalidad());
            System.out.println("Cedula del dueño: "+mascota.InfCedula());
            System.out.println("Nombre del dueño: "+mascota.InfNombre());
            System.out.println("Telefono: "+mascota.InfTelefono());
            System.out.println("dia para recogerlo: "+mascota.InfDia()); 
            }
        }
         System.out.println("__________________________________________________________________");
    }
    
    public static void Basesimulada ()
    {
      
    Perros mascota = new Perros ("Sasha", "Chow Chow", "Suba", "1054785474", "Natalia Mejia", "3213035465", "Martes");
    basedatos.add (mascota);
    Perros mascota1 = new Perros ("Niko", "Puddle", "Usaquen", "1014547574", "Veronica Osorio", "3154785985", "Jueves");
    basedatos.add (mascota1);
    Perros mascota2 = new Perros ("Fido", "Chihuahua", "Teusaquillo", "14547547", "Victor Suarez", "3144785787", "Jueves");
    basedatos.add (mascota2);
     Perros mascota3 = new Perros ("Firulais", "Foxhound", "Suba", "1054785474", "Natalia Ospina", "3213035465", "Martes");
    basedatos.add (mascota3);
    Perros mascota4 = new Perros ("Nanny", "Boxer", "Chapinero", "1014547574", "Veronica Osorio", "3154785985", "Miercoles");
    basedatos.add (mascota4);
    Perros mascota5 = new Perros ("Claws", "Terrier", "Usaquen", "101474578", "Mateo Henao", "3155457898", "Viernes");
    basedatos.add (mascota5);
    Perros mascota6 = new Perros ("Toby", "Chihuahua", "Teusaquillo", "34545678", "Oscar Perez", "3198788745", "Jueves");
    basedatos.add (mascota6);
     Perros mascota7 = new Perros ("Negro", "Foxhound", "Suba", "45857564", "Nikolas Suarez", "3223455547", "Martes");
    basedatos.add (mascota7);
    Perros mascota8 = new Perros ("Zeus", "Boxer", "Chapinero", "10858789874", "Stiven Valencia", "3185778989", "Miercoles");
    basedatos.add (mascota8);
    Perros mascota9 = new Perros ("Killer", "Terrier", "Usaquen", "10895875858", "Clauda Ortiz", "3196546887", "Viernes");
    basedatos.add (mascota9);
    System.out.println ("Base de datos de prueba con 10 perros y sus dueños fueron cargados exitosamente ");
            
    }    
    
    public static void Ingreso ()
    {
    String id;
    String perro;
    String raza;
    String localidad;
    String cedula;
    String nombre;
    String telefono;
    String dia;
    
    System.out.print ("Ingrese el Nombre del Perro: ");
    perro=entrada.nextLine();
    System.out.print ("Ingrese la Raza del Perro: ");
    raza=entrada.nextLine();
    System.out.print ("Ingrese la Localidad: ");
    localidad=entrada.nextLine();
    System.out.print ("Ingrese la Cedula del Dueño: ");
    cedula=entrada.nextLine();
    System.out.print ("Ingrese el Nombre del Dueño: ");
    nombre=entrada.nextLine();
    System.out.print ("Ingrese el Telefono: ");
    telefono=entrada.nextLine();
    System.out.print ("Ingrese el Dia para recogerlo: ");
    dia=entrada.nextLine();
    
    Perros mascota = new Perros (perro, raza,localidad, cedula, nombre, telefono, dia);
    basedatos.add (mascota);
    
    System.out.println ("Los datos fueron guardados exitosamente ");
    }
    public static void Unalocalidad ()
    {
        System.out.print("\n");
        String buscar;
        System.out.print("Digite el Nombre de la Localidad: ");
        buscar=entrada.next();
        
        for (Perros localidad:basedatos)
        {
            if (localidad.InfLocalidad().equalsIgnoreCase(buscar))
            {
            System.out.println("__________________________________________________________________");
            System.out.println("ID");
            System.out.println("Nombre del Perro: "+localidad.InfPerro());
            System.out.println("Raza del Perro: "+localidad.InfRaza());
            System.out.println("Localidad: "+localidad.InfLocalidad());
            System.out.println("Cedula del dueño: "+localidad.InfCedula());
            System.out.println("Nombre del dueño: "+localidad.InfNombre());
            System.out.println("Telefono: "+localidad.InfTelefono());
            System.out.println("dia para recogerlo: "+localidad.InfDia()); 
            }
        }
         System.out.println("__________________________________________________________________");
    }    
}