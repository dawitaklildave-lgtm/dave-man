
public class CALA extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CALA.class.getName());
 double firstNum;
double secondNum;
double result;
String operations;
String history = ""; 
String expression = "";
    public CALA() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        b8 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDisplay = new javax.swing.JTextField();
        jbtnbac = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        bback = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        bequal = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b8.setText("8");
        b8.addActionListener(this::b8ActionPerformed);

        jButton21.setBackground(new java.awt.Color(102, 102, 255));
        jButton21.setText("(-)");
        jButton21.addActionListener(this::jButton21ActionPerformed);

        b6.setText("6");
        b6.addActionListener(this::b6ActionPerformed);

        b0.setText("0");
        b0.addActionListener(this::b0ActionPerformed);

        bsub.setBackground(new java.awt.Color(153, 153, 255));
        bsub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bsub.setText("-");
        bsub.addActionListener(this::bsubActionPerformed);

        b7.setText("7");
        b7.addActionListener(this::b7ActionPerformed);

        b5.setText("5");
        b5.addActionListener(this::b5ActionPerformed);

        b3.setText("3");
        b3.addActionListener(this::b3ActionPerformed);

        badd.setBackground(new java.awt.Color(153, 153, 255));
        badd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        badd.setText("+");
        badd.addActionListener(this::baddActionPerformed);

        b1.setText("1");
        b1.addActionListener(this::b1ActionPerformed);

        b2.setText("2");
        b2.addActionListener(this::b2ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("SIMPLE CALCULATOR");

        txtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.addActionListener(this::txtDisplayActionPerformed);

        jbtnbac.setBackground(new java.awt.Color(102, 255, 255));
        jbtnbac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnbac.setText("<-");
        jbtnbac.addActionListener(this::jbtnbacActionPerformed);

        button2.setBackground(new java.awt.Color(153, 0, 153));
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.setText("c");
        button2.addActionListener(this::button2ActionPerformed);

        bback.setBackground(new java.awt.Color(102, 102, 255));
        bback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bback.setText("x");
        bback.addActionListener(this::bbackActionPerformed);

        bmul.setBackground(new java.awt.Color(0, 204, 255));
        bmul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bmul.setForeground(new java.awt.Color(153, 153, 255));
        bmul.setText("*");
        bmul.addActionListener(this::bmulActionPerformed);

        b9.setText("9");
        b9.addActionListener(this::b9ActionPerformed);

        bdiv.setBackground(new java.awt.Color(153, 153, 255));
        bdiv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bdiv.setText("/");
        bdiv.addActionListener(this::bdivActionPerformed);

        bdot.setText(".");
        bdot.addActionListener(this::bdotActionPerformed);

        b4.setText("4");
        b4.addActionListener(this::b4ActionPerformed);

        bequal.setBackground(new java.awt.Color(0, 255, 204));
        bequal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bequal.setText("=");
        bequal.addActionListener(this::bequalActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnbac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bback, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bmul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bdiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtDisplay))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jbtnbac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"4");
    }//GEN-LAST:event_b4ActionPerformed

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
        String str = txtDisplay.getText();
        if (str.length() > 0) {
           
            if (str.endsWith(" ")) {
                txtDisplay.setText(str.substring(0, str.length() - 3));
            } else {
                txtDisplay.setText(str.substring(0, str.length() - 1));
            }
        }
    }//GEN-LAST:event_bbackActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
        String current = txtDisplay.getText();
     
        if(!current.isEmpty()) {
            txtDisplay.setText(current + " / ");
        }
    }//GEN-LAST:event_bdivActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "9");
    }//GEN-LAST:event_b9ActionPerformed

    private void jbtnbacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbacActionPerformed
 txtDisplay.setText(history);
        
    }//GEN-LAST:event_jbtnbacActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        String current = txtDisplay.getText();
       
        if(!current.isEmpty()) {
            txtDisplay.setText(current + " + ");
        }
    }//GEN-LAST:event_baddActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "0");
    }//GEN-LAST:event_b0ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        String history = txtDisplay.getText();
        txtDisplay.setText("");
    }//GEN-LAST:event_button2ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "7");
    }//GEN-LAST:event_b7ActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
        String current = txtDisplay.getText();
     
        if(!current.isEmpty()) {
            txtDisplay.setText(current + " - ");
        }
    }//GEN-LAST:event_bsubActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
        try {
            String data = txtDisplay.getText();

            // በባዶ ቦታ (space) አማካኝነት ቁጥሮችን እና ምልክቶችን መለየት
            String[] parts = data.split(" ");
            double total = Double.parseDouble(parts[0]);

            for (int i = 1; i < parts.length; i += 2) {
                String op = parts[i];
                double nextNum = Double.parseDouble(parts[i+1]);

                if (op.equals("+")) total += nextNum;
                else if (op.equals("-")) total -= nextNum;
                else if (op.equals("*")) total *= nextNum;
                else if (op.equals("/")) total /= nextNum;
            }

            String history = data; // ለ CE መመለሻ እንዲሆን ታሪኩን እንይዛለን
            txtDisplay.setText(String.valueOf(total)); // ውጤቱን ማሳየት

        } catch (Exception e) {
            txtDisplay.setText("Error");
        }
    }//GEN-LAST:event_bequalActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
        String current = txtDisplay.getText();
       
        if(!current.isEmpty()) {
            txtDisplay.setText(current + " * ");
        }
    }//GEN-LAST:event_bmulActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String current = txtDisplay.getText();
        if (current.isEmpty() || current.endsWith(" ")) {
            txtDisplay.setText(current + "-");
        }
       
        else {
           
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "8");
    }//GEN-LAST:event_b8ActionPerformed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        txtDisplay.setText("");
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + "3");
    }//GEN-LAST:event_b3ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        String current = txtDisplay.getText();
        txtDisplay.setText(current + ".");
    }//GEN-LAST:event_bdotActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> new CALA().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton bback;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bsub;
    private javax.swing.JButton button2;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnbac;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
