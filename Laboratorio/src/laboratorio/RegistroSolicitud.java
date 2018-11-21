package laboratorio;

public class RegistroSolicitud {
    
    private String afiliado;
    private String familiar;
    private String doctor;
    private String enfermero;
    private String movil;
    private String chofer;
    private String tipo;
    private Fecha fecha;
    private int numSoli;
    private RegistroResultado regRes;


    public RegistroSolicitud(String afiliado, String familiar, String doctor, String enfermero, String movil, String chofer, String tipo, Fecha fecha, int numSoli) {
        this.afiliado = afiliado;
        this.familiar = familiar;
        this.doctor = doctor;
        this.enfermero = enfermero;
        this.movil = movil;
        this.chofer = chofer;
        this.tipo = tipo;
        this.fecha = fecha; 
        this.numSoli = numSoli;
    }
    
    public RegistroSolicitud(String afiliado, String doctor, String enfermero, String movil, String chofer, String tipo, Fecha fecha, int numSoli) {
        this.afiliado = afiliado;
        this.doctor = doctor;
        this.enfermero = enfermero;
        this.movil = movil;
        this.chofer = chofer;
        this.tipo = tipo;
        this.fecha = fecha;
        this.numSoli = numSoli;
    }
    
    public void addregRes(RegistroResultado regRes){
        this.regRes=regRes;
    }

    public String getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(String afiliado) {
        this.afiliado = afiliado;
    }

    public String getFamiliar() {
        return familiar;
    }

    public void setFamiliar(String familiar) {
        this.familiar = familiar;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(String enfermero) {
        this.enfermero = enfermero;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getNumSoli() {
        return numSoli;
    }

    public void setNumSoli(int numSoli) {
        this.numSoli = numSoli;
    }

    public RegistroResultado getRegRes() {
        return regRes;
    }

    public void setRegRes(RegistroResultado regRes) {
        this.regRes = regRes;
    }
    
}