import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) 
    {
        try (ServerSocket serverSocket = new ServerSocket(2222)) 
        {
            System.out.println("Server Started");
            Socket socket=serverSocket.accept();
            System.out.println("Client Connected..");

            ObjectInputStream ois= new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos= new ObjectOutputStream(socket.getOutputStream());
       
            Object cMsg= ois.readObject();
            String serverMsg=(String)cMsg;
            serverMsg=serverMsg.toUpperCase();
            oos.writeObject(serverMsg);
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };

    }
}