/*
 *  @(#)TelefonoInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;

import  fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

/**
 * Descripcion: La interfaz mantiene los metodos 
 * para manejar objetos del tipo Teléfono.     
 *
 * @version version 2.0 Marzo 2022
 * @since   version 1.0 Mayo 2013
 * @author  Fundamentos de Programacion II
 */
public interface TelefonoInterfaz{

    /**
     * Descripcion: Devuelve el valor del telefono.
     */
    public String getTelefono();

    /**
     * Descripcion: Asigna un valor del telefono.
     */
    public void setTelefono( String telefono )  throws TelefonoIncorrectoExcepcion ;


}
