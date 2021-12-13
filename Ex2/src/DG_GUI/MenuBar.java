package DG_GUI;

import Ex2.My_Algo;
import api.NodeData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar;

    JMenu graphMenu;
    JMenu functionsMenu;
    JMenu exitMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem initItem;
    JMenuItem GetGraphItem;
    JMenuItem CopyItem;
    JMenuItem IsConnectedItem;
    JMenuItem ShortestPathDistItem;
    JMenuItem ShortestPathItem;
    JMenuItem CenterItem;
    JMenuItem TspItem;
    JMenuItem exitItem;

    public MenuBar() {

        menuBar = new JMenuBar();

        graphMenu = new JMenu("Graph");
        functionsMenu = new JMenu("Functions");
        exitMenu = new JMenu("Exit");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        initItem = new JMenuItem("Init");
        GetGraphItem = new JMenuItem("Get Graph");
        CopyItem = new JMenuItem("Copy");

        IsConnectedItem = new JMenuItem("IsConnected");
        ShortestPathDistItem = new JMenuItem("ShortestPathDist");
        ShortestPathItem = new JMenuItem("ShortestPath");
        CenterItem = new JMenuItem("Center");
        TspItem = new JMenuItem("Tsp");

        exitItem = new JMenuItem("Exit");


        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        initItem.addActionListener(this);
        GetGraphItem.addActionListener(this);
        CopyItem.addActionListener(this);

        IsConnectedItem.addActionListener(this);
        ShortestPathDistItem.addActionListener(this);
        ShortestPathItem.addActionListener(this);
        CenterItem.addActionListener(this);
        TspItem.addActionListener(this);

        exitItem.addActionListener(this);


        graphMenu.add(loadItem);
        graphMenu.add(saveItem);
        graphMenu.add(initItem);
        graphMenu.add(GetGraphItem);
        graphMenu.add(CopyItem);

        functionsMenu.add(IsConnectedItem);
        functionsMenu.add(ShortestPathDistItem);
        functionsMenu.add(ShortestPathItem);
        functionsMenu.add(CenterItem);
        functionsMenu.add(TspItem);

        exitMenu.add(exitItem);


        menuBar.add(graphMenu);
        menuBar.add(functionsMenu);
        menuBar.add(exitMenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("*beep boop* you loaded a file");
        }
        if (e.getSource() == saveItem) {
            System.out.println("*beep boop* you saved a file");
        }
//        if (e.getSource() == initItem) {
//            System.out.println("init");
//        }
//        if (e.getSource() == GetGraphItem) {
//            System.out.println("get graph");
//        }
//        if (e.getSource() == CopyItem) {
//            System.out.println("copy");
//        }
        if (e.getSource() == IsConnectedItem) {
//            My_Algo connected = null;
//            boolean isConnect = connected.isConnected();
//            String res = "" + isConnect;
            ResponsePage responsePage = new ResponsePage("true");
//            ResponsePage responsePage = new ResponsePage(res);
        }
        if (e.getSource() == ShortestPathDistItem) {
            GetInfoPage getInfoPage = new GetInfoPage();
        }
        if (e.getSource() == ShortestPathItem) {
            GetInfoPage getInfoPage = new GetInfoPage();
        }
        if (e.getSource() == CenterItem) {
            My_Algo centerNode = null;
            NodeData n = centerNode.center();
            String res = "" + n.getKey();
            ResponsePage responsePage = new ResponsePage(res);
        }
        if (e.getSource() == TspItem) {
            System.out.println("tsp");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
    }
}
