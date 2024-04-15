import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel label1;
    private JLabel label2;
    private int count = 0;
    private int changes = 0;

    //constructor
    public GUI() {
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(2, 2, 30, 30));
        frame.add(panel);


        label1 = new JLabel("Value: " + count);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label1);
        label2 = new JLabel("Number of Changes: " + changes);
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);


        JButton b1 = new JButton("+1");
        JButton b2 = new JButton("-1");
        panel.add(b1);
        panel.add(b2);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1Press();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2Press();
            }
        });



        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    public void b1Press(){
        count ++;
        changes++;
        label1.setText("Value: " + count);
        label2.setText("Number of Changes: " + changes);
    }
    public void b2Press()
    {
        count --;
        changes++;
        label1.setText("Value: " + count);
        label2.setText("Number of Changes: " + changes);
    }
}