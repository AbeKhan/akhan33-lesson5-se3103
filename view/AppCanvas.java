package view;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class AppCanvas extends JPanel {

    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    public AppCanvas() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
    }
}
