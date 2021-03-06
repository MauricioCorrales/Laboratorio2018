
package laboratorio;

import java.util.*;

public class Afiliado extends Persona {
    
    private int numAfiliado;
    private ArrayList<RegistroSolicitud> regsol = new ArrayList<RegistroSolicitud>();
    private ArrayList<Familiar> flia = new ArrayList<Familiar>();
    private Pago pago;
    
    public Afiliado(String nombre, String apellido, int edad, String sexo, String dni, String domicilio, int numAf){
      super(nombre, apellido, edad, sexo, dni, domicilio);
      this.numAfiliado = numAf;
    }
    
    public int getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(int numAfiliado) {
        this.numAfiliado = numAfiliado;
    }


    public ArrayList<Familiar> getFlia() {
        return flia;
    }

    public void setFlia(ArrayList<Familiar> flia) {
        this.flia = flia;
    }
    
    public Pago getPago() {
        return pago;
    }
    
    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public ArrayList<RegistroSolicitud> getRegsol() {
        return regsol;
    }

    public void setRegsol(ArrayList<RegistroSolicitud> regsol) {
        this.regsol = regsol;
    }
    
    
    
}
