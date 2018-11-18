
package laboratorio;

import java.util.*;

public class Familiar extends Persona{
    private String tipoFamiliar;
    private ArrayList<RegistroSolicitud> regsol= new ArrayList();

    public Familiar(String nombre, String apellido, int edad, String sexo, String dni, String domicilio, String tipoFamiliar) {
        super(nombre, apellido, edad, sexo, dni, domicilio);
        this.tipoFamiliar = tipoFamiliar;
    }

    public String getTipoFamiliar() {
        return tipoFamiliar;
    }

    public void setTipoFamiliar(String tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }
}
