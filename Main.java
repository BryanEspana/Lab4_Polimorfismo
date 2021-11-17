/**
@File Driver.java 
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 14/11/2021

Driver program que servira como controlador e implementa el menú 
de opciones para el funcionamiento del radio del carro. 
**/

package main;

public class Main 
{

    public static void main(String[] args) 
    {
        
        Vista vista = new Vista();
        vista.Bienvenida();
        vista.ClasesCarros();
        int opcion = 0;

        while (opcion != 5)
        {
            opcion = vista.Menu();

            if (opcion == 1)
            {
                //Radio
                vista.RadioMenu();
            }

            else if (opcion == 2)
            {
                //Reproduccion
                vista.ReproduccionMenu();
            }

            else if (opcion == 3)
            {
                //Celular
                vista.CelularMenu();
            }

            else if (opcion == 4)
            {
                //Productividad
                vista.ProductividadMenu();
            }

            else if (opcion == 5)
            {
                //Salir
                vista.despedida();
            }

            else
            {
                vista.Error();
            }
        }
    }

}