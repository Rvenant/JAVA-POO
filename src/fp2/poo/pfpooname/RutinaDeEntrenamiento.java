
/**
 * @proyecto Practica Final Poo
 * @nombre : RutinaDeEntrenamiento.java
 * @fecha : Mayo 2022
 * @autor : Name
 * @descripcion : en el contructor se inicializan los parametros que componen una rutina de entrenamiento, a su vez s implemetan lo metodos 
 * set y get de los mismos
*/

package fp2.poo.pfpooname;

import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;

public class RutinaDeEntrenamiento implements RutinaDeEntrenamientoInterfaz {


    String IdEntrenamiento ;
    String descripcion;
    int frecuencia;
    int tiempo ;
    
    // Constructor
    public RutinaDeEntrenamiento(String idEntrenamiento, String descripcion,
     int frecuencia, int tiempo){
        this.IdEntrenamiento = idEntrenamiento;
        this.descripcion = descripcion ;
        this.frecuencia= frecuencia ;
        this.tiempo = tiempo ;
    }



    public String getIdEntrenamiento() {
       
        return IdEntrenamiento ;
    }

    
    public void setIdEntrenamiento(String id) {
       IdEntrenamiento = id;
        
    }

    
    public String getDescripcion() {
       
        return descripcion;
    }

    
    public void setDescripcion(String id) { // En la interfaz el parametro es id
       descripcion = id ;
        
    }

    
    public int getFrecuencia() {
       
        return frecuencia;
    }

    
    public void setFrecuencia(int frecuencia) {
       this.frecuencia = frecuencia;
        
    }

    
    public int getTiempo() {
       
        return tiempo;
    }

    
    public void setTiempo(int tiempo) {
       this.tiempo = tiempo ;
        
    }
    
}
