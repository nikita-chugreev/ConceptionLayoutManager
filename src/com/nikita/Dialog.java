package com.nikita;

import javax.swing.*;
import java.awt.*;

public class Dialog extends JFrame{

    Dialog() {
        super("");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setSize(400,200);
        Container c = getContentPane();
        JTabbedPane tabbedPane = new JTabbedPane();
        c.add(tabbedPane, BorderLayout.CENTER);

        JPanel panel1 = new JPanel();
        addFields(panel1);
        tabbedPane.add(panel1, "FlowLayout");

        JPanel panel2 = new JPanel(new BorderLayout());
        tabbedPane.add(panel2, "BorderLayout");
        addBorderFields(panel2);

        JPanel panel3 = new JPanel(new GridLayout(3,1,0,4));
        tabbedPane.add(panel3, "GridLayout");
        addFields(panel3);

        JPanel jPanel4 = new JPanel();
        BoxLayout bx = new BoxLayout(jPanel4, BoxLayout.Y_AXIS);
        jPanel4.setLayout(bx);
        addFields(jPanel4);
        tabbedPane.add(jPanel4, "BoxLayout-Y");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addBorderFields(JPanel pn) {
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Name");
        JTextField textField = new JTextField(25);
        panel1.add(label1);
        panel1.add(textField);
        pn.add(panel1, BorderLayout.NORTH);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Authors");
        JTextField textField2 = new JTextField(25);
        panel2.add(label2);
        panel2.add(textField2);
        pn.add(panel2, BorderLayout.CENTER);

        JPanel panel3 = new JPanel();
        JLabel label3 = new JLabel("Izd");
        JTextField textField3 = new JTextField(25);
        panel3.add(label3);
        panel3.add(textField3);
        pn.add(panel3, BorderLayout.SOUTH);
    }

    private void addFields(JPanel pn) {
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Name");
        JTextField textField1 = new JTextField(25);
        panel1.add(label1);
        panel1.add(textField1);
        pn.add(panel1);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Authors");
        JTextField f2 = new JTextField(25);
        panel2.add(label2);
        panel2.add(f2);
        pn.add(panel2);

        JPanel panel3 = new JPanel();
        JLabel label3 = new JLabel("Izd");
        JTextField textField3 = new JTextField(25);
        panel3.add(label3);
        panel3.add(textField3);
        pn.add(panel3);
    }
}
