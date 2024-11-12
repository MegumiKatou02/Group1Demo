package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingFont {
    public static void main(String[] args) {
        SwingFont swingFont = new SwingFont();
        try {
            swingFont.getDefaultFont();
        } catch (HeadlessException e) {
            System.out.println("HeadlessException occurred: " + e.getMessage());
        }
    }

    public void getDefaultFont() throws HeadlessException {
        if (GraphicsEnvironment.isHeadless()) {
            throw new HeadlessException("No graphics environment available.");
        }
        
        final UIDefaults lookAndFeelDefaults = UIManager.getLookAndFeelDefaults(); // SwingFont.java:50
        if (lookAndFeelDefaults != null) {
            Font swingFont = lookAndFeelDefaults.getFont("defaultFont");
            System.out.println("Swing font: " + swingFont);
        } else {
            System.out.println("LookAndFeel defaults not available.");
        }
    }
}
