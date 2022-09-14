/**
 * @proyecto Practica Final Poo
 * @nombre : Dni.java
 * @fecha : Mayo 2022
 * @autor : Name
 * @descripcion : compuesta por el contrutor el cual se encarga de comprobar la valides del Dni y si este no cumple los requisitos 
 * lanza la excepion DniIncorrectoExcepcio. Ademas contiene los metodos set y get 
*/


package fp2.poo.pfpooname;



import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;

public class Dni implements DniInterfaz{
   
    private static final String MENSAJE_ERROR = "Hay un error en su DNI";
    private static final int POCISION_LETRA_DNI = 8; 
    private static final int LONGITUD_DNI = 9 ; 


    private String Dni ;
    private char DniSoloLetra ;
    

    //Constructor 
    public Dni(String dni) throws DniIncorrectoExcepcion{
        Dni = dni ;

        if ( Dni.length() != LONGITUD_DNI){
            throw new DniIncorrectoExcepcion(MENSAJE_ERROR);
        }else {
            DniSoloLetra = Dni.charAt(POCISION_LETRA_DNI);
        if ( Character.isAlphabetic(DniSoloLetra) == false ){
            throw new DniIncorrectoExcepcion(MENSAJE_ERROR);
        }
    }
        
        
        }
            
    

    public void setDni(String dni ) throws DniIncorrectoExcepcion {
        Dni = dni ;
    
    }
    public String  getDni() {
        return Dni ;
    }  

    


}
