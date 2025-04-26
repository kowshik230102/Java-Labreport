import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TrafficSwing{
    public TrafficSwing() {
        JFrame jFrame=new JFrame("TrafficSwing");
        // Swing uses JFrame instead of Frame
        
        // Swing components have 'J' prefix
        JLabel label1 = new JLabel("", JLabel.CENTER);
        label1.setBounds(100, 50, 200, 60);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 16));

        JButton button1 = new JButton("Red");
        button1.setBounds(100, 150, 200, 60);
        button1.setBackground(Color.RED);
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button1.setFocusPainted(false); // Swing-specific improvement

        JLabel label2 = new JLabel("", JLabel.CENTER);
        label2.setBounds(100, 250, 200, 60);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 16));

        JButton button2 = new JButton("Yellow");
        button2.setBounds(100, 350, 200, 60);
        button2.setBackground(Color.YELLOW);
        button2.setForeground(Color.BLACK); // Better visibility on yellow
        button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button2.setFocusPainted(false);

        JLabel label3 = new JLabel("", JLabel.CENTER);
        label3.setBounds(100, 450, 200, 60);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 16));

        JButton button3 = new JButton("Green");
        button3.setBounds(100, 550, 200, 60);
        button3.setBackground(Color.GREEN);
        button3.setForeground(Color.BLACK); // Better visibility on green
        button3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button3.setFocusPainted(false);

        // Action listeners (same lambda syntax works in Swing)
        button1.addActionListener(e -> label1.setText("Stop"));
        button2.addActionListener(e -> label2.setText("Ready"));
        button3.addActionListener(e -> label3.setText("Go"));

        // Swing uses content pane for adding components
        jFrame.setLayout(null);
        jFrame.add(label1);
        jFrame.add(button1);
        jFrame.add(label2);
        jFrame.add(button2);
        jFrame.add(label3);
        jFrame.add(button3);

        jFrame.setSize(400, 700);
        
        // Swing has better window closing handling
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                jFrame.dispose();
            }
        });
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new TrafficSwing();
    }
}