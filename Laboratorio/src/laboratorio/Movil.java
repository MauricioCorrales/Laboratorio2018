
package laboratorio;

public class Movil {
    private String marca;
    private String modelo;
    private String año;
    private String patente;
    
    public Movil(String marca, String modelo, String patente, String año){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
}
