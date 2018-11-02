
package laboratorio;

import java.util.*;

public class Familia extends Persona{
    ArrayList<RegistroSolicitud> regsol= new ArrayList();

    public Familia(String nombre, String apellido, int edad, String sexo, String dni, String domicilio) {
        super(nombre, apellido, edad, sexo, dni, domicilio);
    }
    
}
