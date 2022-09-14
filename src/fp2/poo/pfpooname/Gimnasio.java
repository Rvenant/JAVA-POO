/*
* @(#)Gimnasio.java
*
* @author Fundamentos de Programacion II. GITT.
* Departamento de Ingenieria Telematica
* Universidad de University name
* @version Marzo 2022
* @since Marzo 2022
*/
package fp2.poo.pfpooname;
import fp2.poo.utilidades.GimnasioAbstracta;
import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.DatosDeClientesEntrada;
import fp2.poo.utilidades.DatosDeRutinasEntrada;
import java.util.ArrayList;
import java.util.Collections;

/**
* Esta clase extiende la clase GimnasioAbstracta.
* Mantiene un conjunto de clientes y rutinas de entrenamiento.
*/
public class Gimnasio extends GimnasioAbstracta{
private ArrayList<ClienteInterfaz> clientes = null;
 private ArrayList<RutinaDeEntrenamientoInterfaz> rutinas = null;
public Gimnasio(String ficheroRutinas, String ficheroClientes ) throws
OperacionNoPermitidaExcepcion
{
 this.clientes = new ArrayList<ClienteInterfaz>();
 this.rutinas = new ArrayList<RutinaDeEntrenamientoInterfaz>();

DatosDeRutinasEntrada rut = null;
rut = new DatosDeRutinasEntrada(ficheroRutinas);
while(rut.hasNext()) {
 try{
 RutinaDeEntrenamientoInterfaz rutina = rut.next();
 this.insertarRutinaEntrenamiento ( rutina );
 } catch (OperacionNoPermitidaExcepcion e) {
 System.err.println("Entrada incorrecta");
 }
}
DatosDeClientesEntrada cli = null;
cli = new DatosDeClientesEntrada(ficheroClientes);while( cli.hasNext()) {
    try {
    ClienteInterfaz cliente = cli.next();
    this.insertarCliente ( cliente );
     } catch (OperacionNoPermitidaExcepcion e) {
     System.err.println(e);
     }
    }
    }


    public void  insertarCliente(ClienteInterfaz cliente ) 
    throws OperacionNoPermitidaExcepcion {
       
        if ( clientes.isEmpty()){
            if ( cliente.getDni()!= null){
                clientes.add(cliente);
            }else 
            {
                throw new OperacionNoPermitidaExcepcion();
            } 
        }else
        { 
            for (ClienteInterfaz client : clientes) {
                if (client.getDni().getDni() == cliente.getDni().getDni() || cliente.getDni() == null){
                   throw new OperacionNoPermitidaExcepcion();
                }
            }clientes.add(cliente);
                    
            
        }
           
            }


    
    public void insertarRutinaEntrenamiento(RutinaDeEntrenamientoInterfaz rut) 
    throws OperacionNoPermitidaExcepcion {
        
            if (rut.getIdEntrenamiento() != null ) {
                 rutinas.add(rut);

             }else{
                 throw new OperacionNoPermitidaExcepcion();
             
        }
        
    }
    

    
    public void mostrarClientes() {
        
        for (ClienteInterfaz client : clientes) {
            System.out.println( "El nombre es : " +client.getNombre() +"\n"+ 
            "El Dni es : " +client.getDni().getDni() +"\n"+
            "El correo electronico es : "+client.getCorreoElectronico().getCorreoElectronico()+ "\n"+
            "El telefono es : "+ client.getTelefono().getTelefono()+ "\n"+
            "El domicilio es : "+ client.getDomicilio().getDomicilio() + "\n");
        }
        
    }

    
    public void mostrarRutinas() {

    for ( RutinaDeEntrenamientoInterfaz rutinaDeEntremanientoBucle: rutinas) {
            System.out.println("Identificador :"+rutinaDeEntremanientoBucle.getIdEntrenamiento()+"\n" +
            "Descripcion : "+rutinaDeEntremanientoBucle.getDescripcion()+"\n"+ 
            "Frecuencia :"+rutinaDeEntremanientoBucle.getFrecuencia()+"\n"+
             "Tiempo :" +rutinaDeEntremanientoBucle.getTiempo()+ "\n");
        }
    }

    
    public void ordenarClientesPorDni() {
        
        OrdenacionDni orden = new OrdenacionDni ();
        Collections.sort(clientes,orden); 

    }

}