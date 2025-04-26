import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class practice extends Frame{

    public practice()
    {
        // Button button=new Button("Click me");
        // button.setBounds(150,50,100,40);
        // button.setBackground(Color.red);
        // button.setForeground(Color.white);
        // add(button);

        // Label label=new Label("Button");
        // label.setBounds(150,100,100,40);
        // label.setForeground(Color.blue);
        // add(label);

        TextArea textArea=new TextArea();
        textArea.setBounds(100,100,100,100);
        add(textArea);

        setSize(400,400);
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
        new practice();
    }
}
