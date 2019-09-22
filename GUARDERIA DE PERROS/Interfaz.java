
/**
 * UI interfaz del Usuario
 *
 * @author (Snaranjo)
 * @version (2_20190908)
 */
import java.util.Scanner;


public class Interfaz
{
    
    private static Scanner entrada=new Scanner (System.in);
    
    public static void main (String[] args)
    {
     int opcion=22;              
     System.out.println ("                      @@@@@@@@");
     System.out.println ("               @@@@@@@        @@@@@@@@@");
     System.out.println ("             @@                        @@@@");
     System.out.println ("            @@                             @@");
     System.out.println ("           @                                  @@");
     System.out.println ("           @@                                   @@");
     System.out.println ("          @@  @@                      @@          @@");
     System.out.println ("        @@  @@   @@@@         @@@@    @@          @@@@");
     System.out.println ("      @@   @@  @@@@  @@     @@@@  @@ @@             @@@");
     System.out.println ("      @@   @@    @@@@         @@@@   @@               @@");
     System.out.println ("      @@   @@                        @@               @@");
     System.out.println ("      @@    @@                       @@             @@");
     System.out.println ("        @@  @@    @@@@@@             @@           @@@");
     System.out.println ("        @@  @@  @@      @@           @@         @@");
     System.out.println ("        @@  @@  @@      @@           @@       @@");
     System.out.println ("          @@@@    @@@@@@             @@@@    @@@@");
     System.out.println ("          @@@@                     @@  @@    @@@");
     System.out.println ("           @@ @@@@@@@@@@@@     @@@@      @@@@ @@");
     System.out.println ("             @@   @@      @@@@@               @@");
     System.out.println ("             @@     @@@@@@@                    @@");
     System.out.println ("             @@                                @@");
     System.out.println ("            @@                                 @@");
     System.out.println ("            @@                                 @@");
     System.out.println ("            @@                                   @");
     System.out.println ("            @@                                   @@");
     System.out.println ("          @@                         @@           @");
     System.out.println ("          @@          @@           @@             @@");
     System.out.println ("        @@  @@        @@         @@               @@");
     System.out.println ("      @@    @@          @@       @@               @@");
     System.out.println ("      @@    @@            @@   @@                 @@");
     System.out.println ("    @@      @@             @@ @@       @@         @@");
     System.out.println ("    @@      @@        @@    @@@        @@         @@");
     System.out.println ("    @@      @@        @@    @@@       @@          @@");
     System.out.println ("    @@      @@        @@               @@          @@");
        
     int flag = 0;    
     while(opcion!=5)
     {
      System.out.println("");
      System.out.println ("\nEscoja una de las siguientes opciones: ");
      System.out.println("0.Cargue una Base de datos de 10 perros para agilizar la prueba del programa");
      System.out.println("1.Ingresar nuevo Perro");
      System.out.println("2.Buscar un Perro por nombre");
      System.out.println("3.Buscar Perro Por Localidad");
      System.out.println("4.Mostrar todos los Perros ");
      System.out.println("5. Salir ");
      System.out.print("INGRESE LA OPCION: ");
      System.out.println("");
      opcion=entrada.nextInt();

      switch(opcion)
      {
            case 0: //Cargar Una Base de Prueba con 10 perros
            {
            if (flag != 1){
                flag = 1;
                Core.Basesimulada();
            }else{
            System.out.print("Su Base con 10 perros ya habia sido cargada, no es necesario cargar los mismos registros, si desea cargar mas perros puede proceder manualmente con la opcion 1");                
            }
         }           
         break;   
            case 1: //Agregar un Perro
            {
            Core.Ingreso();
         } 
         break; 
            case 2: //Mostrar un Perro especifico
            {
            Core.Unperro();
         } 
         break;
            case 3: //Buscar todos los perros de una Localidad
            {
            Core.Unalocalidad();
         } 
         break;
            case 4: //imprimir toda la base de datos
            {
            Core.Todos();
         } 
         break;
         
                    
      }
     }    
    }
}
