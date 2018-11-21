
package interfaz.grafica;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import laboratorio.Empresa;
import laboratorio.Movil;

public class VerRemoveMovilVent extends javax.swing.JInternalFrame {
    Empresa emp;
    
    public VerRemoveMovilVent(Empresa emp) {
        this.emp = emp;
        initComponents();
        armarList();
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
    public void armarList(){
        for(int i = 0; i < emp.getMovil().size(); i++){
            listMovil.add(emp.getMovil().get(i).getPatente());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        listMovil = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonActualizar = new javax.swing.JButton();

        setClosable(true);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(textPane);

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

        listMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMovilActionPerformed(evt);
            }
        });

        jLabel2.setText("Movil:");

        jLabel3.setText("Datos:");

        buttonActualizar.setText("Actualizar");
        buttonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarActionPerformed(evt);
            }
        });

        desktopPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(buttonModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(buttonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(listMovil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(buttonActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addComponent(buttonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listMovil, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModificar)
                    .addComponent(buttonEliminar)
                    .addComponent(buttonActualizar))
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
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        ModificarMovil ventana = new ModificarMovil(emp, emp.getMovil().get(listMovil.getSelectedIndex()).getPatente());
        desktopPane.add(ventana);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation (((desktopSize.width - FrameSize.width)/2), ((desktopSize.height - FrameSize.height)/2));
        ventana.show();
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar el movil?", "", JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION==opcion){
            if(emp.eliminarMovil(emp.getMovil().get(listMovil.getSelectedIndex()).getPatente())){
                JOptionPane.showMessageDialog(this, "Movil eliminado con Exito!!");
            }else{
                JOptionPane.showMessageDialog(this, "ERROR!!");
            }
        }
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void listMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMovilActionPerformed
        desbloquear();
        textPane.setText("Marca: " + emp.getMovil().get(listMovil.getSelectedIndex()).getMarca() + "\nModelo: " + emp.getMovil().get(listMovil.getSelectedIndex()).getModelo()+ "\nPatente: " + emp.getMovil().get(listMovil.getSelectedIndex()).getPatente()+ "\nAño: " + emp.getMovil().get(listMovil.getSelectedIndex()).getAño());
        
     
                
    }//GEN-LAST:event_listMovilActionPerformed

    private void buttonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarActionPerformed
        listMovil.clear();
        textPane.setText("");
        armarList();
        bloquear();
    }//GEN-LAST:event_buttonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List listMovil;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
