import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_practice
{
    public static void main(String[] args) {
        System.out.println("Client Started");
        try(Socket socket=new Socket("127.0.0.1",2222)) {
            System.out.println("Client Connecteed");
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ooi=new ObjectInputStream(socket.getInputStream());

            Scanner sc=new Scanner(System.in);
            String sms=sc.nextLine();
            oos.writeObject(sms);
            oos.flush();

            Object fromServer=ooi.readObject();

            System.out.println("From Server : "+(String)fromServer);
        } 
        catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

    }
}
