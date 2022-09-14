/*
 *  @(#)RutinaDeEntrenamientoInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;


/**
 * Descripcion: La interfaz mantiene los metodos 
 * para manejar objetos del tipo RutinaDeEntrenamiento.       
 *
 * @version version 2.0 Marzo 2022
 * @since   version 1.0 Mayo 2013
 * @author  Fundamentos de Programacion II
 */
public interface RutinaDeEntrenamientoInterfaz {
    
    /*
     *  Descripcion: Metodo getter del id de entrenamiento.
     */
    public String getIdEntrenamiento ();

    /*
     *  Descripcion: Metodo setter del id de entrenamiento.
     */
    public void setIdEntrenamiento (String id);

    /*
     *  Descripcion: Metodo getter de la descripcion.
     */
    public String getDescripcion ();

    /*
     *  Descripcion: Metodo setter de la descripcion.
     */
    public void setDescripcion (String id);

    /*
     *  Descripcion: Metodo getter de la frecuencia.
     */
    public int getFrecuencia ();

    /*
     *  Descripcion: Metodo setter de la frecuencia.
     */
    public void setFrecuencia( int frecuencia );

    /*
     *  Descripcion: Metodo getter de la tiempo.
     */
    public int getTiempo ();

    /*
     *  Descripcion: Metodo setter de la tiempo.
     */
    public void setTiempo( int tiempo );


}
