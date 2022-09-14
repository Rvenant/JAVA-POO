/*
 *  @(#)ClienteInterfaz.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;

import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;

/**
 * Descripcion: La interfaz mantiene los metodos 
 * para manejar objetos del tipo Cliente.        
 *
 * @version version 2.0 Marzo 2022
 * @since   version 1.0 Mayo 2013
 * @author  Fundamentos de Programacion II
 */
public interface ClienteInterfaz {
    /*
     *  Descripcion: Metodo getter del dni.          
     */
    public DniInterfaz getDni( );

    /*
     *  Descripcion: Metodo setter de dni.          
     */
    public void setDni( DniInterfaz unDni );

    /*
     *  Descripcion: Metodo getter de telefono.          
     */
    public TelefonoInterfaz getTelefono( );

    /*
     *  Descripcion: Metodo setter de telefono.          
     */
    public void setTelefono( TelefonoInterfaz unTelf );

    /*
     *  Descripcion: Metodo getter de nombre.          
     */
    public String getNombre( );

    /*
     *  Descripcion: Metodo setter de nombre.          
     */
    public void setNombre( String nombre );
    
    /*
     *  Descripcion: Metodo getter de domicilio.          
     */
    public DomicilioInterfaz getDomicilio( );
    
    /*
     *  Descripcion: Metodo setter de domicilio.          
     */
    public void setDomicilio( DomicilioInterfaz unDomicilio );
    
     /*
     *  Descripcion: Metodo getter de Correo electronico.          
     */   
    public CorreoElectronicoInterfaz getCorreoElectronico( );
    
    /*
     *  Descripcion: Metodo setter de Correo electronico.          
     */
    public void setCorreoElectronico( CorreoElectronicoInterfaz unEMail );
    
     /*
     *  Descripcion: Metodo getter de entrenamiento.          
     */   
    public String getEntrenamiento( );
    
    /*
     *  Descripcion: Metodo setter de entrenamiento.          
     */
    public void setEntrenamiento( String unEntrenamiento );
}
