package DG_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class GetInfoPage implements ActionListener {

    JFrame frame = new JFrame();

    JLabel source = new JLabel("Source Node: ");
    JLabel destination = new JLabel("Destination Node: ");

    JTextField sourceID = new JTextField();
    JTextField destinationID = new JTextField();

    JButton sendButton = new JButton("Submit");
    JButton resetButton = new JButton("Reset");

    JLabel messageLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<>();

//    HashMap<String, String> loginInfoOriginal
    GetInfoPage() {
//        logininfo = loginInfoOriginal;

        source.setBounds(50, 100, 150, 25);
        destination.setBounds(50, 150, 150, 25);

        sourceID.setBounds(200, 100, 150, 25);
        destinationID.setBounds(200, 150, 150, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        sendButton.setBounds(125, 200, 100, 25);
        sendButton.setFocusable(false);
        sendButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(source);
        frame.add(destination);

        frame.add(messageLabel);

        frame.add(sourceID);
        frame.add(destinationID);

        frame.add(sendButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {
            sourceID.setText("");
            destinationID.setText("");
        }

        if (e.getSource() == sendButton) {


            String userID = sourceID.getText();
            String password = String.valueOf(destinationID.getText());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    ResponsePage wellcomePage = new ResponsePage(userID);
                }

                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("username not found");
            }

        }

    }
}
