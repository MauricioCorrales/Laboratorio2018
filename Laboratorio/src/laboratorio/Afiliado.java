
package laboratorio;

import java.util.*;

public class Afiliado extends Persona {
    
    private int numAfiliado;
    
    public Afiliado(String nombre, String apellido, int edad, String sexo, String dni, String domicilio, int numAf){
      super(nombre, apellido, edad, sexo, dni, domicilio);
      this.numAfiliado = numAf;
    }
    public ArrayList<RegistroSolicitud> regsol = new ArrayList<RegistroSolicitud>();
    public ArrayList<Familia> flia = new ArrayList<Familia>();
    
    public void hacerSolicitud(){
    }

    public int getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(int numAfiliado) {
        this.numAfiliado = numAfiliado;
    }
}
