/*
 *  @(#)DomicilioInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;


/**
 * Descripcion: La interfaz mantiene los metodos 
 * para manejar objetos del tipo Domicilio.        
 *              
 *
 * @version version 2.0 Marzo 2022
 * @since   version 1.0 Mayo 2013
 * @author  Fundamentos de Programacion II
 */
public interface DomicilioInterfaz {

    /*
     *  Descripcion: Metodo de configuracion del atributo domicilio.
     */
    public void setDomicilio( String nombre );

    /*
     *  Descripcion: Metodo getter de domicilio.
     */
    public String getDomicilio( );
    
}
