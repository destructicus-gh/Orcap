package main.java.gui;

import java.awt.*;
import java.io.File;

import javax.swing.*;

import com.controller.RoboPandaController;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.model.Task;

/**
 * Created by a689638 on 3/21/2016.
 * Copyright (C) 2016 HEB
 *
 * @author Ryan Anders
 *         This software is the confidential and proprietary information
 *         of HEB
 */
public class RoboPanda {
    private static Dimension d = new Dimension(640, 480);

    private JTextPane outputPanel;
    private JPanel panel1;
    private JButton runButton;
    private JTextField fileNameField;
    private JButton addButton;
    private JComboBox tasksDropdown;
    private JProgressBar progressBar1;
    private JTextPane inputPanel;
    private JTabbedPane tabs;
    private JLabel status;

    public Task t;
    public File file;

    public RoboPanda(Task t) {
        this.t = t;
        $$$setupUI$$$();
        addButton.addActionListener(e -> RoboPandaController.addFile(this, e));
        runButton.addActionListener(e -> RoboPandaController.runTask(this, e));
    }

    public static Dimension getD() {
        return d;
    }

    public JTextPane getOutputPanel() {
        return outputPanel;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JProgressBar getProgressBar1() {
        return progressBar1;
    }

    public JLabel getStatus() {
        return status;
    }

    public JComboBox getTasksDropdown() {
        return tasksDropdown;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JTextField getFileNameField() {
        return fileNameField;
    }

    public JButton getRunButton() {
        return runButton;
    }

    public JTabbedPane getTabs() {
        return tabs;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(7, 10, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setMinimumSize(new Dimension(640, 480));
        runButton = new JButton();
        runButton.setText("Run");
        panel1.add(runButton, new GridConstraints(5, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, -1), null, 0, false));
        progressBar1 = new JProgressBar();
        progressBar1.setPreferredSize(new Dimension(30, 12));
        progressBar1.setStringPainted(false);
        progressBar1.setValue(0);
        panel1.add(progressBar1, new GridConstraints(5, 3, 1, 4, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(100, -1), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Label");
        panel1.add(label1, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tabs = new JTabbedPane();
        panel1.add(tabs, new GridConstraints(3, 0, 1, 10, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabs.addTab("Input", panel2);
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setMinimumSize(new Dimension(17, -1));
        scrollPane1.setPreferredSize(new Dimension(6, 400));
        panel2.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        inputPanel = new JTextPane();
        inputPanel.setEditable(false);
        inputPanel.setFocusTraversalPolicyProvider(false);
        inputPanel.setMinimumSize(new Dimension(6, 30));
        inputPanel.setPreferredSize(new Dimension(6, 4));
        scrollPane1.setViewportView(inputPanel);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabs.addTab("Output", panel3);
        final JScrollPane scrollPane2 = new JScrollPane();
        scrollPane2.setMinimumSize(new Dimension(17, -1));
        scrollPane2.setPreferredSize(new Dimension(6, 400));
        panel3.add(scrollPane2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        outputPanel = new JTextPane();
        outputPanel.setEditable(false);
        outputPanel.setFocusTraversalPolicyProvider(false);
        outputPanel.setMinimumSize(new Dimension(6, 30));
        outputPanel.setPreferredSize(new Dimension(6, 4));
        scrollPane2.setViewportView(outputPanel);
        final JLabel label2 = new JLabel();
        label2.setText("Status:");
        panel1.add(label2, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        fileNameField = new JTextField();
        panel1.add(fileNameField, new GridConstraints(1, 1, 1, 6, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setHorizontalAlignment(10);
        label3.setText("File");
        panel1.add(label3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(30, -1), new Dimension(30, -1), new Dimension(30, -1), 0, false));
        addButton = new JButton();
        addButton.setText("Add");
        panel1.add(addButton, new GridConstraints(1, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
