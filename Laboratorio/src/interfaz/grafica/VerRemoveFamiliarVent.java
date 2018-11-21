/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.grafica;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import laboratorio.Afiliado;
import laboratorio.Empresa;

/**
 *
 * @author Marcelo
 */
public class VerRemoveFamiliarVent extends javax.swing.JInternalFrame {
    
    Empresa emp;
    /**
     * Creates new form VerFamiliarVent
     */
    public VerRemoveFamiliarVent(Empresa empr, String numAfil) {
        this.emp = empr;
        initComponents();
        armarList(numAfil);
        bloquear();
    }
    
    public void bloquear(){
        buttonModificar.setEnabled(false);
        buttonEliminar.setEnabled(false);
    }
    public void desbloquear(){
        buttonModificar.setEnabled(true);
        buttonEliminar.setEnabled(true);
    }


    public void armarList(String numAfil){
        labelNumAfil.setText(numAfil);
        int numAf = Integer.parseInt(numAfil);
        Afiliado afi = emp.buscarAf(numAf);
        for(int i = 0; i < afi.getFlia().size(); i++){
            listFlia.add(afi.getFlia().get(i).getNombre() + " " + afi.getFlia().get(i).getApellido());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        labelFlia = new javax.swing.JLabel();
        listFlia = new java.awt.List();
        labelDatos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        labelNumAfil = new javax.swing.JLabel();
        buttonActualizar = new javax.swing.JButton();

        setClosable(true);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nº Afiliado:");

        labelFlia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFlia.setText("Familiares:");

        listFlia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFliaActionPerformed(evt);
            }
        });

        labelDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDatos.setText("Datos:");

        jScrollPane2.setViewportView(textPane);

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        buttonActualizar.setText("Actualizar");
        buttonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarActionPerformed(evt);
            }
        });

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelFlia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(listFlia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelDatos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(buttonModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(buttonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelNumAfil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(buttonActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumAfil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonEliminar)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listFlia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelFlia)))
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(labelDatos))
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(labelNumAfil, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDatos)
                    .addComponent(labelFlia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonModificar)
                            .addComponent(buttonEliminar)
                            .addComponent(buttonActualizar)))
                    .addComponent(listFlia, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        try{
        int numAf = Integer.parseInt(labelNumAfil.getText());
        Afiliado afi = emp.buscarAf(numAf);
        if(emp.eliminarFlia(numAf, afi.getFlia().get(listFlia.getSelectedIndex()).getDni())){
            JOptionPane.showMessageDialog(this, "Familiar eliminado con Exito!!");
            textPane.setText("");
            listFlia.clear();
            armarList(labelNumAfil.getText());
            bloquear();
        }}
        catch (NumberFormatException e){
           
            JOptionPane.showMessageDialog(null,"Error: Primero debe seleccionar un familiar");
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null,"Error: Primero debe elegir el Familiar");
        }
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void listFliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFliaActionPerformed
        desbloquear();
        int numAf = Integer.parseInt(labelNumAfil.getText());
        Afiliado afi = emp.buscarAf(numAf);
        String edad = String.valueOf(afi.getFlia().get(listFlia.getSelectedIndex()).getEdad());
        textPane.setText("Tipo de Familiar: " + afi.getFlia().get(listFlia.getSelectedIndex()).getTipoFamiliar() + "\nNombre: " + afi.getFlia().get(listFlia.getSelectedIndex()).getNombre() + "\nApellido: " + afi.getFlia().get(listFlia.getSelectedIndex()).getApellido() + "\nNº Documento: " + afi.getFlia().get(listFlia.getSelectedIndex()).getDni() + "\nEdad: " + edad + "\nSexo: " + afi.getFlia().get(listFlia.getSelectedIndex()).getSexo() + "\nDomicilio: " + afi.getFlia().get(listFlia.getSelectedIndex()).getDomicilio());
        
    }//GEN-LAST:event_listFliaActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        

        
        int numAf = Integer.parseInt(labelNumAfil.getText());
        Afiliado afil = emp.buscarAf(numAf);
        if(!(listFlia == null)){
        String numAf2 = String.valueOf(afil.getNumAfiliado());
        ModificarFamiliar ventana = new ModificarFamiliar(emp, numAf2, afil.getFlia().get(listFlia.getSelectedIndex()).getDni());
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation (((desktopSize.width - FrameSize.width)/2), ((desktopSize.height - FrameSize.height)/2));
        ventana.show();
        }else{
                JOptionPane.showMessageDialog(null,"ERROR: Primero debe BUSCAR el Afiliado");
            }
        
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarActionPerformed
        listFlia.clear();
        textPane.setText("");
        armarList(labelNumAfil.getText());
        bloquear();
    }//GEN-LAST:event_buttonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelFlia;
    private javax.swing.JLabel labelNumAfil;
    private java.awt.List listFlia;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
