/*
 *  @(#)DatosDeEntrada.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;

import fp2.poo.pfpooname.*;

import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion; 

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DatosDeRutinasEntrada implements Iterator<RutinaDeEntrenamientoInterfaz> {
 
    private BufferedReader                in       = null;
    private String                        ruta     = "./datos/";
    private RutinaDeEntrenamientoInterfaz rutina   = null;
    
    public DatosDeRutinasEntrada (String nombreDelFichero) throws OperacionNoPermitidaExcepcion {
        try{
            in = new BufferedReader (new InputStreamReader(
                                 new FileInputStream(ruta + nombreDelFichero)));
        } catch (FileNotFoundException e) {
            throw new OperacionNoPermitidaExcepcion("Error en apertura de fichero");
        }
    }    

    public RutinaDeEntrenamientoInterfaz next( ) throws NoSuchElementException {
        if ( rutina == null )
            throw new NoSuchElementException();
        RutinaDeEntrenamientoInterfaz local  = rutina;
        rutina   = null;         
        return local;
    }

    public boolean hasNext() throws NoSuchElementException{
        String                linea           = null;
        String                idEntrenamiento = null;
        String                descripcion     = null;
        int                   frecuencia      = -1;
        int                   tiempo          = -1;
        boolean               lecturaInvalida = false;
        boolean               finLectura      = false;

        
        rutina  = null;
        while((finLectura  == false) && ( rutina == null)) {
            lecturaInvalida = false;
           
            try{
                idEntrenamiento =                    (in.readLine()).trim(); 
                descripcion     =                    (in.readLine()).trim(); 
                try{
                    frecuencia      = Integer.valueOf ( (in.readLine()).trim());  
                }catch (Exception e){
                    System.err.println(e);                    
                    lecturaInvalida = true;                
                }
                try{
                    tiempo          = Integer.valueOf ( (in.readLine()).trim()); 
                }catch (Exception e){
                    System.err.println(e);                    
                    lecturaInvalida = true;                
                }                    
                linea           =                    (in.readLine()).trim();  
                
                
                if(lecturaInvalida == false) {   
                    rutina = new RutinaDeEntrenamiento ( idEntrenamiento,
                                                     descripcion,
                                                     frecuencia,
                                                     tiempo); 
                } else {
                   this.rutina      = null;
                }                
                
                
           } catch ( IOException e ) {
                finLectura  = true;
                rutina  = null;
           } catch (Exception e) {
                finLectura  = true;
                rutina  = null;
           }
       }
       return (( rutina  == null) ? false : true );
    }
}



