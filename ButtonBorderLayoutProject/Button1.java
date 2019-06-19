import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        // JButton button = new JButton("click me");

        // Changed it so button take much more space with text.
        // JButton button = new JButton("click like you mean it");
        // frame.getContentPane().add(BorderLayout.EAST, button);

        // Moved button up north
        // JButton button = new JButton("There is no spoon...");
        // frame.getContentPane().add(BorderLayout.NORTH, button);

        //Move button north and taller.
        //JButton button = new JButton("Click This!");
        //Font bigFont = new Font("seriff", Font.BOLD, 28);
        //button.setFont(bigFont);
       // frame.getContentPane().add(BorderLayout.NORTH, button);

       JButton east = new JButton("East");
       JButton west = new JButton("West");
       JButton north = new JButton("North");
       JButton south = new JButton("South");
       JButton center = new JButton("Center");

       frame.getContentPane().add(BorderLayout.EAST, east);
       frame.getContentPane().add(BorderLayout.WEST, west);
       frame.getContentPane().add(BorderLayout.NORTH, north);
       frame.getContentPane().add(BorderLayout.SOUTH, south);
       frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
