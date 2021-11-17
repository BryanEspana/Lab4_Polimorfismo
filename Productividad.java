/*****************************************************************************
@File Productividad.java
@Autor: Bryan Carlos Roberto España Machorro 
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 15/11/2021

Programa que tendra los metodos y las propiedades de la clase productividad.
*****************************************************************************/

public class Productividad 
{
    //Propiedades//
    public String UbicacionViaje;
    public String FechaViaje;
    public String NombrePresentacion;
    public String TextoPresentacion;
    public String TipoDia;

    //Métodos//

    //Constructor//
    public Productividad()
    {
        UbicacionViaje = null;
        FechaViaje = null;
        NombrePresentacion = null;
        TextoPresentacion = null;
        TipoDia = null;
    }

    /** 
     * @return
     */
    //Getters//
    public String getUbicacion()
    {
        return UbicacionViaje;
    }

    public String getFecha()
    {
        return FechaViaje;
    }

    public String getNombre()
    {
        return NombrePresentacion;
    }

    public String getTexto()
    {
        return TextoPresentacion;
    }

    public String getTipo()
    {
        return TipoDia;
    }

    /** 
     * @param
     */
    //Setters//
    public void setUbicacion(String UbicacionViaje)
    {
        this.UbicacionViaje = UbicacionViaje;
    }

    public void setFecha(String FechaViaje)
    {
        this.FechaViaje = FechaViaje;
    }
    
    public void setNombre(String NombrePresentacion)
    {
        this.NombrePresentacion = NombrePresentacion;
    }

    public void setTexto(String TextoPresentacion)
    {
        this.TextoPresentacion = TextoPresentacion;
    }

    public void setTipo(String TipoDia)
    {
        this.TipoDia = TipoDia;
    }
}
