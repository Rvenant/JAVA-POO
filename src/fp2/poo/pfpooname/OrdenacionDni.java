package fp2.poo.pfpooname;

/**
 * @proyecto Practica Final Poo
 * @nombre : OrdenacionPorDni.java
 * @fecha : Mayo 2022
 * @autor : Name
 * @descripcion :Metiante el metodo compere se ordena la arrayList de tipo ClienteInterfaz
*/



import java.util.Comparator;

import fp2.poo.utilidades.ClienteInterfaz;


public  class OrdenacionDni implements Comparator <ClienteInterfaz>{

 
    public int compare(ClienteInterfaz arg0, ClienteInterfaz arg1) {

      String Dni1 = arg0.getDni().getDni();
      String Dni2 = arg1.getDni().getDni();

        return Dni1.compareTo(Dni2);
        // Ordena de mayor a menor
        // Para menor a mayor usar ArrayList.reverse() en la       clase donde se almacenan los Dni
    }

    

    

    

}
