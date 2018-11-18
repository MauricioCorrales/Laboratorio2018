
package laboratorio;

public class Empleado extends Persona{
    private String titulo;
    private String categoria;
    
    public Empleado(String nombre, String apellido, int edad, String sexo, String dni, String domicilio, String titulo, String tipo){
        super(nombre, apellido, edad, sexo, dni, domicilio);
        this.titulo = titulo;
        this.categoria = tipo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setCategoria(String tipo){
        this.categoria = tipo;
    }
    
    public String getCategoria(){
        return categoria;
    }
}
