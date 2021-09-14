package nl.veurink.responsive;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Magic8BallServer {
    //initialize socket and input stream
    private Socket socket;
    private ServerSocket server;
    private DataInputStream in;
    private DataOutputStream out;

    // constructor with port
    public Magic8BallServer(int port)
    {
        // starts server and waits for a connection
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");

            socket = server.accept();
            System.out.println("Client accepted");

            // takes input from the client socket
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            out = new DataOutputStream(socket.getOutputStream());

            Scanner myObj = new Scanner(System.in);
            String answer = "";

            // give answers to client until "Over" is sent from server operator
            while (!answer.equals("Over"))
            {
                try
                {
                    String line = in.readUTF();
                    System.out.println(line);

                    answer = myObj.nextLine();
                    out.writeUTF(answer);
                }
                catch(IOException i) {
                    System.out.println(i);
                    break;
                }
            }
            System.out.println("Closing connection");

            // close connection
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Magic8BallServer server = new Magic8BallServer(5000);
    }
}
