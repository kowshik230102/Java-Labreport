import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Trafic extends Frame{
    Trafic()
    {
        Label label1=new Label("",Label.CENTER);
        label1.setBounds(100,50,200,60);
        label1.setFont(new Font("Times New Roman",Font.BOLD,16));

        Button button1=new Button("Red");
        button1.setBounds(100,150,200,60);
        button1.setBackground(Color.RED);
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Times New Roman",Font.BOLD,14));

        Label label2=new Label("",Label.CENTER);
        label2.setBounds(100,250,200,60);
        label2.setFont(new Font("Times New Roman",Font.BOLD,16));

        Button button2=new Button("Yellow");
        button2.setBounds(100,350,200,60);
        button2.setBackground(Color.YELLOW);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Times New Roman",Font.BOLD,14));

        Label label3=new Label("",Label.CENTER);
        label3.setBounds(100,450,200,60);
        label3.setFont(new Font("Times New Roman",Font.BOLD,16));

        Button button3=new Button("Green");
        button3.setBounds(100,550,200,60);
        button3.setBackground(Color.GREEN);
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Times New Roman",Font.BOLD,14));

        // button1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e)
        //     {
        //         label1.setText("Stop");
        //     }
        // });
        // button2.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e)
        //     {
        //         label2.setText("Ready");
        //     }
        // });
        // button3.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e)
        //     {
        //         label3.setText("Go");
        //     }
        // });
        button1.addActionListener(e->label1.setText("Stop"));
        button2.addActionListener(e->label2.setText("Ready"));
        button3.addActionListener(e->label3.setText("Go"));


        add(label1);
        add(button1);
        add(label2);
        add(button2);
        add(label3);
        add(button3);

        setSize(400,700);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        
    }
    public static void main(String[] args) {
        new Trafic();
    }
}
