/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.ac;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.sql.Statement;
import javax.swing.Timer;
import java.util.Calendar;
import java.util.GregorianCalendar; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.DateFormat;
import javax.xml.transform.Result;
/**
 *
 * @author andre
 */
public class SmartCA extends javax.swing.JFrame {

  Database db = new Database();
    boolean isPlaying = true;
    PreparedStatement pst = null;
    Connection conn;
    int temp = 0;
    Timer t;
    int timers = 0;

    /**
     * Creates new form SmartCA
     */
    public SmartCA() {
        initComponents();
        currentdate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utama = new javax.swing.JPanel();
        masuk = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        helep = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        das = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        ac = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        waktu = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tubuh = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Database = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(500, 650));

        utama.setPreferredSize(new java.awt.Dimension(500, 650));
        utama.setLayout(new java.awt.CardLayout());

        masuk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/ac/bauk.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        masuk.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/ac/tubes1.png"))); // NOI18N
        masuk.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        utama.add(masuk, "card2");

        helep.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Hipertermi, bila suhu tubuh lebih dari 40°C");
        helep.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 290, -1));

        jLabel11.setText("Febris / pireksia / panas, bila suhu tubuh diatas 37,5 - 40°C.");
        helep.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 310, 30));

        jLabel2.setText("Normal, bila suhu tubuh berkisar antara 36,5 - 37,5°C.");
        helep.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 320, 40));

        jLabel8.setFont(new java.awt.Font("Batang", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("INFO SUHU TUBUH MANUSIA");
        helep.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 610, 60));

        jButton5.setText("NEXT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        helep.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 130, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/ac/Q.png"))); // NOI18N
        helep.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        utama.add(helep, "card4");

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        das.setMajorTickSpacing(3);
        das.setMaximum(38);
        das.setMinimum(27);
        das.setMinorTickSpacing(1);
        das.setPaintLabels(true);
        das.setPaintTicks(true);
        das.setSnapToTicks(true);
        das.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dasStateChanged(evt);
            }
        });
        menu.add(das, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 370, 60));

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("SUHU AC");
        menu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tekton Pro Ext", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("INPUT SUHU TUBUH ANDA");
        menu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 160, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/ac/asd.png"))); // NOI18N
        menu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 330, 100));

        jToggleButton1.setText("Database");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        menu.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 90, 50));

        ac.setBackground(new java.awt.Color(102, 102, 102));
        ac.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ac.setForeground(new java.awt.Color(102, 102, 102));
        ac.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ac.setDoubleBuffered(true);
        menu.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 140, 80));

        date.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        menu.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 150, 40));

        waktu.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        waktu.setForeground(new java.awt.Color(255, 255, 255));
        menu.add(waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, 40));

        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        menu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("0");
        menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("0");
        menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        tubuh.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tubuh.setForeground(new java.awt.Color(204, 204, 204));
        tubuh.setText("0");
        tubuh.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tubuh.setDoubleBuffered(true);
        tubuh.setDragEnabled(true);
        tubuh.setFocusCycleRoot(true);
        tubuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubuhActionPerformed(evt);
            }
        });
        menu.add(tubuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 130, 80));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/ac/reset.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 130, 80));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/ac/ok.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 140, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/ac/Untitled-21.png"))); // NOI18N
        menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 530, 790));

        utama.add(menu, "card3");

        Database.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Database.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 80, 40));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(102, 255, 204));
        jTable1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Suhu Tubuh", "Suhu AC", "Jam", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setDoubleBuffered(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Database.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Database.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 476, 107, 67));

        utama.add(Database, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
public void currentdate(){


Thread clock= new Thread(){
    public void run(){
        for(;;){
Calendar cal= new GregorianCalendar();
            
int mo = cal.get(Calendar.MONTH);
int ye = cal.get(Calendar.YEAR);
int d = cal.get(Calendar.DAY_OF_MONTH);
date.setText(+d+" - "+(mo+1)+" - "+ye);


int se=cal.get(Calendar.SECOND);
int min = cal.get(Calendar.MINUTE);
int ha = cal.get(Calendar.HOUR);
waktu.setText(+ha+" : "+(min)+" : "+se);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SmartCA.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
};
clock.start(); 
        }



    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        masuk.setVisible(false);
        helep.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tubuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tubuhActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_tubuhActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Random rand = new Random();
        DateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
        Date daterr = new Date();
        int cabe = rand.nextInt(10) + 18;
        int terong = rand.nextInt(22) + 9;
        int suh = Integer.parseInt(tubuh.getText());
        double hus = 0;

        if (suh >= 27 && suh <= 30) {
            hus = cabe;
        } else if (suh > 30 && suh <= 38) {
            hus = terong-5 ;
        } else if(hus <=40){
            JOptionPane.showMessageDialog(null, "Hipertermi, bila suhu tubuh lebih dari 40°C dan Hipotermia, bila suhu tubuh kurang dari 26°C");
        }

ac.setText(String.valueOf(hus));
String wkt = waktu.getText();
String dat = dateformat.format(daterr);
String a = tubuh.getText();
//String b = ac.getText();

try{
    Database db= new Database();
    db.query("insert into info values('"+a+"','"+hus+"','"+wkt+"','"+dat+"');");
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e);
} 

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tubuh.setText(null);
        ac.setText(null);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        helep.setVisible(false);
        menu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
int i=0;
        try{
           ResultSet rs;
            rs = db.getData("Select * from info ");
            while(rs.next()){
               jTable1.setValueAt(rs.getString("manusia"), i, 0);
               jTable1.setValueAt(rs.getString("ac"), i, 1);
               jTable1.setValueAt(rs.getString("jam"), i, 2);
               jTable1.setValueAt(rs.getString("tanggal"), i, 3);
               i++;
               
                
            }
            rs.close();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        menu.setVisible(false);
        Database.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Database.setVisible(false);
menu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void dasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dasStateChanged
tubuh.setText(""+das.getValue());
        // TODO add your handling code here:
    }//GEN-LAST:event_dasStateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String sql ="delete from info";
try{
    pst=conn.prepareStatement(sql);
    pst.execute();
    JOptionPane.showMessageDialog(null, "Deleted");
        
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);


}    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(SmartCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartCA().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Database;
    private javax.swing.JLabel ac;
    private javax.swing.JSlider das;
    private javax.swing.JLabel date;
    private javax.swing.JPanel helep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel masuk;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField tubuh;
    private javax.swing.JPanel utama;
    private javax.swing.JLabel waktu;
    // End of variables declaration//GEN-END:variables
}