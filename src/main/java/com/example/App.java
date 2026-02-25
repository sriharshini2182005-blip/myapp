//test commit for faculty demo
package com.example;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Butterfly Family Tree");

        java.net.URL imgURL = App.class.getClassLoader()
                                       .getResource("ButterflyFamilyTree.png");

        if (imgURL == null) {
            System.out.println("Image not found! Check resources folder.");
            return;
        }

        ImageIcon icon = new ImageIcon(imgURL);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        System.out.println("Image loaded successfully!");
    }
}