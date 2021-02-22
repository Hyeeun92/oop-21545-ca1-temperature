package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame {

    private JTextField inputTemperature;
    private JTextField convertedTemperature;
    private Double calculateTemp;
    private JButton convertButton;
    private JLabel title;
    private JPanel pan;

    private JRadioButton celsiusButton;
    private JRadioButton fahrenheitButton;
    private ButtonGroup radioGroup;

    public Temperature() {
        super("Temperature calculator");

        setLayout(new FlowLayout());


        title = new JLabel("Temperature conversion");
        celsiusButton = new JRadioButton("Celsius", false);
        fahrenheitButton = new JRadioButton("Fahrenheit", false);
        add(celsiusButton);
        add(fahrenheitButton);

        radioGroup = new ButtonGroup();
        radioGroup.add(celsiusButton);
        radioGroup.add(fahrenheitButton);

        inputTemperature = new JTextField(null, 20);
        add(inputTemperature);
        convertedTemperature = new JTextField(null, 20);
        add(convertedTemperature);
        convertedTemperature.setEditable(false);

        convertButton = new JButton("Conversion");
        add(convertButton);
        convertButton.setBackground(Color.blue);

        convertButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (celsiusButton.isSelected()){
                            calculateTemp = (9 / 5.0) * (Double.parseDouble(inputTemperature.getText())) + 32;
                            convertedTemperature.setText(Double.toString(Math.round(calculateTemp*100)/100.00));
                        }
                        else if (fahrenheitButton.isSelected())
                        {
                            calculateTemp = ((Double.parseDouble(inputTemperature.getText())) - 32) * (5 / 9.0);
                            convertedTemperature.setText(Double.toString(Math.round(calculateTemp*100)/100.00));
                        }

                    }
                }
        );

    }

}
















