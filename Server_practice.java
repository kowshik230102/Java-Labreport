import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_practice {
    public static void main(String[] args) {
        System.out.println("Server Started ");
        try (ServerSocket serverSocket = new ServerSocket(2222)) {
            System.out.println("Client Connected ");
            Socket socket=serverSocket.accept();
            
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());

            String str=(String)ois.readObject();
            str=str.toUpperCase();

            oos.writeObject(str);
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.out.println("Exception Finding ");
        }

    }
}
