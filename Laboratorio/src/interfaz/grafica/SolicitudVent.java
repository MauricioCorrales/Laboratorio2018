
package interfaz.grafica;

import java.time.*;
import java.time.format.*;
import Exception.CustomException;
import javax.swing.JOptionPane;
import laboratorio.Empresa;
import laboratorio.Fecha;
import laboratorio.RegistroSolicitud;

public class SolicitudVent extends javax.swing.JInternalFrame {
    LocalDate fechaactual = LocalDate.now();
    private Empresa emp;

    public SolicitudVent(Empresa emp) {
        this.emp = emp;
        initComponents();
        fecha.setText(String.valueOf(fechaactual.getDayOfMonth()+"/"+fechaactual.getMonthValue()+"/"+fechaactual.getYear()));
        fecha1.setText(String.valueOf(fechaactual.getDayOfMonth()+"/"+fechaactual.getMonthValue()+"/"+fechaactual.getYear()));
        armarList();
    }
    
    public void armarList(){
        doc1.removeAllItems();doc.removeAllItems();af1.removeAllItems();af.removeAllItems();
        fa.removeAllItems();mo.removeAllItems();mo1.removeAllItems();enf.removeAllItems();
        enf1.removeAllItems();chof.removeAllItems();chof1.removeAllItems();
        doc1.addItem(null);doc.addItem(null);af1.addItem(null);af.addItem(null);fa.addItem(null);mo.addItem(null);
        mo1.addItem(null);enf.addItem(null);enf1.addItem(null);chof.addItem(null);chof1.addItem(null);
        for(int i=0;i<emp.getEmpleado().size();i++){
            if(emp.getEmpleado().get(i).getCategoria().equals("Doctor")){
                doc1.addItem(emp.getEmpleado().get(i).getNombre()+" "+emp.getEmpleado().get(i).getApellido());
                doc.addItem(emp.getEmpleado().get(i).getNombre()+" "+emp.getEmpleado().get(i).getApellido());
            }
            if(emp.getEmpleado().get(i).getCategoria().equals("Enfermero")){
                enf.addItem(emp.getEmpleado().get(i).getNombre()+" "+emp.getEmpleado().get(i).getApellido());
                enf1.addItem(emp.getEmpleado().get(i).getNombre()+" "+emp.getEmpleado().get(i).getApellido());
            }
            if(emp.getEmpleado().get(i).getCategoria().equals("Chofer")){
                chof.addItem(emp.getEmpleado().get(i).getNombre()+" "+emp.getEmpleado().get(i).getApellido());
                chof1.addItem(emp.getEmpleado().get(i).getNombre()+" "+emp.getEmpleado().get(i).getApellido());
            }
        }
        for(int i=0;i<emp.getAfiliado().size();i++){
            af1.addItem(emp.getAfiliado().get(i).getNombre()+" "+emp.getAfiliado().get(i).getApellido());
            af.addItem(emp.getAfiliado().get(i).getNombre()+" "+emp.getAfiliado().get(i).getApellido());
        }
        for(int i=0;i<emp.getMovil().size();i++){
            mo.addItem(emp.getMovil().get(i).getPatente());
            mo1.addItem(emp.getMovil().get(i).getPatente());
        }
        String x = String.valueOf(emp.getX());
        varNumSoli.setText(x);
        varNumSoli1.setText(x);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        doc1 = new javax.swing.JComboBox<>();
        guardar1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        tipo1 = new javax.swing.JComboBox<>();
        fa = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mo1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        varNumSoli = new javax.swing.JTextField();
        af1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        enf1 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        chof1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        doc = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        fecha = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        af = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        enf = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        chof = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        varNumSoli1 = new javax.swing.JTextField();

        setClosable(true);

        doc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc1ActionPerformed(evt);
            }
        });

        guardar1.setText("GUARDAR");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Familiar:");

        tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LEVE", "GRAVE", "MUY GRAVE", "ALTA" }));
        tipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo1ActionPerformed(evt);
            }
        });

        fa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faActionPerformed(evt);
            }
        });

        jLabel29.setText("Movil:");

        jLabel4.setText("Doctor:");

        mo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mo1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Fecha:");

        jLabel8.setText("Afiliado:");

        varNumSoli.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        varNumSoli.setEnabled(false);
        varNumSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNumSoliActionPerformed(evt);
            }
        });

        af1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                af1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        jLabel5.setText("Enfermero:");

        enf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enf1ActionPerformed(evt);
            }
        });

        jLabel31.setText("Chofer:");

        chof1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chof1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº Solicitud:");

        fecha1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fecha1.setEnabled(false);
        fecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doc1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(af1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varNumSoli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chof1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(af1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chof1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(varNumSoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Familiar", jPanel2);

        doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docActionPerformed(evt);
            }
        });

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha:");

        jLabel12.setText("Afiliado:");

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LEVE", "GRAVE", "MUY GRAVE", "ALTA" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        fecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fecha.setEnabled(false);
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jLabel32.setText("Movil:");

        af.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afActionPerformed(evt);
            }
        });

        jLabel7.setText("Doctor:");

        jLabel15.setText("Tipo:");

        mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moActionPerformed(evt);
            }
        });

        jLabel16.setText("Enfermero:");

        enf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enfActionPerformed(evt);
            }
        });

        jLabel33.setText("Chofer:");

        chof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chofActionPerformed(evt);
            }
        });

        jLabel3.setText("Nº Solicitud:");

        varNumSoli1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        varNumSoli1.setEnabled(false);
        varNumSoli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNumSoli1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chof, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 164, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varNumSoli1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(af, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(varNumSoli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Afiliado", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chof1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chof1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chof1ActionPerformed

    private void enf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enf1ActionPerformed

    private void af1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_af1ActionPerformed
        try{
            int numAf = emp.getAfiliado().get(af1.getSelectedIndex()-1).getNumAfiliado();
            int mes = fechaactual.getMonthValue();
            if(emp.validarSoli(mes, numAf)){
                for(int i=0;i<emp.getAfiliado().get(af1.getSelectedIndex()-1).getFlia().size();i++){
                    System.out.println("Aqui");
                    fa.addItem(emp.getAfiliado().get(af1.getSelectedIndex()-1).getFlia().get(i).getNombre()+" "+emp.getAfiliado().get(af1.getSelectedIndex()-1).getFlia().get(i).getApellido());
                }
            }else{
                JOptionPane.showMessageDialog(this,"Afiliado en mora", "ADVERTENCIA!!", 2);
                for(int i=0;i<emp.getAfiliado().get(af1.getSelectedIndex()-1).getFlia().size();i++){
                    fa.addItem(emp.getAfiliado().get(af1.getSelectedIndex()-1).getFlia().get(i).getNombre()+" "+emp.getAfiliado().get(af1.getSelectedIndex()-1).getFlia().get(i).getApellido());
                }
            }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }catch(CustomException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_af1ActionPerformed

    private void varNumSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNumSoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNumSoliActionPerformed

    private void mo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mo1ActionPerformed

    private void faActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faActionPerformed

    private void tipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo1ActionPerformed

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
        try{
            int numAf = emp.getAfiliado().get(af1.getSelectedIndex()-1).getNumAfiliado();
            int mes = fechaactual.getMonthValue();
            if(!emp.validarSoli(mes, numAf)){
                JOptionPane.showMessageDialog(this,"Afiliado sleccionado en mora","ERROR", 2);
            }else{
                String af3 = (String)af1.getSelectedItem();
                String fa3 = (String)fa.getSelectedItem();
                String doc3 = (String)doc1.getSelectedItem();
                String enf3 = (String)enf1.getSelectedItem();
                String mo3 = (String)mo1.getSelectedItem();
                String chof3 = (String)chof1.getSelectedItem();
                int numSoli1 = Integer.parseInt(varNumSoli.getText());
                Fecha f1 = new Fecha(fechaactual.getDayOfMonth(), fechaactual.getMonthValue(), fechaactual.getYear());
                String ti = (String)tipo1.getSelectedItem();
                RegistroSolicitud h = new RegistroSolicitud(af3, fa3, doc3, enf3, mo3, chof3, ti, f1, numSoli1);
                emp.getAfiliado().get(af1.getSelectedIndex()-1).getRegsol().add(h);
                emp.setX(emp.getX()+1);
                JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
                armarList();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error al ingresar o campo incompleto");
            /*nombre.setText("");
            apellido.setText("");
            edad.setText("");
            docu.setText("");
            fechaNacimiento.setText("");
            combo.setSelectedItem("SELECCIONAR:");*/
        }catch (Exception e){
              JOptionPane.showMessageDialog(null, "Error al ingresar o campo incompleto");
        }
    }//GEN-LAST:event_guardar1ActionPerformed

    private void doc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doc1ActionPerformed

    private void docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try{
            int numAf = emp.getAfiliado().get(af.getSelectedIndex()-1).getNumAfiliado();
            int mes = fechaactual.getMonthValue();
            if(!emp.validarSoli(mes, numAf)){
                JOptionPane.showMessageDialog(this,"Afiliado sleccionado en mora","ERROR", 2);
            }else{
                String af2 = (String)af.getSelectedItem();
                String doc2 = (String)doc.getSelectedItem();
                String enf2 = (String)enf.getSelectedItem();
                String mo2 = (String)mo.getSelectedItem();
                String chof2 = (String)chof.getSelectedItem();
                int numSoli2 = Integer.parseInt(varNumSoli1.getText());
                Fecha f2 = new Fecha(fechaactual.getDayOfMonth(), fechaactual.getMonthValue(), fechaactual.getYear());
                String ti2 = (String)tipo.getSelectedItem();
                RegistroSolicitud h = new RegistroSolicitud(af2, doc2, enf2, mo2, chof2, ti2, f2, numSoli2);
                emp.getAfiliado().get(af.getSelectedIndex()-1).getRegsol().add(h);
                emp.setX(emp.getX()+1);
                JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
                armarList();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error al ingresar o campo incompleto");
            /*nombre.setText("");
            apellido.setText("");
            edad.setText("");
            docu.setText("");
            fechaNacimiento.setText("");
            combo.setSelectedItem("SELECCIONAR:");*/
        }catch (Exception e){
              JOptionPane.showMessageDialog(null, "Error al ingresar o campo incompleto");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void afActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afActionPerformed
        try{
            int numAf = emp.getAfiliado().get(af.getSelectedIndex()-1).getNumAfiliado();
            int mes = fechaactual.getMonthValue();
            if(emp.validarSoli(mes, numAf)){   
            }else{
                JOptionPane.showMessageDialog(this,"Afiliado en mora", "ADVERTENCIA!!", 2);
            }
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }catch(CustomException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_afActionPerformed

    private void moActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moActionPerformed

    private void enfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enfActionPerformed

    private void chofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chofActionPerformed

    private void fecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha1ActionPerformed

    private void varNumSoli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNumSoli1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNumSoli1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> af;
    private javax.swing.JComboBox<String> af1;
    private javax.swing.JComboBox<String> chof;
    private javax.swing.JComboBox<String> chof1;
    private javax.swing.JComboBox<String> doc;
    private javax.swing.JComboBox<String> doc1;
    private javax.swing.JComboBox<String> enf;
    private javax.swing.JComboBox<String> enf1;
    private javax.swing.JComboBox<String> fa;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField fecha1;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> mo;
    private javax.swing.JComboBox<String> mo1;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JComboBox<String> tipo1;
    private javax.swing.JTextField varNumSoli;
    private javax.swing.JTextField varNumSoli1;
    // End of variables declaration//GEN-END:variables
}
