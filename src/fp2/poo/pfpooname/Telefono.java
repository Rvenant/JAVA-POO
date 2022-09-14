
/**
 * @proyecto Practica Final Poo
 * @nombre : TElefono.java
 * @fecha : Mayo 2022
 * @autor : Name
 * @descripcion : compuesta por el constructor que compruba que el telfono sea valido y si no lo es lanza la excecion TelefonoIncorrectoExcepcion() 
 * a su ez implemta los metodos set y get de telefono
*/


package fp2.poo.pfpooname;

import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;


public class Telefono implements TelefonoInterfaz {
    
    private static final String MENSAJE_ERROR = "Hay un error en su telefono";
    private static final int LONGITUD_TLF = 9 ; 

    private String telefono ; 
    private char  tlfChar ;
    private int contNumTlf;
    
    //Constructor
    public Telefono (String telefono)throws TelefonoIncorrectoExcepcion{
        this.telefono = telefono;
        
        for ( int i = 0 ; i< telefono.length() ; i ++){
            tlfChar = telefono.charAt(i); // Se puede meter la expresion en isDigit pero asi queda mejor para mi , idDigit(char) solo acepta char 
            if ( Character.isDigit(tlfChar)){
                contNumTlf ++ ;
            }
        }
        if ( contNumTlf != LONGITUD_TLF){
            throw new TelefonoIncorrectoExcepcion(MENSAJE_ERROR);
        }

    }


    public String getTelefono(){
        return telefono ;
    }

    public void setTelefono(String telefono) throws TelefonoIncorrectoExcepcion {
        this.telefono = telefono ;
    }
}
