package DG_GUI;

import Ex2.Location;
import api.GeoLocation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

//public class Panel extends JPanel {

//    JPanel panel;

//    Panel() {
//        panel = new JPanel();
//        this.setBackground(Color.red);
//        this.setPreferredSize(new Dimension(1200, 550));
//        this.setOpaque(true);
//        this.setLayout(null);
//        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
//    }
    public class Panel extends JPanel implements MouseListener {
        LinkedList<GeoLocation> points = new LinkedList<GeoLocation>();

        public Panel() {
            this.setBackground(Color.pink);
            this.setPreferredSize(new Dimension(1200, 550));
            this.addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            GeoLocation prev = null;

            for (GeoLocation p : points) {
                g.setColor(Color.BLACK);
                g.fillOval((int) p.x() - 10, (int) p.y() - 10, 20, 20);

                if (prev != null) {
                    g.setColor(Color.GRAY);
                    g.drawLine((int) p.x(), (int) p.y(), (int) prev.x(), (int) prev.y());

                    g.drawString("some string", (int) ((p.x() + prev.x()) / 2), (int) ((p.y() + prev.y()) / 2)); //draw in the middle
                }

                prev = p;
            }

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            GeoLocation p = new Location(e.getX(), e.getY(), 0);
            points.add(p);
            repaint();
            System.out.println("mouseClicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {

            System.out.println("mousePressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("mouseReleased");

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("mouseEntered");

        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            System.out.println("mouseExited");
        }
    }
//super.paintComponent(g);
//
//Point3D prev = null;
//
//for (Point3D p : points)
//{
//	g.setColor(Color.BLUE);
//	g.fillOval((int)p.x(), (int)p.y(), 10, 10);
//
//	if(prev != null)
//	{
//		g.setColor(Color.RED);
//		g.drawLine((int)p.x(), (int)p.y(),
//				(int)prev.x(), (int)prev.y());
//
//		g.drawString("5", (int)((p.x()+prev.x())/2),(int)((p.y()+prev.y())/2));
//	}
//
//	prev = p;
//}
//}
