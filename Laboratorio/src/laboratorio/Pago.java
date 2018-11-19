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
    private final float abonoAfiliado = 300;
    private final float abonoFamiliar = 120;
    private String fechaPago;
    private int cuota;
    
    public Pago(){
    }
    
    public Pago(String fecha, int cuota){
        this.fechaPago = fecha;
        this.cuota=cuota;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public float getAbonoAfiliado() {
        return abonoAfiliado;
    }

    public float getAbonoFamiliar() {
        return abonoFamiliar;
    }
}