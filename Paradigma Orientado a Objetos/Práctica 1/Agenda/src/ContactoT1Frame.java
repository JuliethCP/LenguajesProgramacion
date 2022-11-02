public class ContactoT1Frame extends javax.swing.JFrame {

    public ContactoT1Frame() {
        initComponents();
    }


    private void initComponents() {

        jLabelid = new javax.swing.JLabel();
        jLabelnombre = new javax.swing.JLabel();
        jLabeledad = new javax.swing.JLabel();
        jLabelgenero = new javax.swing.JLabel();
        jLabeldireccion = new javax.swing.JLabel();
        jLabeltelefono = new javax.swing.JLabel();
        jLabelcorreo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();
        jTextFieldnombre = new javax.swing.JTextField();
        jTextFieldedad = new javax.swing.JTextField();
        jTextFieldgenero = new javax.swing.JTextField();
        jTextFielddireccion = new javax.swing.JTextField();
        jTextFieldtelefono = new javax.swing.JTextField();
        jTextFieldcorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelid.setText("Id");

        jLabelnombre.setText("Nombre");

        jLabeledad.setText("Edad");

        jLabelgenero.setText("Genero");

        jLabeldireccion.setText("Direccion");

        jLabeltelefono.setText("Telefono");

        jLabelcorreo.setText("Correo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel8.setText("Contacto T1");

        jTextFieldid.setText("jTextField1");

        jTextFieldnombre.setText("jTextField2");

        jTextFieldedad.setText("jTextField3");

        jTextFieldgenero.setText("jTextField4");

        jTextFielddireccion.setText("jTextField5");

        jTextFieldtelefono.setText("jTextField6");

        jTextFieldcorreo.setText("jTextField7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabeledad, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldnombre)
                                    .addComponent(jTextFieldedad)
                                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelgenero)
                                .addGap(29, 29, 29)
                                .addComponent(jTextFieldgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabeldireccion)
                                    .addComponent(jLabeltelefono)
                                    .addComponent(jLabelcorreo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(jTextFielddireccion)
                                    .addComponent(jTextFieldtelefono)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel8)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelid)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnombre)
                    .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeledad))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelgenero)
                    .addComponent(jTextFieldgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeldireccion)
                    .addComponent(jTextFielddireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltelefono)
                    .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcorreo)
                    .addComponent(jTextFieldcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabeldireccion;
    private javax.swing.JLabel jLabeledad;
    private javax.swing.JLabel jLabelgenero;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JLabel jLabelcorreo;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JLabel jLabeltelefono;
    public javax.swing.JTextField jTextFielddireccion;
    public javax.swing.JTextField jTextFieldedad;
    public javax.swing.JTextField jTextFieldgenero;
    public javax.swing.JTextField jTextFieldid;
    public javax.swing.JTextField jTextFieldcorreo;
    public javax.swing.JTextField jTextFieldnombre;
    public javax.swing.JTextField jTextFieldtelefono;
    // End of variables declaration//GEN-END:variables
}