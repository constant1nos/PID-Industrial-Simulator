/*
 * PID_Industrial_Simulator Copyright Batzonis Constantinos
 */
package ui;

import arduino.*;
import com.fazecast.jSerialComm.SerialPort;
import communication.GraphWorker;
import graph.TimeGraph;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
/**
 *
 * @author dinob
 */
public class MainMenu extends javax.swing.JFrame {

    private Arduino myArduino;
    private SerialPort comPort;    
    private final TimeGraph graph;
    private GraphWorker gw;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() { 
        initComponents();
        graph = new TimeGraph("Time Plot");
        graphPanel.add(graph.getGraphPanel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBackgroundPanel = new javax.swing.JPanel();
        graphPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        mainControlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        value = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        modeOneControlPanel = new javax.swing.JPanel();
        mAWriteText = new javax.swing.JTextField();
        executeButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        setupMenu = new javax.swing.JMenu();
        connectionMenu = new javax.swing.JMenuItem();
        modeSelectionMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenu = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ui/Bundle"); // NOI18N
        setTitle(bundle.getString("MainMenu.title")); // NOI18N

        graphPanel.setLayout(new java.awt.BorderLayout());

        controlPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-cancel-24.png"))); // NOI18N
        jLabel1.setText(bundle.getString("MainMenu.jLabel1.text")); // NOI18N

        jTextField1.setText(bundle.getString("MainMenu.jTextField1.text")); // NOI18N

        jButton1.setText(bundle.getString("MainMenu.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        value.setColumns(20);
        value.setRows(5);
        jScrollPane1.setViewportView(value);

        jButton2.setText(bundle.getString("MainMenu.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(bundle.getString("MainMenu.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainControlPanelLayout = new javax.swing.GroupLayout(mainControlPanel);
        mainControlPanel.setLayout(mainControlPanelLayout);
        mainControlPanelLayout.setHorizontalGroup(
            mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addComponent(jButton2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        mainControlPanelLayout.setVerticalGroup(
            mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        controlPanel.add(mainControlPanel, "mainControlPanel");

        mAWriteText.setText(bundle.getString("MainMenu.mAWriteText.text")); // NOI18N
        mAWriteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mAWriteTextKeyTyped(evt);
            }
        });

        executeButton.setText(bundle.getString("MainMenu.executeButton.text")); // NOI18N
        executeButton.setToolTipText(bundle.getString("MainMenu.executeButton.toolTipText")); // NOI18N
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modeOneControlPanelLayout = new javax.swing.GroupLayout(modeOneControlPanel);
        modeOneControlPanel.setLayout(modeOneControlPanelLayout);
        modeOneControlPanelLayout.setHorizontalGroup(
            modeOneControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modeOneControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modeOneControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mAWriteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(executeButton))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        modeOneControlPanelLayout.setVerticalGroup(
            modeOneControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modeOneControlPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(mAWriteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(executeButton)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        controlPanel.add(modeOneControlPanel, "modeOneControlPanel");

        javax.swing.GroupLayout mainBackgroundPanelLayout = new javax.swing.GroupLayout(mainBackgroundPanel);
        mainBackgroundPanel.setLayout(mainBackgroundPanelLayout);
        mainBackgroundPanelLayout.setHorizontalGroup(
            mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBackgroundPanelLayout.createSequentialGroup()
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainBackgroundPanelLayout.setVerticalGroup(
            mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainBackgroundPanelLayout.createSequentialGroup()
                .addGroup(mainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainBackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );

        setupMenu.setText(bundle.getString("MainMenu.setupMenu.text")); // NOI18N
        setupMenu.setToolTipText(bundle.getString("MainMenu.setupMenu.toolTipText")); // NOI18N

        connectionMenu.setText(bundle.getString("MainMenu.connectionMenu.text")); // NOI18N
        connectionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectionMenuActionPerformed(evt);
            }
        });
        setupMenu.add(connectionMenu);

        modeSelectionMenu.setText(bundle.getString("MainMenu.modeSelectionMenu.text")); // NOI18N
        modeSelectionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeSelectionMenuActionPerformed(evt);
            }
        });
        setupMenu.add(modeSelectionMenu);
        setupMenu.add(jSeparator1);

        exitMenu.setText(bundle.getString("MainMenu.exitMenu.text")); // NOI18N
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        setupMenu.add(exitMenu);

        menuBar.add(setupMenu);

        settingsMenu.setText(bundle.getString("MainMenu.settingsMenu.text")); // NOI18N
        settingsMenu.setToolTipText(bundle.getString("MainMenu.settingsMenu.toolTipText")); // NOI18N
        menuBar.add(settingsMenu);

        aboutMenu.setText(bundle.getString("MainMenu.aboutMenu.text")); // NOI18N
        aboutMenu.setToolTipText(bundle.getString("MainMenu.aboutMenu.toolTipText")); // NOI18N
        menuBar.add(aboutMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(0);
        myArduino.closeConnection();
    }//GEN-LAST:event_exitMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(myArduino != null){
            myArduino.serialWrite(jTextField1.getText()); 
        }
        else{
            System.out.println("Something is wrong");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        value.setText(myArduino.serialRead());
    }//GEN-LAST:event_jButton2ActionPerformed
    /* MenuBar action when Connection is selected*/
    private void connectionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectionMenuActionPerformed
        ArduinoConnection arduinoConnection = new ArduinoConnection(this, true);
        arduinoConnection.setLocationRelativeTo(this);
        arduinoConnection.setVisible(true);
        if(arduinoConnection.getReturnStatus() == 1 && arduinoConnection.isConnected){
            this.myArduino = arduinoConnection.myArduino;
            this.comPort = arduinoConnection.comPort;
            jLabel1.setText("Connected");
            jLabel1.setIcon(new ImageIcon(getClass().getResource("/resource/icons/icons8-ok-24.png")));
        }
    }//GEN-LAST:event_connectionMenuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gw = new GraphWorker(myArduino, graph);
        gw.execute();
    }//GEN-LAST:event_jButton3ActionPerformed
    /* MenuBar action when Mode Selection is selected*/
    private void modeSelectionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeSelectionMenuActionPerformed
        ModeSelection modeSelection = new ModeSelection(this, true);
        modeSelection.setLocationRelativeTo(this);
        modeSelection.setVisible(true);
        if(modeSelection.getReturnStatus() == 1){
            String mode = modeSelection.getSelectedMode();
            if(mode.equals("mode1")){
                CardLayout card = (CardLayout) controlPanel.getLayout();
                card.show(controlPanel, "modeOneControlPanel");
                gw = new GraphWorker(myArduino, graph);
                gw.execute();
            }                
        }
    }//GEN-LAST:event_modeSelectionMenuActionPerformed

    private void mAWriteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mAWriteTextKeyTyped
        char c=evt.getKeyChar();
        if((Character.isAlphabetic(c))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_mAWriteTextKeyTyped

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        String text = mAWriteText.getText();
        if(!text.equals("")){
            Double mA = Double.parseDouble(text);
            mA = (mA*4095)/21.28;
            int sendData = mA.intValue();
            text = 'M'+Integer.toString(sendData);
            byte[] bytes = text.getBytes();
            comPort.writeBytes(bytes, bytes.length);
            System.out.println(text);
        }
    }//GEN-LAST:event_executeButtonActionPerformed
   
    public void setArduino(Arduino arduino){
        myArduino = arduino;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem connectionMenu;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton executeButton;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mAWriteText;
    private javax.swing.JPanel mainBackgroundPanel;
    private javax.swing.JPanel mainControlPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel modeOneControlPanel;
    private javax.swing.JMenuItem modeSelectionMenu;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JMenu setupMenu;
    private javax.swing.JTextArea value;
    // End of variables declaration//GEN-END:variables
}
