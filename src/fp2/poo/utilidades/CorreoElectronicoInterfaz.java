/*
 *  @(#)TelefonoInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;

import  fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

/**
 * Descripcion: La interfaz mantiene los metodos 
 * para manejar objetos del tipo CorreoElectronico.        
 *              
 *
 * @version version 2.0 Marzo 2022
 * @since   version 1.0 Mayo 2013
 * @author  Fundamentos de Programacion II
 */
public interface CorreoElectronicoInterfaz {

    /**
     * Descripcion: Devuelve el valor del correo electronico.
     */
    public String getCorreoElectronico();

    /**
     * Descripcion: Asigna un valor del correo electronico.
     */
    public void setCorreoElectronico(String eMail) throws CorreoElectronicoIncorrectoExcepcion;


}
