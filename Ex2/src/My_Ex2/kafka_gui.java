package My_Ex2;

import javax.swing.*;
import java.awt.*;

public class kafka_gui {
    public static void main(String[] args) {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        j.setSize(500,500);
        j.setSize(d.width/2, d.height/2);
        j.getContentPane().setBackground(Color.BLUE);
        j.setTitle("kapara");
        ImageIcon image = new ImageIcon("");
        j.setIconImage(image.getImage());
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        mb.add(file);
//        mb.setBorder(10);
        j.add(mb);
        System.out.println(d);
        j.setVisible(true);

    }

}
