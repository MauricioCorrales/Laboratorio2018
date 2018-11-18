
package laboratorio;

import java.util.*;

public class Empresa {
    private Pago pago = new Pago();
    private ArrayList<Movil> movil = new ArrayList<Movil>();
    private ArrayList<RegistroResultado> regres = new ArrayList<RegistroResultado>();
    private ArrayList<Afiliado> afiliado = new ArrayList<Afiliado>();
    private ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    
    public void addAfiliado(Afiliado af){
        this.getAfiliado().add(af);
    }
    
    public boolean addPago(Pago pago, int numAf){
        for(int i = 0; i < getAfiliado().size(); i++){
            if(getAfiliado().get(i).getNumAfiliado() == numAf){
                this.getAfiliado().get(i).getPago().add(pago);
                return true;
            }
        }
        return false;
    }
    
    public void addEmpleado(Empleado empleado){
        this.getEmpleado().add(empleado);
    }
    
    public int addFamilia(int numAf, Familiar flia){
        for(int i = 0; i < getAfiliado().size(); i++){
            if(getAfiliado().get(i).getNumAfiliado() == numAf){
                this.getAfiliado().get(i).getFlia().add(flia);
                return 1;
            }
        }
        return 0;
    }
    
    public void addMovil(Movil mov){
        this.getMovil().add(mov);
    }
    
    public Afiliado buscarAf(int numAf){
        Afiliado afi = null;
        for(int i = 0; i < getAfiliado().size(); i++){
            if(getAfiliado().get(i).getNumAfiliado() == numAf){
                return  afi = getAfiliado().get(i);
            }
        }
        return afi;
    }
    
    public Familiar buscarFamiliar(Afiliado afil, String dni){
        Familiar flia = null;
        for(int i = 0; i < afil.getFlia().size(); i++){
            if(dni.equals(afil.getFlia().get(i).getDni())){
                return flia = afil.getFlia().get(i);
            }
        }
        return flia;
    }
    
    public Empleado buscarEmp(String dni){
        Empleado emp = null;
        for(int i = 0; i < getEmpleado().size(); i++){
            if(dni.equals(getEmpleado().get(i).getDni())){
                return emp = getEmpleado().get(i);
            }
        }
        return emp;
    }
    
    public Movil buscarMovil(String patente){
        Movil mov = null;
        for(int i = 0; i < getMovil().size(); i++){
            if(patente.equals(getMovil().get(i).getPatente())){
                return mov = getMovil().get(i);
            }
        }
        return mov;
    }
    
    public boolean eliminarAf(int numAf){
        for(int i = 0; i < getAfiliado().size(); i++){
            if(getAfiliado().get(i).getNumAfiliado() == numAf){
                this.getAfiliado().remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarEmp(String dni){
        for(int i = 0; i < getEmpleado().size(); i++){
            if(dni.equals(getEmpleado().get(i).getDni())){
                this.getEmpleado().remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarFlia(int numAf, String dniFlia){
        for(int i = 0; i < getAfiliado().size(); i++){
            if(numAf == getAfiliado().get(i).getNumAfiliado()){
                for(int j = 0; j < getAfiliado().get(i).getFlia().size(); j++){
                    if(dniFlia.equals(getAfiliado().get(i).getFlia().get(j).getDni())){
                        this.getAfiliado().get(i).getFlia().remove(j);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean eliminarMovil(String patente){
        for(int i = 0; i < getMovil().size(); i++){
            if(patente.equals(getMovil().get(i).getPatente())){
                this.getMovil().remove(i);
                return true;
            }
        }
        return false;
    }
    
    public float calcularpago(int numAf){
        float pago = 0;
        for(int i = 0; i < afiliado.size(); i++){
            if(numAf == afiliado.get(i).getNumAfiliado()){
                pago = this.pago.getAbonoAfiliado() + (afiliado.get(i).getFlia().size()*this.pago.getAbonoFamiliar());
                return pago;
            }
        }
        return pago;
    }

    public ArrayList<Movil> getMovil() {
        return movil;
    }

    public void setMovil(ArrayList<Movil> movil) {
        this.movil = movil;
    }

    public ArrayList<Afiliado> getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(ArrayList<Afiliado> afiliado) {
        this.afiliado = afiliado;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }
}
