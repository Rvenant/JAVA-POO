

/** 
 *  @(#)DniInterfaz .java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */
 
package fp2.poo.utilidades;

import  fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;


/**
 * Descripcion: La interfaz mantiene los metodos 
 * para manejar objetos del tipo Dni.
 *
 * @version version 2.0 Marzo 2022
 * @since   version 1.0 Mayo 2013
 * @author  Fundamentos de Programacion II
 */ 
public interface DniInterfaz {

    /**
     * Descripcion: metodo que proporciona un valor 
     *              para configurar  el dni.
     */ 
    public void setDni( String dni ) throws DniIncorrectoExcepcion;

    /**
     * Descripcion: metodo que devuelve como String el dni.
     */
    public String getDni();

}
