
package laboratorio;

import java.util.*;

public class Empresa {
    ArrayList<Movil> movil = new ArrayList<Movil>();
    ArrayList<RegistroResultado> regres = new ArrayList<RegistroResultado>();
    ArrayList<Afiliado> afiliado = new ArrayList<Afiliado>();
    
    public void addAfiliado(Afiliado af){
        this.afiliado.add(af);
        System.out.println(afiliado.get(0).getNombre());
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
        Afiliado afi=null;
        for(int i = 0; i < afiliado.size(); i++){
            if(afiliado.get(i).getNumAfiliado() == numAf){
                return  afi = afiliado.get(i);
            }
        }
        return afi;
    }
    
    public boolean EliminarAf(int numAf){
        for(int i = 0; i < afiliado.size(); i++){
            if(afiliado.get(i).getNumAfiliado() == numAf){
                afiliado.remove(i);
                return true;
            }
        }
        return false;
    }

}
