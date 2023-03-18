import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class GUI implements ActionListener {

    private double count = 0;
    private JFrame frame;
    private JPanel panel;
    private JButton button, button2, button3, button4;
    private JLabel label;

    public GUI(){
        frame = new JFrame();
        panel = new JPanel();


        button = new JButton("Click me to increase");
        button2 = new JButton("Click me to decrease");
        button3 = new JButton("Click me to double");
        button4 = new JButton("Click me to reset");

        //add an action listener to each object
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(200, 300, 200, 300));
        panel.setLayout(new GridLayout(2,2));
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(label);
        

        //add panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        //set what happens when we close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set title of the window
        frame.setTitle("First thingy lol");
        //set the window to match a certain size
        frame.pack();
        //set the window to be visible
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            count++;
            updateText();
        } else if(e.getSource() == button2){
            count--;
            updateText();
        } else if(e.getSource() == button3){
            count *= 2;
            updateText();
        } else if(e.getSource() == button4){
            count = 0;
            updateText();
        }
    }

    public void updateText(){
        label.setText("Number of clicks: " + count);
    }
}