package nl.veurink.responsive;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ResponsiveStrategy implements AnswerStrategy {
    private final AnswerStrategy answerStrategy;
    private DataInputStream input;
    private DataOutputStream out;

    public ResponsiveStrategy(AnswerStrategy answerStrategy) {
        this.answerStrategy = answerStrategy;
        // establish a connection
        try
        {
            Socket socket = new Socket("127.0.0.1", 5000);
            System.out.println("Connected");

            // get input from the socket
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        } catch(IOException u)
        {
            System.out.println(u);
        }
    }

    @Override
    public String getQuestion() {
        return answerStrategy.getQuestion();
    }

    @Override
    public String getAnswer(String question) {
        String answerString = "";
        try {
            out.writeUTF(question);
            answerString = input.readUTF();
        } catch (Exception e) {
            // Fallback option
            answerString = answerStrategy.getAnswer(question);
        }
        return answerString;
    }
}
