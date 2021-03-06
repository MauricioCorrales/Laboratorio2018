/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.grafica;

import Exception.ComprobarDocumentoException;
import Exception.CustomException;
import javax.swing.JOptionPane;
import laboratorio.Afiliado;
import laboratorio.Empresa;

/**
 *
 * @author Marcelo
 */
public class ModificarAfiliado extends javax.swing.JInternalFrame {

    Empresa emp;
    int numAf1;
    /**
     * Creates new form ModificarAfiliado
     */
    public ModificarAfiliado(Empresa emp, String numAf) {
        this.emp = emp;
        initComponents();
        cargarDatos(numAf);
    }

    public void cargarDatos(String numAf2){
        int numAf = Integer.parseInt(numAf2);
        Afiliado afil = emp.buscarAf(numAf);
        varNumAfil.setText(numAf2);
        varDni.setText(afil.getDni());
        varNombre.setText(afil.getNombre());
        varApellido.setText(afil.getApellido());
        String edad = String.valueOf(afil.getEdad());
        varEdad.setText(edad);
        varSexo.setText(afil.getSexo());
        varDomicilio.setText(afil.getDomicilio());
        numAf1 = numAf;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        varApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        varNumAfil = new javax.swing.JTextField();
        varNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        varDomicilio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        varSexo = new javax.swing.JTextField();
        varDni = new javax.swing.JFormattedTextField();
        varEdad = new javax.swing.JFormattedTextField();

        setClosable(true);

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Sexo:");

        varApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Domicilio:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nº de Afiliado:");

        varNumAfil.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        varNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        varNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        varDomicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nº Documento:");

        varSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSexoActionPerformed(evt);
            }
        });

        varDni.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory(){
            public javax.swing.JFormattedTextField.AbstractFormatter
            getFormatter(javax.swing.JFormattedTextField tf){
                try{
                    return new javax.swing.text.MaskFormatter("##.###.###");
                } catch (java.text.ParseException pe){
                    pe.printStackTrace(); 
                }
                return null;
            }
        });
        varDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        varEdad.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory(){
            public javax.swing.JFormattedTextField.AbstractFormatter
            getFormatter(javax.swing.JFormattedTextField tf){
                try{
                    return new javax.swing.text.MaskFormatter("##");
                } catch (java.text.ParseException pe){
                    pe.printStackTrace(); 
                }
                return null;
            }
        });
        varEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        varEdad.setToolTipText("");
        varEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(varNumAfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(varNombre)
                                    .addGap(22, 22, 22)))
                            .addGap(183, 183, 183))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(buttonModificar)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(varApellido))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(varDni, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(varNumAfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(varApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(varDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(varEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(varSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonModificar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        try{
            int numAf = Integer.parseInt(varNumAfil.getText());
            int edad = Integer.parseInt(varEdad.getText());
            Afiliado afil = new Afiliado(varNombre.getText(), varApellido.getText(), edad, varSexo.getText(), varDni.getText(), varDomicilio.getText(), numAf);
            Afiliado afil2 = emp.buscarAf(numAf1);
            afil.getFlia().addAll(afil2.getFlia());
            emp.eliminarAf(numAf1);
            emp.validarDni(varDni.getText());
            emp.addAfiliado(afil);
            JOptionPane.showMessageDialog(null, "Afiliado modificado con Exito!!");
        }catch(ComprobarDocumentoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(CustomException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el afiliado");
        }
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void varNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNombreActionPerformed

    private void varSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varSexoActionPerformed

    private void varEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField varApellido;
    private javax.swing.JFormattedTextField varDni;
    private javax.swing.JTextField varDomicilio;
    private javax.swing.JFormattedTextField varEdad;
    private javax.swing.JTextField varNombre;
    private javax.swing.JTextField varNumAfil;
    private javax.swing.JTextField varSexo;
    // End of variables declaration//GEN-END:variables
}
