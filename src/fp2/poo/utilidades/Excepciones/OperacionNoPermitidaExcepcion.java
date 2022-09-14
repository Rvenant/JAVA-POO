/*
 *  @(#)OperacionNoPermitidaExcepcion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades.Excepciones;

public class OperacionNoPermitidaExcepcion extends Exception {

    /** 
      * Este atributo estatico se incluye para evitar el warning con la opcion -Xlint 
      * Es necesario ya que la clase Exception es serializable 
      * (este tema no se ve en practica).
      */
    public static final long serialVersionUID = -3L;

    private String str = null;

    public OperacionNoPermitidaExcepcion(  ) {
        this.str = "";
    }  
    
    public OperacionNoPermitidaExcepcion( String str ) {
        this.str = str;
    }      
    public String toString() {
        return str;
    }

}
