
package laboratorio;

import java.util.*;

public class Empresa {
    ArrayList<Movil> movil = new ArrayList<Movil>();
    ArrayList<RegistroResultado> regres = new ArrayList<RegistroResultado>();
    ArrayList<Afiliado> afiliado = new ArrayList<Afiliado>();
    ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    
    public void addAfiliado(Afiliado Af){
        this.afiliado.add(Af);
    }
    public void addEmpleado(Empleado empleado){
        this.empleado.add(empleado);
    }
    
    public int addFamilia(int numAf, Familia flia){
        for(int i = 0; i < afiliado.size(); i++){
            if(afiliado.get(i).getNumAfiliado() == numAf){
                afiliado.get(i).flia.add(flia);
                return 1;
            }
        }
        return 0;
    }
    
    public Afiliado buscarAf(int numAf){
        Afiliado afi = null;
        for(int i = 0; i < afiliado.size(); i++){
            if(afiliado.get(i).getNumAfiliado() == numAf){
                return  afi = afiliado.get(i);
            }
        }
        return afi;
    }
    
    public Empleado buscarEmp(String dni){
        Empleado emp = null;
        for(int i = 0; i < empleado.size(); i++){
            if(dni.equals(empleado.get(i).getDni())){
                return emp = empleado.get(i);
            }
        }
        return emp;
    }
    
    public boolean eliminarAf(int numAf){
        for(int i = 0; i < afiliado.size(); i++){
            if(afiliado.get(i).getNumAfiliado() == numAf){
                afiliado.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarEmp(String dni){
        for(int i = 0; i < empleado.size(); i++){
            if(dni.equals(empleado.get(i).getDni())){
                empleado.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarFlia(int numAf, String dniFlia){
        for(int i = 0; i < afiliado.size(); i++){
            if(numAf == afiliado.get(i).getNumAfiliado()){
                for(int j = 0; j < afiliado.get(i).flia.size(); j++){
                    if(dniFlia.equals(afiliado.get(i).flia.get(j).getDni())){
                        afiliado.get(i).flia.remove(j);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
