package com.company;

import javax.swing.*;

public class Calculation extends JFrame {
    private JPanel panel_main;
    private JPanel panel_up;
    private JPanel panel_down;
    private JLabel label_result;
    private JPanel panelDownLeft;
    private JPanel panelDownCenter;
    private JPanel panelDownRight;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_minus;
    private JButton button_0;
    private JButton button_plus;
    private JButton button_result;
    private String formula = "";

    public Calculation() {
        super("Калькулятор");
        this.setContentPane(panel_main);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        button_0.addActionListener(e -> {
            formula += '0';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_1.addActionListener(e -> {
            formula += '1';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_2.addActionListener(e -> {
            formula += '2';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_3.addActionListener(e -> {
            formula += '3';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_4.addActionListener(e -> {
            formula += '4';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_5.addActionListener(e -> {
            formula += '5';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_6.addActionListener(e -> {
            formula += '6';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_7.addActionListener(e -> {
            formula += '7';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_8.addActionListener(e -> {
            formula += '8';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_9.addActionListener(e -> {
            formula += '9';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_minus.addActionListener(e -> {
            formula += '-';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_plus.addActionListener(e -> {
            formula += '+';
            label_result.setText("");
            label_result.setText(formula);
        });
        button_result.addActionListener(e -> {
            setResult(formula);
            formula = "";
        });
    }

    private void setResult(String str) {
        int res = 0, j;
        String digit = "";
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i)))
                digit += str.charAt(i);
            if (!Character.isDigit(str.charAt(i))) {
                if (!digit.isEmpty())
                    res += Integer.parseInt(digit);
                digit = "";
                for (j = i + 1; j < str.length(); ++j) {
                    if (Character.isDigit(str.charAt(j)))
                        digit += str.charAt(j);
                    else
                        break;
                }
                if (str.charAt(i) == '+')
                    res += Integer.parseInt(digit);
                if (str.charAt(i) == '-')
                    res -= Integer.parseInt(digit);
                digit = "";
                i = j - 1;
            }
        }
        label_result.setText(String.valueOf(res));
    }
}
