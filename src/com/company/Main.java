package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Temperature temperature = new Temperature();
        temperature.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        temperature.setSize(250, 200);
        temperature.setVisible(true);

    }
}
