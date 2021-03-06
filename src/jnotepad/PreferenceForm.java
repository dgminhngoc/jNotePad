/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jnotepad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author ngoc1414
 */
public class PreferenceForm extends javax.swing.JFrame 
{
    private NotepadFrame notepad;
    private boolean settingChanged = false;
    /**
     * Creates new form PreferenceForm
     */
    public PreferenceForm()
    {
        initComponents();
          
    }
    
    public PreferenceForm( int language, int font, int size, NotepadFrame notepad )
    {
        initComponents();
        
        jComboBox_language.setSelectedIndex(language);
        jComboBox_font.setSelectedIndex(font);
        jComboBox_fontSize.setSelectedIndex(size);
        
        this.notepad = notepad;
        
        changeLanguage(language);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_language = new javax.swing.JLabel();
        jLabel_font = new javax.swing.JLabel();
        jLabel_fontSize = new javax.swing.JLabel();
        jComboBox_language = new javax.swing.JComboBox();
        jComboBox_font = new javax.swing.JComboBox();
        jButton_cancel = new javax.swing.JButton();
        jButton_apply = new javax.swing.JButton();
        jComboBox_fontSize = new javax.swing.JComboBox();
        jCheckBox_restoreDefault = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preference");

        jLabel_language.setText("Language");

        jLabel_font.setText("Font");

        jLabel_fontSize.setText("Size ");

        jComboBox_language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Vietnamese" }));
        jComboBox_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_languageActionPerformed(evt);
            }
        });

        jComboBox_font.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Serif", "Sans Serif", "Monospaced" }));
        jComboBox_font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_fontActionPerformed(evt);
            }
        });

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jButton_apply.setText("Apply");
        jButton_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_applyActionPerformed(evt);
            }
        });

        jComboBox_fontSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "14", "18", "22" }));
        jComboBox_fontSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_fontSizeActionPerformed(evt);
            }
        });

        jCheckBox_restoreDefault.setText("Restore all settings by default");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_fontSize)
                            .addComponent(jLabel_font)
                            .addComponent(jLabel_language)
                            .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_font, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                                    .addComponent(jComboBox_language, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_fontSize, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox_restoreDefault)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_language)
                    .addComponent(jComboBox_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_font)
                    .addComponent(jComboBox_font, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_fontSize)
                    .addComponent(jComboBox_fontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jCheckBox_restoreDefault)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel)
                    .addComponent(jButton_apply))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_languageActionPerformed
        settingChanged = true;
    }//GEN-LAST:event_jComboBox_languageActionPerformed

    private void jComboBox_fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_fontActionPerformed
        settingChanged = true;
    }//GEN-LAST:event_jComboBox_fontActionPerformed

    private void jComboBox_fontSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_fontSizeActionPerformed
        settingChanged = true;
    }//GEN-LAST:event_jComboBox_fontSizeActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_applyActionPerformed
        int languageSelected = jComboBox_language.getSelectedIndex();
        int fontSelected = jComboBox_font.getSelectedIndex();
        int fontSizeSelected = jComboBox_fontSize.getSelectedIndex();
        
        String notePadPath = NotepadFrame.class.getProtectionDomain().getCodeSource().getLocation().getPath();       
        File file1 = new File(notePadPath);
        String a = file1.getParent();
        File file = new File(a+"/NpConfig.conf");
             
        //if the setting has been changed, new config file will be create
               
        if( settingChanged == true ) 
        {   
            jComboBox_language.setSelectedIndex(languageSelected);
            jComboBox_font.setSelectedIndex(fontSelected);
            jComboBox_fontSize.setSelectedIndex(fontSizeSelected);
            
            notepad.updateDisplay(languageSelected, fontSelected, fontSizeSelected, false);
            
            setConfigFile(file, languageSelected, fontSelected, fontSizeSelected);
         }//end if 
        
        if( jCheckBox_restoreDefault.isSelected())
        {                   
            languageSelected = 0;
            fontSelected = 0;
            fontSizeSelected = 0;
            
            notepad.updateDisplay(languageSelected, fontSelected, fontSizeSelected, true);
            
            setConfigFile(file, languageSelected, fontSelected, fontSizeSelected);           
        }
        
        this.dispose();
    }//GEN-LAST:event_jButton_applyActionPerformed

    private void setConfigFile( File file, int languageSelected, int fontSelected, int fontSizeSelected )
    {
        try
            {   
                file.createNewFile();
            
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWrtier = new BufferedWriter(fileWriter);
            
                String data = languageSelected + "   " + fontSelected + "   " + fontSizeSelected;
                bufferedWrtier.write(data);
            
                bufferedWrtier.close();
                fileWriter.close();
            }
            catch( Exception e)
            {
                //do nothing
            }
    }
    
    private void changeLanguage( int language )
    {
        if( language == 1 )
        {
            jLabel_language.setText("Ngôn ngữ");
            jLabel_font.setText("Kiểu chữ");
            jLabel_fontSize.setText("Cỡ chữ");
            
            jCheckBox_restoreDefault.setText("Phục hồi thiết lập mặc đinh");
            
            jButton_apply.setText("Đồng ý");
            jButton_cancel.setText("Hủy bỏ");
        }
    }
    
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
            java.util.logging.Logger.getLogger(PreferenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreferenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreferenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreferenceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreferenceForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_apply;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JCheckBox jCheckBox_restoreDefault;
    private javax.swing.JComboBox jComboBox_font;
    private javax.swing.JComboBox jComboBox_fontSize;
    private javax.swing.JComboBox jComboBox_language;
    private javax.swing.JLabel jLabel_font;
    private javax.swing.JLabel jLabel_fontSize;
    private javax.swing.JLabel jLabel_language;
    // End of variables declaration//GEN-END:variables
}
