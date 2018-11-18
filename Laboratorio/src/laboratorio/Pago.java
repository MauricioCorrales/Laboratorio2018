/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author Marcelo
 */
public class Pago {
    private float abonoAfiliado = 300;
    private float abonoFamiliar = 120;
    private String fechaPago;
    
    public Pago(){
        
    }
    
    public Pago(String fecha){
        this.fechaPago = fecha;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public float getAbonoAfiliado() {
        return abonoAfiliado;
    }

    public void setAbonoAfiliado(float abonoAfiliado) {
        this.abonoAfiliado = abonoAfiliado;
    }

    public float getAbonoFamiliar() {
        return abonoFamiliar;
    }

    public void setAbonoFamiliar(float abonoFamiliar) {
        this.abonoFamiliar = abonoFamiliar;
    }
}
