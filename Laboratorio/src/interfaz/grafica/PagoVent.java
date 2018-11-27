
package interfaz.grafica;

import Exception.ComprobarAfiliadoException;
import Exception.ComprobarPagoCuotaException;
import java.time.*;
import java.time.format.*;

import javax.swing.JOptionPane;
import laboratorio.Afiliado;
import laboratorio.Empresa;
import laboratorio.Pago;

public class PagoVent extends javax.swing.JInternalFrame {

    Empresa emp;
    LocalDate fechaactual = LocalDate.now();

    public PagoVent(Empresa emp) {
        this.emp = emp;
        
        initComponents();
        varFecha.setText(String.valueOf(fechaactual.getDayOfMonth()+"/"+fechaactual.getMonthValue()+"/"+fechaactual.getYear()));
        cuotas();
    }
    
    public void cuotas(){
        cbCuotas.addItem(null);
        for(int i=1; i<13;i++){
            cbCuotas.addItem("Cuota " + i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        varNumAfil = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        buttonPago = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbCuotas = new javax.swing.JComboBox<>();
        varFecha = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nº Afiliado:");

        varNumAfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(textPane);

        buttonPago.setText("Realizar Pago");
        buttonPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Fecha de pago:");

        jLabel3.setText("Cuota a pagar:");

        cbCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuotasActionPerformed(evt);
            }
        });

        varFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        varFecha.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonPago))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varNumAfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(varFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(varNumAfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(varFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(buttonPago)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        try{
        int numAf = Integer.parseInt(varNumAfil.getText());
        
        Afiliado afil = emp.buscarAf(numAf);
        
        
        String pago = String.valueOf(emp.calcularpago(numAf));
        textPane.setText("Nombre: " + afil.getNombre() + "\nApellido: " + afil.getApellido() + "\nNº Documento: " + afil.getDni() + "\nMonto a pagar: $" + pago);
        }catch (ComprobarAfiliadoException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch (NumberFormatException e){
           
            JOptionPane.showMessageDialog(null,"Error: No ingreso ningún dato, recuerdo que primero debe buscar el Afiliado");
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null,"Error: Primero debe buscar el Afiliado");
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagoActionPerformed
       try{
           int numAf = Integer.parseInt(varNumAfil.getText());
           Pago pago = new Pago(varFecha.getText(), cbCuotas.getSelectedIndex());
           emp.addPago(pago, numAf);
           JOptionPane.showMessageDialog(this, "Pago realizado con Exito!!");
        }catch(ComprobarPagoCuotaException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error: No ingreso ningún dato, recuerdo que primero debe buscar el Afiliado");
        }                  
    }//GEN-LAST:event_buttonPagoActionPerformed

    private void cbCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCuotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonPago;
    private javax.swing.JComboBox<String> cbCuotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane textPane;
    private javax.swing.JTextField varFecha;
    private javax.swing.JTextField varNumAfil;
    // End of variables declaration//GEN-END:variables
}
