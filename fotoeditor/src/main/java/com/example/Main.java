package com.example;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
              SwingUtilities.invokeLater(() -> {
            fotoEditorGUI editor = new fotoEditorGUI();
            editor.setExtendedState(JFrame.MAXIMIZED_BOTH);
            editor.setVisible(true);
           
        });
    }
}