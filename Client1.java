import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 
{
    public static void main(String[] args) {
        System.out.println("Client Started");
        try (Socket socket = new Socket("127.0.0.1",2222)) 
        {
            System.out.println("Client Connected");
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
            
            Scanner sc=new Scanner(System.in);
            String smg=sc.nextLine();
            // send to server
            oos.writeObject(smg);

            //receive from server
            Object fromserver = ois.readObject();
            System.out.println("From Server: "+(String)fromserver);
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
