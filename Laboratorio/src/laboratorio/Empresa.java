package laboratorio;

import Exception.CampoVaioMovilExcepcion;
import Exception.ComprobarAfiliadoException;
import Exception.ComprobarDocumentoException;
import Exception.ComprobarMovilExcepciom;
import Exception.ComprobarPagoCuotaException;
import Exception.CustomException;
import static java.lang.System.exit;
import java.util.*;
import javax.swing.JOptionPane;

public class Empresa {

    private int x = 1;
    private Pago pago = new Pago();
    private ArrayList<Movil> movil = new ArrayList<Movil>();
    private ArrayList<Afiliado> afiliado = new ArrayList<Afiliado>();
    private ArrayList<Empleado> empleado = new ArrayList<Empleado>();

    public void addAfiliado(Afiliado af) {
        this.getAfiliado().add(af);
    }

    public void addPago(Pago pago, int numAf) throws ComprobarPagoCuotaException {
        for (int i = 0; i < afiliado.size(); i++) {
            if (afiliado.get(i).getNumAfiliado() == numAf) {
                try{
                    if (pago.getCuota() > afiliado.get(i).getPago().getCuota()) {
                        afiliado.get(i).setPago(pago);
                    } else {
                        if (pago.getCuota() == afiliado.get(i).getPago().getCuota()) {
                            throw new ComprobarPagoCuotaException ("ERROR: cuota ya pagada");
                        }
                    }
                }catch(NullPointerException e){
                    afiliado.get(i).setPago(pago);
                }
            }
        }
    }

    public void addEmpleado(Empleado empleado) {
        this.getEmpleado().add(empleado);
    }

    public int addFamilia(int numAf, Familiar flia) {
        for (int i = 0; i < getAfiliado().size(); i++) {
            if (getAfiliado().get(i).getNumAfiliado() == numAf) {
                this.getAfiliado().get(i).getFlia().add(flia);
                return 1;
            }
        }
        return 0;
    }

    public void addMovil(Movil mov) {
        this.getMovil().add(mov);
    }

    public Afiliado buscarAf(int numAf) throws ComprobarAfiliadoException  {
        Afiliado afi = null;
        for (int i = 0; i < getAfiliado().size(); i++) {
            if (getAfiliado().get(i).getNumAfiliado() == numAf) {
                return afi = getAfiliado().get(i);
            }}
        for (int i = 0; i < getAfiliado().size(); i++) {
            if(getAfiliado().get(i).getNumAfiliado() != numAf ){
                 throw new ComprobarAfiliadoException(" ERROR: No existe afiliado con el número ingresado");
            }
            
        }
        return afi;
    }

    public Familiar buscarFamiliar(Afiliado afil, String dni) {
        Familiar flia = null;
        for (int i = 0; i < afil.getFlia().size(); i++) {
            if (dni.equals(afil.getFlia().get(i).getDni())) {
                return flia = afil.getFlia().get(i);
            }
        }
        return flia;
    }

    public Empleado buscarEmp(String dni) {
        Empleado emp = null;
        for (int i = 0; i < getEmpleado().size(); i++) {
            if (dni.equals(getEmpleado().get(i).getDni())) {
                return emp = getEmpleado().get(i);
            }
        }
        return emp;
    }

    public Movil buscarMovil(String patente) {
        Movil mov = null;
        for (int i = 0; i < getMovil().size(); i++) {
            if (patente.equals(getMovil().get(i).getPatente())) {
                return mov = getMovil().get(i);
            }
        }
        return mov;
    }

    public RegistroSolicitud buscarSoli(int numSoli) {
        for (int i = 0; i < afiliado.size(); i++) {
            for (int x = 0; x < afiliado.get(i).getRegsol().size(); x++) {
                if (afiliado.get(i).getRegsol().get(x).getNumSoli() == numSoli) {
                    return afiliado.get(i).getRegsol().get(x);
                }
            }
        }
        return null;
    }

