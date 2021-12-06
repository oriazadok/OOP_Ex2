package My_Ex2;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Zadok's this");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);


        ImageIcon image = new ImageIcon("");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(82, 196, 147, 138));
    }
}
