/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.grafica;

import laboratorio.Afiliado;
import laboratorio.Empresa;

/**
 *
 * @author Marcelo
 */
public class HistoriaClinicaVent extends javax.swing.JInternalFrame {

    Empresa emp;
    /**
     * Creates new form HistoriaClinicaVent
     */
    public HistoriaClinicaVent(Empresa emp, String numAf) {
        this.emp=emp;
        initComponents();
        armarList(numAf);
        labelAfiliado.setText("Afiliado: " + numAf);
    }

    public void armarList(String numAf1){
        int numAf = Integer.parseInt(numAf1);
        Afiliado afi = emp.buscarAf(numAf);
        for(int i=0;i<afi.getRegsol().size(); i++){
            listSoli.add(afi.getRegsol().get(i).getFecha().getDia()+"/"+afi.getRegsol().get(i).getFecha().getMes()+"/"+afi.getRegsol().get(i).getFecha().getAño());
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

        listSoli = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneRes = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        labelAfiliado = new javax.swing.JLabel();

        setClosable(true);

        listSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSoliActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Solicitudes:");

        jScrollPane1.setViewportView(textPaneRes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Datos:");

        labelAfiliado.setText("Afiliado: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listSoli, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(labelAfiliado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labelAfiliado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(listSoli, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSoliActionPerformed
        int numAf = Integer.parseInt(labelAfiliado.getText());
        Afiliado afi = emp.buscarAf(numAf);
        if(!afi.getRegsol().get(listSoli.getSelectedIndex()).getFamiliar().equals("")){
            textPaneRes.setText("Nº Solicitud: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getNumSoli() + "\nDoctor: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getDoctor() + "\nEnfermero: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getEnfermero()+ "\nMovil: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getMovil() + "\nChofer: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getChofer() + "\nTipo: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getTipo() + "\nResultados: " + "\nDiagnostico: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getRegRes().getDiagnostico() + "\nTratamiento: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getRegRes().getTratamiento());
        }else{
            textPaneRes.setText("Nº Solicitud: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getNumSoli() + "\nFamiliar: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getFamiliar()+ "\nDoctor: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getDoctor() + "\nEnfermero: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getEnfermero()+ "\nMovil: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getMovil() + "\nChofer: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getChofer() + "\nTipo: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getTipo() + "\nResultados: " + "\nDiagnostico: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getRegRes().getDiagnostico() + "\nTratamiento: " + afi.getRegsol().get(listSoli.getSelectedIndex()).getRegRes().getTratamiento());
        }
    }//GEN-LAST:event_listSoliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAfiliado;
    private java.awt.List listSoli;
    private javax.swing.JTextPane textPaneRes;
    // End of variables declaration//GEN-END:variables
}