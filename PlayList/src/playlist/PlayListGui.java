/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package playlist;

/**
 *
 * @author adria
 */
public class PlayListGui extends javax.swing.JFrame {
    private InterfaceA mygenreA;
    private InterfaceA mygenreB;
    private InterfaceB mylikedSong;

    /**
     * Creates new form PlayListGui
     */
    public PlayListGui() {
        mygenreA = new genreA();
        mygenreB = new genreB();
        mylikedSong = new LikedSong();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Namelbl = new javax.swing.JLabel();
        Genrelbl = new javax.swing.JLabel();
        Namefld = new javax.swing.JTextField();
        Genrefld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txtarea1 = new javax.swing.JTextArea();
        Addbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txtarea2 = new javax.swing.JTextArea();
        Movebtn = new javax.swing.JButton();
        Displaybtn = new javax.swing.JButton();
        Searchbtn = new javax.swing.JButton();
        Repeatbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Txtarea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));

        Namelbl.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Namelbl.setText("Song Name:");

        Genrelbl.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Genrelbl.setText("Song Genre:");

        Namefld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamefldActionPerformed(evt);
            }
        });

        Genrefld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenrefldActionPerformed(evt);
            }
        });

        Txtarea1.setColumns(20);
        Txtarea1.setRows(5);
        jScrollPane1.setViewportView(Txtarea1);

        Addbtn.setText("Add ");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Deletebtn.setText("Delete ");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Txtarea2.setColumns(20);
        Txtarea2.setRows(5);
        jScrollPane2.setViewportView(Txtarea2);

        Movebtn.setText("Move");
        Movebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovebtnActionPerformed(evt);
            }
        });

        Displaybtn.setText("Display Songs");
        Displaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplaybtnActionPerformed(evt);
            }
        });

        Searchbtn.setText("Search");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });

        Repeatbtn.setText("Repeat");
        Repeatbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepeatbtnActionPerformed(evt);
            }
        });

        Txtarea3.setColumns(20);
        Txtarea3.setRows(5);
        jScrollPane3.setViewportView(Txtarea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Movebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Namelbl)
                            .addComponent(Genrelbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Namefld, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(Genrefld)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(Displaybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(Repeatbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(287, 287, 287))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namelbl)
                    .addComponent(Namefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genrelbl)
                    .addComponent(Genrefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn)
                    .addComponent(Movebtn)
                    .addComponent(Searchbtn))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deletebtn)
                    .addComponent(Displaybtn)
                    .addComponent(Repeatbtn))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamefldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamefldActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_NamefldActionPerformed

    private void GenrefldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenrefldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenrefldActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        Song myS = new Song();
        
        myS.setSongName(Namefld.getText());
        myS.setSongGenre(Genrefld.getText());
        Namefld.setText("");
        Genrefld.setText("");
        
        if (myS.getSongGenre().equalsIgnoreCase("pop")){
            mygenreA.engueue(mylikedSong.pop());
            Txtarea1.append(Namefld.getText()+",was added to the pop playlist\n");
        }else if (myS.getSongGenre().equalsIgnoreCase("rock")){
            mygenreB.engueue(mylikedSong.rock());
            Txtarea2.append(Namefld.getText()+", was added to the rock playlist\n");
        }else{
            Txtarea3.append("invalid input,please add either pop or rock music\n");
            
        }
        
        
    }//GEN-LAST:event_AddbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        String songNameDelete = Namefld.getText();
        
        if(mygenreA.contains(songNameDelete)){
            mygenreA.remove(songNameDelete);
            Txtarea1.append(songNameDelete + "was removed from pop playlist\n");
        }
        if(mygenreB.contains(songNameDelete)){
            mygenreB.remove(songNameDelete);
            Txtarea2.append(songNameDelete +"was removed from rock playlist\n");
            
        }
        if(mylikedSong.contains(songNameDelete)){
            mylikedSong.remove(songNameDelete);
            Txtarea3.append(songNameDelete +" was removed from liked playlist\n");
        }
        Namefld.setText("");
        Genrefld.setText("");
        
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void MovebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovebtnActionPerformed
        // TODO add your handling code here:
        String genre = Genrefld.getText().toLowerCase();
        
        String songName = Namefld.getText();
        
        if(genre.equals("pop")){
            mygenreA.engueue(songName);
            Txtarea1.append(songName + " was added to the pop playlist\n");
        }else if(genre.equals("rock")){
            mygenreB.engueue(songName);
            Txtarea2.append(songName + " was added to the rock playlist\n");
        }else{
            Txtarea3.append("Invalis input please add either pop or rock music\n");
            
        }
        Namefld.setText("");
        Genrefld.setText("");
    }//GEN-LAST:event_MovebtnActionPerformed

    private void DisplaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplaybtnActionPerformed
        // TODO add your handling code here:
        Txtarea3.append(mylikedSong.displayStack()+"\n");
        Txtarea1.append(mygenreA.displayQueue()+"\n");
        Txtarea2.append(mygenreB.displayQueue()+"\n");
        
        
    }//GEN-LAST:event_DisplaybtnActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void RepeatbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepeatbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepeatbtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PlayListGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayListGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayListGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayListGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayListGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Displaybtn;
    private javax.swing.JTextField Genrefld;
    private javax.swing.JLabel Genrelbl;
    private javax.swing.JButton Movebtn;
    private javax.swing.JTextField Namefld;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JButton Repeatbtn;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTextArea Txtarea1;
    private javax.swing.JTextArea Txtarea2;
    private javax.swing.JTextArea Txtarea3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
