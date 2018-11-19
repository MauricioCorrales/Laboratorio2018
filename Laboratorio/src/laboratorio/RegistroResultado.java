
package laboratorio;

public class RegistroResultado {
    public String tratamiento;
    public String diagnostico;
    
    public RegistroResultado (String tratamiento, String diagnostico){
        this.tratamiento=tratamiento;
        this.diagnostico=diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
