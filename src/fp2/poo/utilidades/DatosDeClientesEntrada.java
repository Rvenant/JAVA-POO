/*
 *  @(#)DatosDeClientesEntrada.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;


import fp2.poo.pfpooname.*; 


import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion ;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;

import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;


import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DatosDeClientesEntrada implements Iterator<ClienteInterfaz> {
 
    private BufferedReader  in      =  null;
    private String          ruta    = "./datos/";
    private ClienteInterfaz cliente =  null;
    
    public DatosDeClientesEntrada (String nombreDelFichero) throws OperacionNoPermitidaExcepcion {
        try{
            in = new BufferedReader (new InputStreamReader(
                                 new FileInputStream(ruta + nombreDelFichero)));
        } catch (FileNotFoundException e) {
            throw new OperacionNoPermitidaExcepcion("Error en apertura de fichero");
        }
    }    

    public ClienteInterfaz next( ) throws NoSuchElementException {
        if ( cliente == null )
            throw new NoSuchElementException();
        ClienteInterfaz local  = cliente;
        cliente = null;
        return local;
    }

    public boolean hasNext() {
        String                    linea           = null;
        DniInterfaz               dni             = null;
        String                    nombre          = null;
        TelefonoInterfaz          telefono        = null;
        DomicilioInterfaz         domicilio       = null;
        CorreoElectronicoInterfaz eMail           = null;
        String                    idEntrenamiento = null;
        boolean                   lecturaInvalida = false;
        boolean                   finLectura      = false;  

        cliente= null;
        while( (finLectura  == false) && (cliente == null) ) {
            lecturaInvalida = false;
            try{
                try {
                     linea = in.readLine().trim();  
                     dni   = new Dni (linea);
                } catch ( DniIncorrectoExcepcion e ) {
                    lecturaInvalida = true;
                }
                linea   =  in.readLine().trim(); 
                nombre  =  linea;
                try {
                     linea    = in.readLine().trim();  
                     telefono = new Telefono (linea);
                } catch ( TelefonoIncorrectoExcepcion e ) {                  
                    lecturaInvalida = true;
                } 
                linea     = (in.readLine()).trim(); 
                domicilio = new Domicilio( linea ); 
                try {
                     linea = in. readLine().trim(); 
                     eMail       = new CorreoElectronico (linea);
                } catch ( CorreoElectronicoIncorrectoExcepcion e ) {
                    lecturaInvalida = true;
                }                                          
                linea           = in. readLine().trim();  
                idEntrenamiento = linea;
                
                if(lecturaInvalida == false) {   
                    cliente = new Cliente (  dni, nombre, telefono, domicilio, eMail, idEntrenamiento);  
                } else {
                   this.cliente      = null;
                }
                linea = in. readLine().trim();   /* los 10 simbolos '-' */ 
           } catch ( IOException e ) {
                finLectura  = true;
                cliente = null;
           } catch (Exception e) {
                finLectura  = true;
                cliente = null;
           }
       }

       return ( (cliente == null) ? false : true );
    }
}



