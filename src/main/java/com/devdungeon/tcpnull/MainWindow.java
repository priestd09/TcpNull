/*
 * Copyright (C) 2016 NanoDano <nanodano@devdungeon.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.devdungeon.tcpnull;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NanoDano <nanodano@devdungeon.com>
 */
public class MainWindow extends javax.swing.JFrame {

    private TcpServer serverThread = null;
    private boolean echoToClient = false;
    private boolean httpFormat = false;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setIconImages(WindowHelper.loadIcons());
        serverThread = new TcpServer(6789, "localhost", echoToClient, httpFormat, this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        actionOnRequestButtonGroup = new javax.swing.ButtonGroup();
        startButton = new javax.swing.JToggleButton();
        hostText = new javax.swing.JTextField();
        portText = new javax.swing.JTextField();
        hostLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        actionOnRequestRadio1 = new javax.swing.JRadioButton();
        actionOnRequestRadio2 = new javax.swing.JRadioButton();
        actionOnRequestRadio3 = new javax.swing.JRadioButton();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        quitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        tipsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

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
        setTitle("TCPNull");

        startButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        startButton.setText("Start/Stop");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        hostText.setText("localhost");

        portText.setText("6789");

        hostLabel.setText("Host");

        portLabel.setText("Port");

        statusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        statusLabel.setText("Status: Stopped");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel)
        );

        jLabel1.setText("Action to take with request");

        actionOnRequestButtonGroup.add(actionOnRequestRadio1);
        actionOnRequestRadio1.setSelected(true);
        actionOnRequestRadio1.setText("Discard");
        actionOnRequestRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionOnRequestRadio1ActionPerformed(evt);
            }
        });

        actionOnRequestButtonGroup.add(actionOnRequestRadio2);
        actionOnRequestRadio2.setText("Echo data to client exactly as received");
        actionOnRequestRadio2.setToolTipText("");
        actionOnRequestRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionOnRequestRadio2ActionPerformed(evt);
            }
        });

        actionOnRequestButtonGroup.add(actionOnRequestRadio3);
        actionOnRequestRadio3.setText("Echo data to client as HTTP 200 OK");
        actionOnRequestRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionOnRequestRadio3ActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        mainMenuBar.add(fileMenu);

        helpMenu.setText("Help");

        tipsMenuItem.setText("Tips");
        tipsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(tipsMenuItem);

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(portLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hostText)
                            .addComponent(portText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actionOnRequestRadio2)
                            .addComponent(actionOnRequestRadio3)
                            .addComponent(actionOnRequestRadio1)
                            .addComponent(jLabel1))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostLabel))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionOnRequestRadio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionOnRequestRadio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionOnRequestRadio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (serverThread.serverRunning) { // Stop server
            serverThread.stopServer();
            this.statusLabel.setText("Status: Stopped.");
            try {
                serverThread.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            setOptionsEnabledState(true);
        } else { // Start server
            // Disable text fields
            setOptionsEnabledState(false);
            serverThread = new TcpServer(
                    Integer.parseInt(portText.getText().trim()),
                    hostText.getText().trim(),
                    echoToClient,
                    httpFormat,
                    this
            );
            serverThread.start();

            statusLabel.setText("Status: Running...");
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        String[] args = new String[0];
        AboutWindow.main(args);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void tipsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipsMenuItemActionPerformed
        String[] args = new String[0];
        TipsWindow.main(args);
    }//GEN-LAST:event_tipsMenuItemActionPerformed

    private void actionOnRequestRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionOnRequestRadio1ActionPerformed
        // Discard incoming requests
        echoToClient = false;
        httpFormat = false; // Set just to be clean
    }//GEN-LAST:event_actionOnRequestRadio1ActionPerformed

    private void actionOnRequestRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionOnRequestRadio2ActionPerformed
        echoToClient = true;
        httpFormat = false;
    }//GEN-LAST:event_actionOnRequestRadio2ActionPerformed

    private void actionOnRequestRadio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionOnRequestRadio3ActionPerformed
        echoToClient = true;
        httpFormat = true;
    }//GEN-LAST:event_actionOnRequestRadio3ActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        if (serverThread.serverRunning) {
            serverThread.stopServer();
            try {
                serverThread.join();
            } catch (InterruptedException ex) {
                // Ignore
            }
        }
        System.exit(0);
    }//GEN-LAST:event_quitMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WindowHelper.setLookAndFeel();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenuItem aboutMenuItem;
    javax.swing.ButtonGroup actionOnRequestButtonGroup;
    javax.swing.JRadioButton actionOnRequestRadio1;
    javax.swing.JRadioButton actionOnRequestRadio2;
    javax.swing.JRadioButton actionOnRequestRadio3;
    javax.swing.JMenu fileMenu;
    javax.swing.JMenu helpMenu;
    javax.swing.JLabel hostLabel;
    javax.swing.JTextField hostText;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JMenuBar mainMenuBar;
    javax.swing.JLabel portLabel;
    javax.swing.JTextField portText;
    javax.swing.JMenuItem quitMenuItem;
    javax.swing.JToggleButton startButton;
    javax.swing.JLabel statusLabel;
    javax.swing.JPanel statusPanel;
    javax.swing.JMenuItem tipsMenuItem;
    // End of variables declaration//GEN-END:variables

    public void setOptionsEnabledState(boolean state) {
        portText.setEnabled(state);
        hostText.setEnabled(state);
        actionOnRequestRadio1.setEnabled(state);
        actionOnRequestRadio2.setEnabled(state);
        actionOnRequestRadio3.setEnabled(state);
    }
}
