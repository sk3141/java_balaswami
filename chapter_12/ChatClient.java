package chapter_12;
import java.util.*;
import java.net.*;
import java.io.*;

public class ChatClient {
  private static final String ServerAddress = "localhost";
  private static final int port = 12345;

  public static void main(String args[]) {
    try (Socket socket = new Socket(ServerAddress, port)) {
      System.out.println("Connected to Server");
      new Thread(new ReadMessageTask(socket)).start();

      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      InputStreamReader in = new InputStreamReader(socket.getInputStream());
      BufferedReader in_bf = new BufferedReader(in);
      BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
      String message;

      while ((message = consoleInput.readLine()) != null) {
        out.println(message);
      }
    }
    catch (IOException e) {
      System.out.println("Error connecting : " + e.getMessage());
    }
  }
}

class ReadMessageTask implements Runnable {
  private Socket socket;

  public ReadMessageTask(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
      String message;

      while ((message = in.readLine()) != null) {
        System.out.println(message);
      }
    }
    catch (IOException e) {
      System.out.println("Error Reading from server : " + e.getMessage());
    }
  }
}