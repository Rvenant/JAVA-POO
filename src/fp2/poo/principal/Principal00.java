/*
 *  @(#)Principal00.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.principal;

import  fp2.poo.pfpooname.Gimnasio;

import  fp2.poo.pfpooname.Cliente;
import  fp2.poo.pfpooname.Dni;
import  fp2.poo.pfpooname.Telefono;
import  fp2.poo.pfpooname.Domicilio;
import  fp2.poo.pfpooname.CorreoElectronico;


import  fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import  fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import  fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;
import  fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

public class Principal00 {
    public static void main(String args[]) {
        Gimnasio g = null;

        Cliente           nuevoCliente    = null;
        Dni               unDni           = null;
        String            nombre          = null;
        Telefono          unTelf          = null;
        Domicilio         unDomicilio     = null;
        CorreoElectronico unEMail         = null;
        String            unEntrenamiento = null;

        try {
        
            if ( args.length != 2 ) {
               throw new OperacionNoPermitidaExcepcion("Numero de argumentos incorrecto");
            } else {
            
                g = new Gimnasio( args[0] /* ficheroRutinas  */ ,
                                  args[1] /* ficheroClientes */ ); 
                //g.mostrarClientes();
                //g.mostrarRutinas();

            /*
             *  Se crean los objetos y se crea un nuevo cliente.
             */                 
            unDni           = new Dni("11111112J");
            nombre          = new String ("Pepe Garcia Lopez");
            unTelf          = new Telefono("123456789");
            unDomicilio     = new Domicilio ( "C/Camino de los Descubrimientos s/n University name");
            unEMail         = new CorreoElectronico( "pepe.garcia@lopez.us.es" );
            unEntrenamiento = new String("Rutina3 "); 
            nuevoCliente    = new Cliente( unDni , nombre, unTelf, unDomicilio, unEMail, unEntrenamiento);
            
            g.insertarCliente ( nuevoCliente );
           
            /*
             *  Se crean los objetos y se crea un nuevo cliente.
             */                 
            unDni           = new Dni("11111113J");
            nombre          = new String ("Manuel Garcia Lopez");
            unTelf          = new Telefono("123456789");
            unDomicilio     = new Domicilio ( "C/Camino de los Descubrimientos s/n University name");
            /* El siguiente correo electronico es incorrecto 
             * debido a que tiene dos caracteres '@'
             */
            unEMail         = new CorreoElectronico( "manuel.garcia@lopez@us.es" );
            unEntrenamiento = new String("Rutina3 "); 
            nuevoCliente    = new Cliente( unDni , nombre, unTelf, unDomicilio, unEMail, unEntrenamiento);

            g.insertarCliente ( nuevoCliente );
            System.out.println("======================================\n");
            g.mostrarClientes();
            System.out.println("======================================\n");           

            }
            // He metido los toString ya que puedo modificar los mensajes con mas facilidad al estar en su fichero declarados como "constantes"
        } catch ( OperacionNoPermitidaExcepcion e) {
            System.err.println(e);
        } catch (CorreoElectronicoIncorrectoExcepcion e) {
            System.err.println("Correo Electronico Incorrecto en Principal00."+"\n"+ e.toString());
        } catch (DniIncorrectoExcepcion e) {
            System.err.println("Dni Incorrecto en Principal00." +"\n" + e.toString());
        } catch (TelefonoIncorrectoExcepcion e) {
            System.err.println("Telefono Incorrecto en Principal00."+"\n"+e.toString());
        }
        
        System.out.println("\nSe muestran los clientes.\n==============================\n");        
        g.mostrarClientes();;
        System.out.println("\nSe muestran las rutinas.\n==============================\n");        
        g.mostrarRutinas();   
        System.out.println("Se realiza la ordenacion por dni de los clientes.\n==============================\n");
        g.ordenarClientesPorDni();
        g.mostrarClientes();
        
     
    }
}