    public void eliminarAf(int numAf) throws CustomException {
        for (int i = 0; i < getAfiliado().size(); i++) {
            if (getAfiliado().get(i).getNumAfiliado() == numAf) {
                this.getAfiliado().remove(i);
            }
        }
        throw new CustomException("Error al eliminar el Afiliado");
    }

    public void eliminarEmp(String dni) throws CustomException {
        for (int i = 0; i < getEmpleado().size(); i++) {
            if (dni.equals(getEmpleado().get(i).getDni())) {
                this.getEmpleado().remove(i);
            }
        }
        throw new CustomException("Error al eliminar el Empleado");
    }

    public void eliminarFlia(int numAf, String dniFlia) throws CustomException {
        for (int i = 0; i < getAfiliado().size(); i++) {
            if (numAf == getAfiliado().get(i).getNumAfiliado()) {
                for (int j = 0; j < getAfiliado().get(i).getFlia().size(); j++) {
                    if (dniFlia.equals(getAfiliado().get(i).getFlia().get(j).getDni())) {
                        this.getAfiliado().get(i).getFlia().remove(j);
                    }
                }
            }
        }
        throw new CustomException("Error al eliminar el Familiar");
    }

    public void eliminarMovil(String patente) throws CustomException {
        for (int i = 0; i < getMovil().size(); i++) {
            if (patente.equals(getMovil().get(i).getPatente())) {
                this.getMovil().remove(i);
            }
        }
        throw new CustomException("Error al eliminar el movil");
    }

    public float calcularpago(int numAf) {
        float pago = 0;
        for (int i = 0; i < afiliado.size(); i++) {
            if (numAf == afiliado.get(i).getNumAfiliado()) {
                pago = this.pago.getAbonoAfiliado() + (afiliado.get(i).getFlia().size() * this.pago.getAbonoFamiliar());
                return pago;
            }
        }
        return pago;
    }

    public void validarSoli(int mes, int numAf) throws CustomException {
        for (int i = 0; i < afiliado.size(); i++) {
            if (afiliado.get(i).getNumAfiliado() == numAf) {
                if (afiliado.get(i).getPago().getCuota() == 0) {
                    throw new CustomException("Afiliado seleccionado en mora");
                } else {
                    int resultado = mes - afiliado.get(i).getPago().getCuota();
                    if (resultado >= 2) {
                        throw new CustomException("Afiliado seleccionado en mora");
                    }
                }
            }
        }
    }

    public void validarDni(String dni) throws ComprobarDocumentoException {
        for (int i = 0; i < afiliado.size(); i++) {
            if (afiliado.get(i).getDni().equals(dni)) {

                throw new ComprobarDocumentoException(" Ya existe un afiliado con el Documento que esta intentando ingresar");   // return false;
            }
            for (int j = 0; j < afiliado.get(i).getFlia().size(); j++) {
                if (afiliado.get(i).getFlia().get(j).getDni().equals(dni)) {
                    throw new ComprobarDocumentoException(" Ya existe un Familiar de un Afiliado con el Documento que esta intentando ingresar");//return false;
                }
            }
        }
        for (int x = 0; x < empleado.size(); x++) {
            if (empleado.get(x).getDni().equals(dni)) {
                throw new ComprobarDocumentoException(" Ya existe un Empleado con el Documento que esta intentando ingresar");
            }
        }
    }
    
    public void comprobarMovil(String patente) throws ComprobarMovilExcepciom {
        for (int i = 0; i < movil.size(); i++) {
            if (movil.get(i).getPatente().equalsIgnoreCase(patente)) {
                throw new ComprobarMovilExcepciom(" Ya existe un Movil con la Patente que esta intentando ingresar");
            }
        }
    }

    public void comprobarCamposMovil(String marca, String modelo, String año) throws CampoVaioMovilExcepcion {
        if (marca.equals("") || modelo.equals("") || año.equals("")) {
            throw new CampoVaioMovilExcepcion("ERROR: Por favor complete todos los campos");
        }
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

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
