/*
 *  @(#)TelefonoIncorrectoExcepcion.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades.Excepciones;

public class TelefonoIncorrectoExcepcion extends Exception {

    /** 
      * Este atributo estatico se incluye para evitar el warning con la opcion -Xlint 
      * Es necesario ya que la clase Exception es serializable 
      * (este tema no se ve en practica).
      */
    public static final long serialVersionUID = -4L;

    private String descripcion;

    public TelefonoIncorrectoExcepcion() {
    }

    public TelefonoIncorrectoExcepcion( String descripcion ) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return descripcion;
    }
}
