/**
 * @proyecto Practica Final Poo
 * @nombre : Domicilio.java
 * @fecha : Mayo 2022
 * @autor : Name
 * @descripcion : compuexta unicamento por contructor y metodos set y get del domicilio, no realiza comprobaciones ni lanza excepciones
*/


package fp2.poo.pfpooname;

import fp2.poo.utilidades.DomicilioInterfaz;

public class Domicilio implements DomicilioInterfaz{
    private String nombre ;

    public Domicilio(String nomb){
        nombre = nomb ;
    }


    public String getDomicilio(){
        return nombre ;
    }

    public void setDomicilio (String nombre){
        this.nombre = nombre ;
       
    }
}
