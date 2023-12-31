/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codefornature;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Trivia extends javax.swing.JFrame {
    private final Home HomeFrameReference;
    private int points;
    private String username;
    private String regDate;
    private int day;

    /**
     * Creates new form Trivia
     */
    public Trivia(Home HomeFrame,int points,String username,String regDate) {
        this.HomeFrameReference=HomeFrame;
        this.points=points;
        this.username=username;
        this.regDate=regDate;
        LocalDate RegDate = LocalDate.parse(regDate);
        LocalDate today=LocalDate.now();
        day=(int)ChronoUnit.DAYS.between(RegDate, today) + 1;
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

        jLabel9 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(986, 750));
        setMinimumSize(new java.awt.Dimension(986, 750));
        setPreferredSize(new java.awt.Dimension(986, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 1, 60)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("DAILY TRIVIA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setIcon(new javax.swing.ImageIcon("D:\\UM\\Y1\\S1\\FOP\\CodeForNature\\src\\icon\\back.jpg")); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        startBtn.setBackground(new java.awt.Color(204, 255, 204));
        startBtn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        startBtn.setForeground(new java.awt.Color(0, 51, 51));
        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 408, 113));

        historyBtn.setBackground(new java.awt.Color(204, 255, 204));
        historyBtn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        historyBtn.setForeground(new java.awt.Color(0, 51, 51));
        historyBtn.setText("History");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });
        getContentPane().add(historyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 408, 113));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\UM\\Y1\\S1\\FOP\\CodeForNature\\src\\icon\\trivia bg.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(986, 750));
        jLabel1.setMinimumSize(new java.awt.Dimension(986, 750));
        jLabel1.setPreferredSize(new java.awt.Dimension(986, 750));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        this.HomeFrameReference.setVisible(true);
        HomeFrameReference.pack();
        HomeFrameReference.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        Start StartFrame=new Start(this,points,username,regDate,day);
        StartFrame.setVisible(true);
        StartFrame.pack();
        StartFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_startBtnActionPerformed

    public void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        //Start StartPass=new Start(this);
        //ArrayList<String>data=StartPass.getData(day);
        History HistoryFrame=new History(this,points,username,day);
        HistoryFrame.setVisible(true);
        HistoryFrame.pack();
        HistoryFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_historyBtnActionPerformed

    public void passQ(int question){
        Start StartPass=new Start(this,question);
        ArrayList<String> data=StartPass.getData();
        History history=new History(this,points,username,day);
        history.display(data,question);
        history.setVisible(true);
        history.pack();
        history.setLocationRelativeTo(null);
    }

    public void page(int question){
        Start StartFrame=new Start(this,points,username,regDate,question);
        StartFrame.setVisible(true);
        StartFrame.pack();
        StartFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    public void updatePoints(int points){
        HomeFrameReference.updatePoints(points);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    public javax.swing.JButton historyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}