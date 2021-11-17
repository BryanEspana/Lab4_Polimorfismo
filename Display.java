/**********************************************************************
@File Vista.java
@Autor: Bryan Carlos Roberto España Machorro 
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 15/11/2021

Programa que mostrará a los usuarios el menú de opciones para las 
funcionalidades del radio de su carro.
**********************************************************************/

import java.util.Scanner;

public class Display 
{
    Scanner scan = new Scanner(System.in);
    Radio radio = new Radio();
    Reproduccion repro = new Reproduccion();

    public void Bienvenida()
    {
    System.out.println("                        ╔═════════════════════════╗  \n" +
                       "                        ║     Bienvenido a tu     ║  \n" +
                       "                        ║      Mercedes-Benz      ║      \n" +      
                       "                        ╚═════════════════════════╝         ");
    }
    
    public int Menu()
    {
        int opciones;
		String meniu = "   ╔══════════╗   ╔═══════════════════╗ ╔═════════════╗  ╔════════════════════╗   \n" +
                       "   ║  1.Radio ║   ║   2.Reproducción  ║ ║  3.Celular  ║  ║   4.Productividad  ║ \n" +     
                       "   ╚══════════╝   ╚═══════════════════╝ ╚═════════════╝  ╚════════════════════╝ \n "+
                               "         Ingrese un numero del 1 al 4 para elegir su funcion\n" +
                               "                  Ingrese el numero 5 para apagar";
		System.out.println(meniu);
		opciones = scan.nextInt();
		
		return opciones;
    }

    public void RadioMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Radio");
            System.out.println("1. Cambiar de FM a AM");
            System.out.println("2. Cambiar emisoras");
            System.out.println("3. Guardar emisoras");
			System.out.println("4. Cargar emisora");
			System.out.println("5. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Cambiar de FM a AM\n");
                    radio.TipoRadio();
                    break;
                case 2:
					System.out.println("Cambiar emisoras\n");
					radio.CambiarEmisora();
                    break;
                case 3:
					System.out.println("Guardar emisoras\n");
                    radio.GuardarEmisora();
                    break;
				case 4:
					System.out.println("Cargar emisora\n");
                    radio.CargarEmisora();
                    break;
				case 5:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }
    
    public void ReproduccionMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Reproduccion");
            System.out.println("1. Seleccionar lista de reproducción");
            System.out.println("2. Cambiar cancion");
            System.out.println("3. Escuchar cancion");
			System.out.println("4. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Seleccionar lista de reproducción\n");
                    repro.ListaReproduccion();
                    break;
                case 2:
					System.out.println("Cambiar cancion\n");
					repro.CambiarCancion();
                    break;
                case 3:
					System.out.println("Escuchar cancion\n");
                    repro.escucharCancion();
                    break;
				case 4:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void CelularMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Celular");
            System.out.println("1. Conectar/Desconectar telefono");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Llamar a contacto");
			System.out.println("4. Finalizar llamada");
            System.out.println("5. Cambiar a bocinas o auriculares ");
            System.out.println("6. Llamar al ultimo contacto con el que se habló");
            System.out.println("7. Cambiar a llamada en espera");
			System.out.println("8. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Conectar/Desconectar telefono\n");
                    
                    break;
                case 2:
					System.out.println("Mostrar contactos\n");
					
                    break;
                case 3:
					System.out.println("Llamar a contacto\n");
                    
                    break;
				case 4:
					System.out.println("Finalizar llamada\n");
                    
                    break;
                case 5:
					System.out.println("Cambiar a bocinas o auriculares\n");
                    
                    break;    
                case 6:
					System.out.println("Llamar al ultimo contacto con el que se hablo\n");
                    
                    break;
                case 7:
					System.out.println("Cambiar a llamada en espera\n");
                    
                    break;
                case 8:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void ProductividadMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nModo Productividad");
            System.out.println("1. Planificar viajes");
            System.out.println("2. Ver tarjetas de presentacion");
            System.out.println("3. Ver pronostico de tiempo");
			System.out.println("4. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Planificar viajes\n");
                    
                    break;
                case 2:
					System.out.println("Ver tarjetas de presentacion\n");
					
                    break;
                case 3:
					System.out.println("Ver pronostico de tiempo\n");
                    
                    break;
				case 4:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void Error()
	{
		System.out.println("\nHa elegido una opcin invalida.\n");
	}
    
    public void despedida()
	{
		System.out.println("\nAdios, que tenga feliz dia!\n");
	}
}
