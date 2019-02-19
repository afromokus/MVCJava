/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma1;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import org.omg.CORBA.Environment;

/**
 *
 * @author Gyuris Csaba
 */
public class Forma1JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Forma1JFrame
     */
    public Forma1JFrame() {
        initComponents();
        jTextFieldF1Salary.setEditable(false);
        jTextFieldTeamSalary.setEditable(false);
        jTextAreaErrorMessage.setEditable(false);
        jPanelError.setVisible(false);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelName = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTeam = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListRacer = new javax.swing.JList<>();
        jButtonLoad = new javax.swing.JButton();
        jLabelTitleTeams = new javax.swing.JLabel();
        jLabelTitleRacers = new javax.swing.JLabel();
        jTextFieldTeamName = new javax.swing.JTextField();
        jLabelTitleTeamName = new javax.swing.JLabel();
        jButtonAddTeam = new javax.swing.JButton();
        jButtonModifyTeam = new javax.swing.JButton();
        jButtonF1Salary = new javax.swing.JButton();
        jButtonDeleteTeam = new javax.swing.JButton();
        jTextFieldF1Salary = new javax.swing.JTextField();
        jComboBoxMoveToTeam = new javax.swing.JComboBox<>();
        jLabelTitleMoveToTeam = new javax.swing.JLabel();
        jButtonTeamSalary = new javax.swing.JButton();
        jTextFieldTeamSalary = new javax.swing.JTextField();
        jPanelRacer = new javax.swing.JPanel();
        jLabelTitleRacerName = new javax.swing.JLabel();
        jTextFieldRacerName = new javax.swing.JTextField();
        jLabelTitleRacerAge = new javax.swing.JLabel();
        jTextFieldRacerAge = new javax.swing.JTextField();
        jLabelTitleRacerSalary = new javax.swing.JLabel();
        jTextFieldRacerSalary = new javax.swing.JTextField();
        jButtonAddRacer = new javax.swing.JButton();
        jButtonModifyRacer = new javax.swing.JButton();
        jButtonDeleteRacer = new javax.swing.JButton();
        jPanelError = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaErrorMessage = new javax.swing.JTextArea();
        jButtonExit = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabelName.setText("Name:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setText("Forma 1");

        jScrollPane1.setViewportView(jListTeam);

        jScrollPane2.setViewportView(jListRacer);

        jButtonLoad.setText("Teszt adatok betöltése");

        jLabelTitleTeams.setText("Csapatok:");

        jLabelTitleRacers.setText("Versenyzők:");

        jLabelTitleTeamName.setText("Csapat neve:");

        jButtonAddTeam.setText("Hozzáad");

        jButtonModifyTeam.setText("Módosít");

        jButtonF1Salary.setText("F1 összbevétele");

        jButtonDeleteTeam.setText("Töröl");

        jLabelTitleMoveToTeam.setText("csapatba átrak.");

        jButtonTeamSalary.setText("F1 összbevétele");

        jPanelRacer.setBorder(javax.swing.BorderFactory.createTitledBorder("Versenyző adatok:"));

        jLabelTitleRacerName.setText("Versenyző neve:");

        jLabelTitleRacerAge.setText("Versenyző éretkora:");

        jLabelTitleRacerSalary.setText("Versenyző fizetése:");

        jButtonAddRacer.setText("Hozzáad");

        jButtonModifyRacer.setText("Módosít");

        jButtonDeleteRacer.setText("Töröl");

        javax.swing.GroupLayout jPanelRacerLayout = new javax.swing.GroupLayout(jPanelRacer);
        jPanelRacer.setLayout(jPanelRacerLayout);
        jPanelRacerLayout.setHorizontalGroup(
            jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRacerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRacerLayout.createSequentialGroup()
                        .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitleRacerName)
                            .addComponent(jLabelTitleRacerAge))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelRacerLayout.createSequentialGroup()
                        .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddRacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTitleRacerSalary))
                        .addGap(21, 21, 21)))
                .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRacerLayout.createSequentialGroup()
                        .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldRacerSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jTextFieldRacerName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRacerAge, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRacerLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonModifyRacer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jButtonDeleteRacer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanelRacerLayout.setVerticalGroup(
            jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRacerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitleRacerName)
                    .addComponent(jTextFieldRacerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitleRacerAge)
                    .addComponent(jTextFieldRacerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitleRacerSalary)
                    .addComponent(jTextFieldRacerSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelRacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddRacer)
                    .addComponent(jButtonModifyRacer)
                    .addComponent(jButtonDeleteRacer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelError.setBorder(javax.swing.BorderFactory.createTitledBorder("Hibaüzenet"));

        jTextAreaErrorMessage.setColumns(20);
        jTextAreaErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        jTextAreaErrorMessage.setRows(5);
        jScrollPane4.setViewportView(jTextAreaErrorMessage);

        javax.swing.GroupLayout jPanelErrorLayout = new javax.swing.GroupLayout(jPanelError);
        jPanelError.setLayout(jPanelErrorLayout);
        jPanelErrorLayout.setHorizontalGroup(
            jPanelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelErrorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanelErrorLayout.setVerticalGroup(
            jPanelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelErrorLayout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jButtonExit.setText("Kilépés a programból");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTitleTeamName)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabelTitleTeams)
                            .addComponent(jTextFieldTeamName)
                            .addComponent(jButtonF1Salary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDeleteTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAddTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonModifyTeam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldF1Salary))))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitleRacers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonTeamSalary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(jComboBoxMoveToTeam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabelTitleMoveToTeam))
                            .addComponent(jTextFieldTeamSalary, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelRacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitleRacers)
                            .addComponent(jButtonLoad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelRacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelTitleTeams)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitleTeamName)
                            .addComponent(jComboBoxMoveToTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitleMoveToTeam))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddTeam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModifyTeam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeleteTeam)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonF1Salary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldF1Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTeamSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButtonTeamSalary)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(42, 42, 42)))
                        .addComponent(jButtonExit)
                        .addGap(55, 55, 55))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButtonExitActionPerformed

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
            java.util.logging.Logger.getLogger(Forma1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forma1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forma1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forma1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forma1JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddRacer;
    private javax.swing.JButton jButtonAddTeam;
    private javax.swing.JButton jButtonDeleteRacer;
    private javax.swing.JButton jButtonDeleteTeam;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonF1Salary;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonModifyRacer;
    private javax.swing.JButton jButtonModifyTeam;
    private javax.swing.JButton jButtonTeamSalary;
    private javax.swing.JComboBox<String> jComboBoxMoveToTeam;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleMoveToTeam;
    private javax.swing.JLabel jLabelTitleRacerAge;
    private javax.swing.JLabel jLabelTitleRacerName;
    private javax.swing.JLabel jLabelTitleRacerSalary;
    private javax.swing.JLabel jLabelTitleRacers;
    private javax.swing.JLabel jLabelTitleTeamName;
    private javax.swing.JLabel jLabelTitleTeams;
    private javax.swing.JList<String> jListRacer;
    private javax.swing.JList<String> jListTeam;
    private javax.swing.JPanel jPanelError;
    private javax.swing.JPanel jPanelRacer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaErrorMessage;
    private javax.swing.JTextField jTextFieldF1Salary;
    private javax.swing.JTextField jTextFieldRacerAge;
    private javax.swing.JTextField jTextFieldRacerName;
    private javax.swing.JTextField jTextFieldRacerSalary;
    private javax.swing.JTextField jTextFieldTeamName;
    private javax.swing.JTextField jTextFieldTeamSalary;
    // End of variables declaration//GEN-END:variables
}
