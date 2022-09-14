/**
 * @proyecto Practica Final Poo
 * @nombre : CorreoElectrinico.java
 * @fecha : Mayo 2022
 * @autor : Name
 * @descripcion :En esta clase se comprueba qe el correo electronico es valido una vez se le pase al constructor, tambien contiene los metodos 
 * set y get 
 * En el contructor en caso de correo electronico se lanza la excepcion CorreoElectronicoExcepcion
*/



package fp2.poo.pfpooname;


import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

public class CorreoElectronico implements CorreoElectronicoInterfaz {
    
    private static final String MENSAJE_ERROR = "Hay un error en su correo electronico";


    private String correroElectronico ;
    public int contadorDeArroba ;

    //Constructor 
    public CorreoElectronico(String corrElec) throws CorreoElectronicoIncorrectoExcepcion{
        correroElectronico = corrElec ;
       for ( int i = 0; i < correroElectronico.length() ;i++ ){
            if ( correroElectronico.charAt(i) == '@'){ // con charAt recorro cada caracter de la cadena segun el indice i , desp comparo
                contadorDeArroba ++ ;
            }
    }
    if ( contadorDeArroba != 1 ){  
        throw new CorreoElectronicoIncorrectoExcepcion(MENSAJE_ERROR);
    }
}

    public void setCorreoElectronico(String eMail) {
        correroElectronico = eMail ;
        
    }

    public String getCorreoElectronico() {
        
        return correroElectronico;
    }
}
