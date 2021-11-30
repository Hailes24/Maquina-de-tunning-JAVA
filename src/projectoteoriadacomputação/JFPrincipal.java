/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoteoriadacomputação;

/**
 *
 * @author Hailes Maurício
 */
public class JFPrincipal extends javax.swing.JFrame {

    private String word01, word02, word03, maquina[], quadrupla[] = new String [20];
    private int estado, tamanho, ponteiro = 2, i = 0, contQuad = 0;
    private char[] entrada;
    //private javax.swing.JTextField[] JTextField; 
    //private javax.swing.JLabel[] JLabel;
    
    public JFPrincipal() {
        initComponents();
        this.jButton5.setVisible(false);        
        this.jTFpalavra1.setVisible(false);        
        this.jL2.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFpalavra = new javax.swing.JTextField();
        jLentrada = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTF01 = new javax.swing.JTextField();
        jTF02 = new javax.swing.JTextField();
        jTF03 = new javax.swing.JTextField();
        jTF04 = new javax.swing.JTextField();
        jTF05 = new javax.swing.JTextField();
        jTF06 = new javax.swing.JTextField();
        jTF07 = new javax.swing.JTextField();
        jTF08 = new javax.swing.JTextField();
        jTF09 = new javax.swing.JTextField();
        jTF10 = new javax.swing.JTextField();
        jTF11 = new javax.swing.JTextField();
        jTF012 = new javax.swing.JTextField();
        jL01 = new javax.swing.JLabel();
        jL02 = new javax.swing.JLabel();
        jL03 = new javax.swing.JLabel();
        jL04 = new javax.swing.JLabel();
        jL05 = new javax.swing.JLabel();
        jL06 = new javax.swing.JLabel();
        jL07 = new javax.swing.JLabel();
        jL08 = new javax.swing.JLabel();
        jL09 = new javax.swing.JLabel();
        jL10 = new javax.swing.JLabel();
        jL11 = new javax.swing.JLabel();
        jL12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTFpalavra1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jL2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maquina de Turing - TC");

        jLentrada.setText("Insira a entrada:");

        jButton2.setText("Carregar a palavra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Executar Passo/Passo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTF01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF01.setText("*");

        jTF02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF02.setText("*");

        jTF03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF03.setText("*");

        jTF04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF04.setText("*");

        jTF05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF05.setText("*");

        jTF06.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF06.setText("*");

        jTF07.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF07.setText("*");

        jTF08.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF08.setText("*");

        jTF09.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF09.setText("*");

        jTF10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF10.setText("*");

        jTF11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF11.setText("*");

        jTF012.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF012.setText("*");

        jL01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL01.setText("_");
        jL01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL02.setText("_");
        jL02.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL03.setText("_");
        jL03.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL04.setText("_");
        jL04.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL05.setText("_");
        jL05.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL06.setText("_");
        jL06.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL07.setText("_");
        jL07.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL08.setText("_");
        jL08.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL09.setText("_");
        jL09.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL10.setText("_");
        jL10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL11.setText("_");
        jL11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jL12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL12.setText("_");
        jL12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setText("Cadastrar quadrupula");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jL2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jL2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLentrada)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTFpalavra)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTF01, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF02, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF03, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF04, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF05, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF06, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF07, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF08, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF09, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF012, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jL01, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL02, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL03, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL04, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL05, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL06, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL07, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL08, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL09, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jL2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFpalavra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLentrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFpalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL01)
                    .addComponent(jL02)
                    .addComponent(jL03)
                    .addComponent(jL04)
                    .addComponent(jL05)
                    .addComponent(jL06)
                    .addComponent(jL07)
                    .addComponent(jL08)
                    .addComponent(jL09)
                    .addComponent(jL10)
                    .addComponent(jL11)
                    .addComponent(jL12))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFpalavra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTFpalavra.getAccessibleContext().setAccessibleName("jTF_entrada");
        jLentrada.getAccessibleContext().setAccessibleName("jLentrada");
        jButton2.getAccessibleContext().setAccessibleName("jB_carregar");
        jButton3.getAccessibleContext().setAccessibleName("jB_passaApasso");
        jTF01.getAccessibleContext().setAccessibleName("TB01");
        jButton4.getAccessibleContext().setAccessibleName("Cadastrarquadrupula");
        jButton4.getAccessibleContext().setAccessibleDescription("");
        jTFpalavra1.getAccessibleContext().setAccessibleName("txtQuadrupulaInsert");
        jButton5.getAccessibleContext().setAccessibleName("btnInsert");
        jL2.getAccessibleContext().setAccessibleName("txtQuadrupla");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        word01 = this.jTFpalavra.getText();
        word02 = ("*" + this.word01 + "*");
        tamanho = this.word02.length();
        maquina = new String [this.tamanho];
        for (int i = 0; i < maquina.length; i++) {
            maquina[i] = ("" + word02.charAt(i));
        }
        inicializa();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (this.jButton4.getText().equalsIgnoreCase("Ocultar quadrupula")) {
            this.jButton5.setVisible(false);        
            this.jTFpalavra1.setVisible(false);        
            this.jL2.setVisible(false);
            this.jButton4.setText("Cadastrar quadrupula");
        }else{
            this.jButton5.setVisible(true);        
            this.jTFpalavra1.setVisible(true);        
            this.jL2.setVisible(true);
            this.jButton4.setText("Ocultar quadrupula");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cadastrarEntradas(){
        int tamanho = contQuad;
        entrada = new char[tamanho];
        //System.out.println("tamanho:" + tamanho);
        for (int i = 0; i < tamanho; i++) {
            entrada[i] = quadrupla[i].charAt(4);
        }
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if ( (this.jTFpalavra1.getText().length() >= 9 && this.jTFpalavra1.getText().length() <= 11) && this.jTFpalavra1.getText().contains(",") && this.jTFpalavra1.getText().contains("q")) {
            this.jL2.setText(this.jL2.getText() + "<" + this.jTFpalavra1.getText() + "> | "); 
            quadrupla[contQuad] = this.jL2.getText();
            System.out.print(quadrupla[contQuad].charAt(4));
            contQuad++;
            this.jTFpalavra1.setText("");
            
        }else{
            
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        cadastrarEntradas();
        
        q0(quadrupla[0].charAt(6), true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void moveToRight(){
        switch(ponteiro){
            case 1: 
            break;
            case 2: 
                jL02.setText("_");
                jL03.setText("^");
            break;
            case 3: 
                jL03.setText("_");
                jL04.setText("^");
            break;
            case 4: 
                jL04.setText("_");
                jL05.setText("^");
            break;
            case 5: 
                jL05.setText("_");
                jL06.setText("^");
            break;
            case 6: 
                jL06.setText("_");
                jL07.setText("^");
            break;
            case 7: 
                jL07.setText("_");
                jL08.setText("^");
            break;
            case 8: 
                jL08.setText("_");
                jL09.setText("^");
            break;
            case 9: 
                jL09.setText("_");
                jL10.setText("^");
            break;
            case 10: 
                jL10.setText("_");
                jL11.setText("^");
            break;
            case 11: 
                jL11.setText("_");
                jL12.setText("^");
            break;
            case 12: 

            break;
        }
        this.ponteiro++;
    }
    
    private void moveToLeft(){
        switch(ponteiro){
            case 1: 
            break;
            case 2: 
                jL02.setText("_");
                jL01.setText("^");
            break;
            case 3: 
                jL03.setText("_");
                jL02.setText("^");
            break;
            case 4: 
                jL04.setText("_");
                jL03.setText("^");
            break;
            case 5: 
                jL05.setText("_");
                jL04.setText("^");
            break;
            case 6: 
                jL06.setText("_");
                jL05.setText("^");
            break;
            case 7: 
                jL07.setText("_");
                jL06.setText("^");
            break;
            case 8: 
                jL08.setText("_");
                jL07.setText("^");
            break;
            case 9: 
                jL09.setText("_");
                jL08.setText("^");
            break;
            case 10: 
                jL10.setText("_");
                jL09.setText("^");
            break;
            case 11: 
                jL11.setText("_");
                jL10.setText("^");
            break;
            case 12: 
                jL12.setText("_");
                jL11.setText("^");
            break;
        }
        this.ponteiro--;
    }
    
    private void q0 (char nWrite, boolean move){
         int cont = 1;
        switch(ponteiro){
            case 1:    break;
            case 2: jTF02.setText(nWrite+"");break;
            case 3: jTF03.setText(nWrite+"");break;
            case 4: if (jTF04.getText().equals("*")) {
                    break;
                    }
                    jTF04.setText(nWrite+""); break;
            case 5: if (jTF05.getText().equals("*")) {
                    break;
                    }
                    jTF05.setText(nWrite+"");break;
            case 6: if (jTF06.getText().equals("*")) {
                    break;
                    }
                jTF06.setText(nWrite+"");break;
            case 7: if (jTF07.getText().equals("*")) {
                    break;
                    } 
                jTF07.setText(nWrite+"");break;
            case 8: if (jTF08.getText().equals("*")) {
                    break;
                    }
                    jTF08.setText(nWrite+"");break;
            case 9: if (jTF09.getText().equals("*")) {
                    break;
                    }
                    jTF09.setText(nWrite+"");break;
            case 10: 
                    if (jTF10.getText().equals("*")) {
                    break;
                    } 
                    jTF10.setText(nWrite+"");break;
            case 11: if (jTF11.getText().equals("*")) {
                    break;
                    } 
                    jTF11.setText(nWrite+""); break;
            case 12: 
                    if (jTF012.getText().equals("*")) {
                    break;
                    } 
                    jTF012.setText(nWrite+""); break;
        }
        if (move) {
            moveToRight();
        }else{
            moveToLeft();
        }
        if (ponteiro == 12) {

        }else{
            if (quadrupla[cont] != null){
                q0(quadrupla[cont].charAt(6), true);
                cont++;
            }else{
                q0(quadrupla[cont-1].charAt(6), true);
            }
        }  
    }
    
    private void inicializa (){
        int posicao = 0;
        while(posicao < this.tamanho){
            switch(posicao){
                case 0: this.jTF01.setText(this.maquina[0]); break;
                case 1: this.jTF02.setText(this.maquina[1]); break;
                case 2: this.jTF03.setText(this.maquina[2]); break;
                case 3: this.jTF04.setText(this.maquina[3]); break;
                case 4: this.jTF05.setText(this.maquina[4]); break;
                case 5: this.jTF06.setText(this.maquina[5]); break;
                case 6: this.jTF07.setText(this.maquina[6]); break;
                case 7: this.jTF08.setText(this.maquina[7]); break;
                case 8: this.jTF09.setText(this.maquina[8]); break;
                case 9: this.jTF10.setText(this.maquina[9]); break;
                case 10: this.jTF11.setText(this.maquina[10]); break;
                case 11: this.jTF012.setText(this.maquina[11]); break;
            }
        posicao++;
        }
        this.jL02.setText("^");
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jL01;
    private javax.swing.JLabel jL02;
    private javax.swing.JLabel jL03;
    private javax.swing.JLabel jL04;
    private javax.swing.JLabel jL05;
    private javax.swing.JLabel jL06;
    private javax.swing.JLabel jL07;
    private javax.swing.JLabel jL08;
    private javax.swing.JLabel jL09;
    private javax.swing.JLabel jL10;
    private javax.swing.JLabel jL11;
    private javax.swing.JLabel jL12;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jLentrada;
    private javax.swing.JTextField jTF01;
    private javax.swing.JTextField jTF012;
    private javax.swing.JTextField jTF02;
    private javax.swing.JTextField jTF03;
    private javax.swing.JTextField jTF04;
    private javax.swing.JTextField jTF05;
    private javax.swing.JTextField jTF06;
    private javax.swing.JTextField jTF07;
    private javax.swing.JTextField jTF08;
    private javax.swing.JTextField jTF09;
    private javax.swing.JTextField jTF10;
    private javax.swing.JTextField jTF11;
    private javax.swing.JTextField jTFpalavra;
    private javax.swing.JTextField jTFpalavra1;
    // End of variables declaration//GEN-END:variables
}
