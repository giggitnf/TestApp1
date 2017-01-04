/*
 * NewFrame.java
 *
 * Created on 13 maggio 2008, 15.17
 */

package testapp1;




/**
 *
 * @author  luigi
 */
public class NewFrame extends java.awt.Frame {
    
    /** Creates new form NewFrame */
    public NewFrame() {
        initComponents();
        
        setLocation(200,200);
        setSize(300, 300);
        
        

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        button1 = new java.awt.Button();

        setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.borderColor"));
        setFont(new java.awt.Font("Tahoma", 0, 12));
        setLocationByPlatform(true);
        setLocationRelativeTo(this);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setName("Test Application"); // NOI18N
        setTitle("Test Application");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jButton1.setText("Click Me");
        jButton1.setBounds(20, 30, 100, 50);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        button1.setLabel("button1");
        button1.setBounds(40, 110, 57, 24);
        jLayeredPane1.add(button1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFrame().setVisible(true);
                
                
                                
            }
        });
    }
    
    
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
    
}
